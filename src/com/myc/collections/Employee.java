package com.myc.collections;

public class Employee implements Comparable<Employee>{
	
	private int empno;
	private String ename;
	public Employee(int empno, String ename) {
		super();
		this.empno = empno;
		this.ename = ename;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee e = (Employee)obj;//class casting
		if(this.empno == e.getEmpno() && this.ename.equals(e.getEname())) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return empno;
	}
	
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		if(this.empno-o.getEmpno()==0) {
			return this.ename.compareTo(o.getEname());
		}
		return this.empno-o.getEmpno();
	}


}
