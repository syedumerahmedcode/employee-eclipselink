package com.umer.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.umer.entity.Employee;

public class TestService {

	private static final String PERSISTENCE_UNIT_NAME = "employee";

	public static void main(String[] args) throws Exception {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		EntityManager entityManager=entityManagerFactory.createEntityManager(); 
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		
		int employeeId=2;
		Employee employee = createEmployeeToStoreInTheDatabase(employeeId);
		
		entityManager.persist(employee);
		
		entityTransaction.commit();
		System.out.println("Employee added successfully");
		
		findExistingEmployees(entityManager, employeeId);
		
		entityManager.close();
	}

	private static void findExistingEmployees(EntityManager entityManager, int id) {
		Employee existingEmployee=entityManager.find(Employee.class, id);
		System.out.println("Found the following details");
		System.out.println("----------------------------");
		System.out.println("Employee number                :" + existingEmployee.getId());
		System.out.println("Employee First_name            :" + existingEmployee.getFirst_name());
		System.out.println("Employee Last_name             :" + existingEmployee.getLast_name());
		System.out.println("Employee username              :" + existingEmployee.getUsername());
		System.out.println("Employee password              :" + existingEmployee.getPassword());
		System.out.println("Employee Address               :" + existingEmployee.getAddress());
		System.out.println("Employee Contact               :" + existingEmployee.getContact());		
		System.out.println("----------------------------");
	}

	private static Employee createEmployeeToStoreInTheDatabase(int id) {
		Employee employee=new Employee();
		employee.setId(id);
		employee.setFirst_name("firstName");
		employee.setLast_name("lastName");
		employee.setUsername("username");
		employee.setPassword("password");
		employee.setAddress("address");
		employee.setContact("contact");
		return employee;
	}
}
