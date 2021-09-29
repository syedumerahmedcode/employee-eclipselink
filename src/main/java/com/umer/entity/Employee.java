package com.umer.entity;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Employee
 *
 */
@Entity
@Table(name = "emp")
public class Employee implements Serializable {
	
	private static final long serialVersionUID = 1L;
	

	@Id
	@Column(name = "ENO")
	private int eno;
	
	@Column(name = "ENAME")
	private String ename;
	
	@Column(name = "ESAL")
	private float esal;
	
	@Column(name = "EADDR")
	private String eaddr;
	
	

	public Employee() {
		super();
	}

	public int getEno() {
		return this.eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return this.ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public float getEsal() {
		return this.esal;
	}

	public void setEsal(float esal) {
		this.esal = esal;
	}

	public String getEaddr() {
		return this.eaddr;
	}

	public void setEaddr(String eaddr) {
		this.eaddr = eaddr;
	}

}
