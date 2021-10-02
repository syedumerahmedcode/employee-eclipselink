# employee-eclipselink

## Table of content
- [Introduction](#introduction)
- [Out Of Scope](#out-of-scope)
- [Explanation EclipseLink](#explanation-eclipselink)
- [Explanation EntityManager](#explanation-entitymanager)
- [Explanation Database](#explanation-database)
- [Explanation System Design](#explanation-system-design)
- [Explanation Other important Points](#explanation-other-important-points)
- [Technologies Used](#technologies-used)
- [Prerequisities](#prerequisities)
- [Commands](#commands)
- [References](#references)
- [Contact Information](#contact-information)


## Introduction

This project contains an application for employee registration which uses JavaEE and uses EclipseLink to register information of the employee in the database. The main focus of the project is understand what EclipseLink is and how to use it within JavaEE eco system. The main emphasis is given on _EntityManagerFactory_  and _EntityManager_ interface as well as _EntityTransaction_ and how to use it. For this purpose, a simple JPA Project is created.

## Out Of Scope

Since the idea of this project is to understand EclipseLink and specifically how EntityManager works, front-end is ignored. Similarly, no tests are written.  


## Explanation EclipseLink

Eclipselink builds high performance applications that store persistent object-oriented data in a relational database. It is used to design, implement, deploy and optimize an advanced object-persistant and object.transformation layer that supports a variety of data sources and formats, including the following: 

- Relational ---- for transactional persistence of Java Objects to a relational database  using JDBC
- Object-Relational data type ---- for transactional persistence of java objects to special purpose data source representations optimized for storage in  object-relational data type databases such as Oracle Database, MySQL, Postgres, MS SQL Server etc.
- Enterprise information system (EIS) ---for transactional persistence of Java objects to a nonrelational data source accessed using a Java EE Connector architecture (JCA) adapter, and any supported EIS record type, including indexed, mapped, or XML.
- XML ---- for nontransactional, nonpersistent (in-memory) conversion between Java objects and XML Schema Document (XSD)-based XML documents using Java Architecture for XML Binding (JAXB).

The following diagram depicts the Eclipselink Runtime Architecture:

![EclipseLinkRuntimeArchitectureOnWhiteboard](https://github.com/syedumerahmedcode/employee-eclipselink/tree/master/src/main/resources/EclipseLinkRuntimeArchitectureOnWhiteboard.jpeg)



## Explanation EntityManager

An entity manager is used to interact with the persistence context. An entity manager is used to read, delete and write an entity. The Entity Manager API is used 

- to create and  remove persistent entity instances, 
- to find entities by their primary key, and
- to query over entities. 

A **Persistence Context** is a setg of entity instances in which there is a unique entity instance for any persistent entity identity. Within the persistence context, the entity instance and their life cycles are managed. 


 
## Explanation Database

For database, MySql is used however, one can choose any other database. Since the focus is on understanding the Eclipselink in general and EntityManager in particular, one only table is created inside the database which keeps the records of the employees. The fields are: _id_, _first name_, _last name_, _username_, _password_, _address_ and _contact_. The primary key is _id_.

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
- [3](https://www.eclipse.org/eclipselink/documentation/3.0/concepts/toc.htm): Understanding EclipseLink, 3.0 **(Official Documentation)**
- [4](https://www.eclipse.org/eclipselink/documentation/3.0/solutions/toc.htm): EclipseLink Solutions Guide for EclipseLink Release 3.0 **(Official Documentation)**
- [5](https://www.eclipse.org/eclipselink/documentation/3.0/jpa/extensions/toc.htm): Jakarta Persistence API (JPA) Extensions Reference for EclipseLink, Release 3.0 **(Official Documentation)**
- [6](https://www.eclipse.org/eclipselink/documentation/3.0/moxy/toc.htm): Developing JAXB Applications Using EclipseLink MOXy, Release 3.0 **(Official Documentation)**
- [7](https://www.eclipse.org/eclipselink/documentation/3.0/concepts/nosql.htm): Understanding EclipseLink, 3.0 **(Official Documentation)**
- [8](https://www.eclipse.org/eclipselink/documentation/3.0/dbws/toc.htm): Developing Persistence Architectures Using EclipseLink Database Web Services
Release 3.0 **(Official Documentation)**
- [9](https://wiki.eclipse.org/EclipseLink/Examples/JPA/EMAPI): This document demonstrates EclipseLink’s support for the JPA specification, specifically the usage of the EntityManager API **(Official Documentation with examples)**
- [10](https://wiki.eclipse.org/Introduction_to_EclipseLink_(ELUG)): Introduction to EclipseLink (ELUG)

## Contact Information

How to reach me? At [github specific gmail account](mailto:syedumerahmedcode@gmail.com?subject=%5BGitHub%5D%20Hello%20from%20Github). Additionally, you can reach me via [Linkedin](https://www.linkedin.com/in/syed-umer-ahmed-a346a746/) or at [Xing](https://www.xing.com/profile/SyedUmer_Ahmed/cv)




