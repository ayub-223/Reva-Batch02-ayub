package com.tnsif.hierachiecal;

public class statebank extends RBI{
	private String customername;
	private long account_no;
	public statebank(String bankname, String branch) {
		super(bankname, branch);
	}
	public statebank(String bankname, String branch, String customername, long account_no) {
		super(bankname, branch);
		this.customername = customername;
		this.account_no = account_no;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public long getAccount_no() {
		return account_no;
	}
	public void setAccount_no(long account_no) {
		this.account_no = account_no;
	}
	@Override
	public String toString() {
		return "statebank [customername=" + customername + ", account_no=" + account_no + ", getBankname()="
				+ getBankname() + ", getBranch()=" + getBranch() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	
	
	

}
