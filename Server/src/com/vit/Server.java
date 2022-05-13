package com.vit;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLException;

public class Server {

    public static void main(String[] args) {
        try {
            int port = 5555;
            ServerSocket ss = new ServerSocket(5555);
            System.out.println("Server started successfully.");
            while (true) {
                Socket s = ss.accept();//establishes connection
                System.out.println("Network is established between client and server...");
                String u, pass = "";
                int ID;
                DataInputStream in = new DataInputStream(s.getInputStream());
                DataOutputStream out = new DataOutputStream(s.getOutputStream());
                u = in.readUTF();

                pass = in.readUTF();
                Database db = new Database();

                ID = db.isvaliduser(u, pass);
                if (ID != 0) {
                    out.writeUTF("TEST START");
                    /* Create at thread for each student/ client. */
                    ServerWorker worker = new ServerWorker(s, db, ID);
                    System.out.println("going into worker");
                    worker.start();
                } else {
                    System.out.println("in else");
                    out.writeUTF("ABORT");
                    out.flush();
                    db.con.close();
                    in.close();
                    out.close();
                    s.close();
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
