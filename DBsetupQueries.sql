create database VitDb;
use VitDb;

CREATE TABLE STUDENT (ID INT,USERNAME VARCHAR(255),PASSWORD VARCHAR(255), MARKS INT,PRIMARY KEY(ID));
INSERT INTO Student VALUES(1,'AKANKSHA','AP123',0);
INSERT INTO Student VALUES(2,'XYZ','X123',0);

CREATE TABLE QUESTION (QUESNO INT,QUESTION VARCHAR(255),OPTION1 VARCHAR(255), OPTION2 VARCHAR(255), OPTION3 VARCHAR(255), OPTION4 VARCHAR(255),ANSWER VARCHAR(2),PRIMARY KEY(QUESNO));

Insert INTO Question values(1, 'Which of the following is not a type of inheritance?','Multiple','Hierarchical','Multilevel','Distributive','d');
Insert INTO Question values(2, 'What is size of empty class?','0 byte','1 byte','4 bytes','Can not create empty class','b'); 
Insert INTO Question values(3, 'Which of the following functions must use reference?','Copy Constructor','assignment operator function','Destructor','Parametrized constructor','a');
Insert INTO Question values(4, 'Which pointer must get type casted?','NULL pointer','base class pointer','Child class pointer','Void pointer','d');
Insert INTO Question values(5, 'Which type of class cannot be instantiated?','Abstract class ','Inner class','Anonymous inner class','All of the above','a');
Insert INTO Question values(6, 'Which concept is used to implement late binding?','Virtual functions','Operator functions','Constant functions','Static functions','a');
Insert INTO Question values(7, 'Which of the following is correct?','C++ allows static type checking','C++ allows dynamic type checking.','C++ allows static member function to be of type const.','C++ allows both static and dynamic type checking','d');
Insert INTO Question values(8, 'Which members are inherited but are not accessible in any case?','Public','Protected','Private','default','c');
Insert INTO Question values(9, 'Which of the following is a static polymorphism mechanism?','Function overloading',' Operator overloading','Templates','All of the mentioned','d');
Insert INTO Question values(10, 'Can we create virtual constructor?','YES','NO','Can not determine','NONE','b'); 
