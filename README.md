# LAN-EXAMINATION-SYSTEM
LAN EXAMINATION SYSTEM is a secured, scalable, and efficient platform to conduct the online exam in the LAN environment over the pen-paper way. 
It is a client-server-based project where the server module as an examiner is responsible for handling activities such as conducting exams, client authentication, and database management.
The client module is developed for the students with a graphical user interface(GUI), which will provide a secured online exam environment for students. It will be responsible for getting questionaries from the server and sending the responses from students back to the server.

## Technologies Used
- Used socket programming to connect server and client modules.
- Multithreading is used in the server module for creating a dedicated server handler instance for each client(student) request.
- The swing application framework is used to provide GUI.

## Intended User
This platform can be used by any organization that wants to organize examinations using LAN(Local area network). For example, this platform can be used for lab exams, university examinations.

## Future Scope:
- The user interface for the server can be added, providing the facility to customize the test.
- This project can be developed further to provide a facility to handle the large load by implementing a Load balancer.

# UI Sample Working:

Asking for credentials which should be already present in Student table of college’s database

![image](https://user-images.githubusercontent.com/53993210/168263254-518c4f2f-a606-4716-b21c-2f2d5be202e4.png)

Giving test:

![image](https://user-images.githubusercontent.com/53993210/168263361-1222a5b3-c063-443a-8ca5-3d8979b53222.png)


Showing result of the test to Student:


![image](https://user-images.githubusercontent.com/53993210/168263092-0cf6b57b-b9c5-4ad7-b589-c38b0eb46c76.png)



## To Get Started:
1. Please refer DBsetupQueries file and execute the queries written in it.
2. Update the credential for database connection



