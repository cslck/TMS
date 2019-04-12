package com.hw.pojo;

public class Projector { 
	//放映机信息
	private int p_id;
	private String p_name;
	private String p_account;//登录账户
	private String p_password;//密码
	private String p_url;//URL
	private String p_interface;//接口
	private int h_id;//影厅id
	private String status;
	public Projector() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Projector(int p_id, String p_name, String p_account, String p_password, String p_url, String p_interface,
			int h_id, String status) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.p_account = p_account;
		this.p_password = p_password;
		this.p_url = p_url;
		this.p_interface = p_interface;
		this.h_id = h_id;
		this.status = status;
	}
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public String getP_account() {
		return p_account;
	}
	public void setP_account(String p_account) {
		this.p_account = p_account;
	}
	public String getP_password() {
		return p_password;
	}
	public void setP_password(String p_password) {
		this.p_password = p_password;
	}
	public String getP_url() {
		return p_url;
	}
	public void setP_url(String p_url) {
		this.p_url = p_url;
	}
	public String getP_interface() {
		return p_interface;
	}
	public void setP_interface(String p_interface) {
		this.p_interface = p_interface;
	}
	public int getH_id() {
		return h_id;
	}
	public void setH_id(int h_id) {
		this.h_id = h_id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Projector [p_id=" + p_id + ", p_name=" + p_name + ", p_account=" + p_account + ", p_password="
				+ p_password + ", p_url=" + p_url + ", p_interface=" + p_interface + ", h_id=" + h_id + ", status="
				+ status + "]";
	}
	
	
}
