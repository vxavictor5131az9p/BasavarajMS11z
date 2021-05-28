# HDBRTS_Management_System
### Introduction
HDBRTS is a bus transit system which is the first BRTS branch in Karnataka named **"Chigari"**. 
This system is located between the cities Hubli-Dharwad to help passengers to travel between the cities. 
In this system there will be different types of buses like 200,201&100 where types have their implicit meaning and there is the capacity for the buses up to which it can take the passengers in. 
There are predefined stops between the cities to where passengers can travel through. 
There will be different types of passengers like passengers who have student bus pass, monthly bus pass or general passengers who are passengers. 
Passengers will be charged based on category for the ticket. There are different employees working for this system. 
The HDBRTS is even has an event called GreenBRTS where in which they plant a tree in twin cities every year due to the reduced number of plants in road widening between the cities.
Record of these events has to be maintained and can be manipulated whenever required. There is a need for such an application to maintain and manage the whole. 
The admins as a front end of the branch will manage the specific operations. Certain features of the system are also provided to use by the passenger being the user of the system.

### Problem Statement
To develop an application to monitor the whole HDBRTS system and manipulate records whenever necessary by using OOP principles with C++ and JAVA.

### List of Classes Identified
1. Company
2. Branch
3. Company Employee
4. Station
5. Green BRTS
6. Bus
7. Bus200
8. Bus201
9. Bus100
10. Entrance Mode
11. Ticket
12. SmartCard
13. Passenger
14. PasInfSys
15. Exception

### Design
The application is built based on the object oriented principles. The UML diagram represents the functionalities and overview of the system. 
The UML design for development of application JAVA slightly differs compared to CPP as there is no concept of pointers in JAVA.

**UML Class Diagram (CPP)**
![alt text](https://github.com/BasavarajMS11/HDBRTS_Management_System/blob/master/Image/Class_Diagram/CPP_UML_CLASS_DIAGRAM.JPG?raw=true)


**UML Class Diagram (JAVA)**
![alt text](https://github.com/BasavarajMS11/HDBRTS_Management_System/blob/master/Image/Class_Diagram/JAVA_UML_Class_Diagram.JPG?raw=true)



### Implementation details
The application prototype is implemented in both the languages CPP as well as JAVA. Initially the classes are designed based on the attributes and functionality dependency.
As JAVA and CPP supports bottom up design. The lower classes which are independent designed first later on the dependent one. And the reusability of code is ensured while designing through inheritance concept of OOP.

The implementation file in C++ can be found in CPP/main.cpp to run this one need to have compiler for C++ program to run.

The implementation files in JAVA can be found in JAVA/ directory. Ther are various files based on the classes and their functionalities. To start running succuesfully from scratch need to run JAVA/firstpage.java as it is the base for other classes.

**Login/Register**
![alt text](https://github.com/BasavarajMS11/HDBRTS_Management_System/blob/master/Image/login_reg.JPG?raw=true)

**Menu**
![alt text](https://github.com/BasavarajMS11/HDBRTS_Management_System/blob/master/Image/menu.JPG?raw=true)

**Employee Frame(Operations related to employee)**
![alt text](https://github.com/BasavarajMS11/HDBRTS_Management_System/blob/master/Image/emp.JPG?raw=true)

**Station**
![alt text](https://github.com/BasavarajMS11/HDBRTS_Management_System/blob/master/Image/station.JPG?raw=true)

**Passenger in Station**
![alt text](https://github.com/BasavarajMS11/HDBRTS_Management_System/blob/master/Image/pasinstation.JPG?raw=true)

**Bus(Bus100, Bus200 and Bus201)**
![alt text](https://github.com/BasavarajMS11/HDBRTS_Management_System/blob/master/Image/busoperations.JPG?raw=true)

**Bus(Bus100, Bus200 and Bus201)**
![alt text](https://github.com/BasavarajMS11/HDBRTS_Management_System/blob/master/Image/greenBRTS.JPG?raw=true)



