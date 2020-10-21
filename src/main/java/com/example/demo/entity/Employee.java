package com.example.demo.entity;

public class Employee {
private int eid;
private String ename;
private double eSal;
@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", eSal=" + eSal + "]";
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public double geteSal() {
	return eSal;
}
public void seteSal(double eSal) {
	this.eSal = eSal;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
	System.out.println("Employee.Employee()");
}

}
