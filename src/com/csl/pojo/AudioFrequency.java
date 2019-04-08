package com.csl.pojo;

public class AudioFrequency {
	//音频信息
	private int af_id;
	private String af_name;
	private String af_type;//类型
	private String af_account;//登录账户
	private String af_password;//密码
	private String af_url;//网址URL
	private String af_interface;//接口
	private int h_id;//影厅id
	private String status;
	public AudioFrequency() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AudioFrequency(int af_id, String af_name, String af_type, String af_account, String af_password,
			String af_url, String af_interface, int h_id, String status) {
		super();
		this.af_id = af_id;
		this.af_name = af_name;
		this.af_type = af_type;
		this.af_account = af_account;
		this.af_password = af_password;
		this.af_url = af_url;
		this.af_interface = af_interface;
		this.h_id = h_id;
		this.status = status;
	}
	public int getAf_id() {
		return af_id;
	}
	public void setAf_id(int af_id) {
		this.af_id = af_id;
	}
	public String getAf_name() {
		return af_name;
	}
	public void setAf_name(String af_name) {
		this.af_name = af_name;
	}
	public String getAf_type() {
		return af_type;
	}
	public void setAf_type(String af_type) {
		this.af_type = af_type;
	}
	public String getAf_account() {
		return af_account;
	}
	public void setAf_account(String af_account) {
		this.af_account = af_account;
	}
	public String getAf_password() {
		return af_password;
	}
	public void setAf_password(String af_password) {
		this.af_password = af_password;
	}
	public String getAf_url() {
		return af_url;
	}
	public void setAf_url(String af_url) {
		this.af_url = af_url;
	}
	public String getAf_interface() {
		return af_interface;
	}
	public void setAf_interface(String af_interface) {
		this.af_interface = af_interface;
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
		return "AudioFrequency [af_id=" + af_id + ", af_name=" + af_name + ", af_type=" + af_type + ", af_account="
				+ af_account + ", af_password=" + af_password + ", af_url=" + af_url + ", af_interface=" + af_interface
				+ ", h_id=" + h_id + ", status=" + status + "]";
	}
	
	
}
