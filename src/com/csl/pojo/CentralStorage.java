package com.csl.pojo;

public class CentralStorage {
	//中央存储
	private int cs_id;
	private String cs_name;
	private String mtas;//Max. transfers as source
	private String myad;//Max. transfers as destination
	private String cs_account;//登录账户
	private String cs_password;//密码
	private String cs_url;//URL
	private String cs_interface;//接口
	private String uft;//use FXP Transfers
	private String status;
	public CentralStorage() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CentralStorage(int cs_id, String cs_name, String mtas, String myad, String cs_account, String cs_password,
			String cs_url, String cs_interface, String uft, String status) {
		super();
		this.cs_id = cs_id;
		this.cs_name = cs_name;
		this.mtas = mtas;
		this.myad = myad;
		this.cs_account = cs_account;
		this.cs_password = cs_password;
		this.cs_url = cs_url;
		this.cs_interface = cs_interface;
		this.uft = uft;
		this.status = status;
	}
	public int getCs_id() {
		return cs_id;
	}
	public void setCs_id(int cs_id) {
		this.cs_id = cs_id;
	}
	public String getCs_name() {
		return cs_name;
	}
	public void setCs_name(String cs_name) {
		this.cs_name = cs_name;
	}
	public String getMtas() {
		return mtas;
	}
	public void setMtas(String mtas) {
		this.mtas = mtas;
	}
	public String getMyad() {
		return myad;
	}
	public void setMyad(String myad) {
		this.myad = myad;
	}
	public String getCs_account() {
		return cs_account;
	}
	public void setCs_account(String cs_account) {
		this.cs_account = cs_account;
	}
	public String getCs_password() {
		return cs_password;
	}
	public void setCs_password(String cs_password) {
		this.cs_password = cs_password;
	}
	public String getCs_url() {
		return cs_url;
	}
	public void setCs_url(String cs_url) {
		this.cs_url = cs_url;
	}
	public String getCs_interface() {
		return cs_interface;
	}
	public void setCs_interface(String cs_interface) {
		this.cs_interface = cs_interface;
	}
	public String getUft() {
		return uft;
	}
	public void setUft(String uft) {
		this.uft = uft;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}