package com.tnsif.hierachiecal;

public class RBI {
	private String Bankname;
	private String Branch;
	public RBI() {
		super();
	}
	public RBI(String bankname, String branch) {
		super();
		Bankname = bankname;
		Branch = branch;
	}
	public String getBankname() {
		return Bankname;
	}
	public void setBankname(String bankname) {
		Bankname = bankname;
	}
	public String getBranch() {
		return Branch;
	}
	public void setBranch(String branch) {
		Branch = branch;
	}

	
	

}
