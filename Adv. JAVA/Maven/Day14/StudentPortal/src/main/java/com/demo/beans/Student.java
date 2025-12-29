package com.demo.beans;

import java.sql.Date;
import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
//form action="/StudentPortal/student/updateStudent" method="post">
//Student Id : <input type="text" name="sid" id="sid" value=${stud.sid} readonly><br>
//Student Name :<input type="text" name="sname" id="sname" value=${stud.sname}><br>
//Email :<input type="email" id="email" name="email" value =${stud.email} ><br>
//DOB : <input type="date" id="date" name="date" value=${stud.dob}><br>
//Address : <input type="text" name="add" id="add" value=${stud.addr}><br>
//<button type="submit" name="btn" id="update" value="update">Update</button>
//</form>
public class Student {
	private int sid;
	private String sname;
	private String email;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate dob;
	private String addr;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int sid, String sname, String email, LocalDate dob, String addr, String password) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.email = email;
		this.dob = dob;
		this.addr = addr;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate date) {
		this.dob = date;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", email=" + email + ", dob=" + dob + ", addr=" + addr
				+ "]";
	}
	
	

}
