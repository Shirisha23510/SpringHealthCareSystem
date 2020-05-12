package com.cg.demo.bean;

import java.util.List;

public class SBU1 {
	private int sbuCode;
	private String sbuName;
	private String sbuHead;
	private List<Employee2> emplist;
	public int getSbuCode() {
		return sbuCode;
	}
	public void setSbuCode(int sbuCode) {
		this.sbuCode = sbuCode;
	}
	public String getSbuName() {
		return sbuName;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	public String getSbuHead() {
		return sbuHead;
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	public List<Employee2> getEmplist() {
		return emplist;
	}
	public void setEmplist(List<Employee2> emplist) {
		this.emplist = emplist;
	}
}
