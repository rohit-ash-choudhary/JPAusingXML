package com.sp.entity;

public class Account {
	private int account_num;
	private String first_name;
	private String last_name;
	private Long account_balance;
	private String city;
	public int getAccount_num() {
		return account_num;
	}
	public void setAccount_num(int account_num) {
		this.account_num = account_num;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public Long getAccount_balance() {
		return account_balance;
	}
	public void setAccount_balance(Long account_balance) {
		this.account_balance = account_balance;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}
