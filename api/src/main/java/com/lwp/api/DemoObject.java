package com.lwp.api;

import java.io.Serializable;

public class DemoObject implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	private String Message;
	private double salary;
	
	public String getName() {
		return name;
	}
	public DemoObject setName(String name) {
		this.name = name;
		return this;
	}
	public String getMessage() {
		return Message;
	}
	public DemoObject setMessage(String message) {
		Message = message;
		return this;
	}
	public double getSalary() {
		return salary;
	}
	public DemoObject setSalary(double salary) {
		this.salary = salary;
		return this;
	}
	
	@Override
	public String toString() {
		return "[" + name + "]" +
                "[" + Message + "]" +
                "[" + salary + "]";
	}
	
}
