# employee-eclipselink

## Table of content
- [Introduction](#introduction)
- [Out Of Scope](#out-of-scope)
- [Explanation EclipseLink](#explanation-eclipselink)
- [Explanation Database](#explanation-database)
- [Explanation System Design](#explanation-system-design)
- [Explanation Other important Points](#explanation-other-important-points)
- [Technologies Used](#technologies-used)
- [Prerequisities](#prerequisities)
- [Commands](#commands)
- [References](#references)
- [Contact Information](#contact-information)


## Introduction

- To be defined.

## Out Of Scope

- To be defined.


## Explanation EclipseLink

- To be defined. 


 
## Explanation Database

For database, MySql is used however, one can choose any other database. Since the focus is on understanding the dao pattern, one only table is created inside the database which keeps the records of the employees. The fields are: _id_, _first name_, _last name_, _username_, _password_, _address_ and _contact_. The primary key is _id_.

```sql
CREATE TABLE `employees`.`employee` (
`id` int(3) NOT NULL,
`first_name` varchar(20) DEFAULT NULL,
`last_name` varchar(20) DEFAULT NULL,
`username` varchar(250) DEFAULT NULL,
`password` varchar(20) DEFAULT NULL,
`address` varchar(45) DEFAULT NULL,
`contact` varchar(45) DEFAULT NULL,
PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
```
 
 

## Explanation System Design

- To be defined.

 
## Explanation Other Important Points

- To be defined. 



## Technologies Used

- Java 11
- [JavaEE](https://www.oracle.com/java/technologies/java-ee-glance.html): Java Platform, Enterprise Edition (Java EE) is the standard in community-driven enterprise software. Java EE is developed using the Java Community Process, with contributions from industry experts, commercial and open source organizations, Java User Groups, and countless individuals. Each release integrates new features that align with industry needs, improves application portability, and increases developer productivity.
- [MySQL](https://www.mysql.com/): MySQL is an open-source relational database management system (RDBMS) and MySQL has stand-alone clients that allow users to interact directly with a MySQL database using SQL, but more often, MySQL is used with other programs to implement applications that need relational database capability.
- [EclipseLink](https://www.eclipse.org/eclipselink/): Comprehensive open-source Java persistence solution addressing relational, XML, and database web services.

## Prerequisities

- To be defined.

## Commands

- To be defined.


## References

- [1](https://www.youtube.com/watch?v=o5YvVtfZhe8):  JPA with Eclipse Link Implementation(Youtube)
- [2](https://www.java-forum.org/thema/could-not-find-main-class-problem.130986/): "Could not find Main Class" Problem



## Contact Information

How to reach me? At [github specific gmail account](mailto:syedumerahmedcode@gmail.com?subject=%5BGitHub%5D%20Hello%20from%20Github). Additionally, you can reach me via [Linkedin](https://www.linkedin.com/in/syed-umer-ahmed-a346a746/) or at [Xing](https://www.xing.com/profile/SyedUmer_Ahmed/cv)






























Timestamp: 21:40