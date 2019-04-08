package com.csl.pojo;

public class Video {
	//IP视频输入信息
	private int v_id;
	private String v_url;//URL
	private String v_account;//登录账户
	private String v_password;//密码
	private int h_id;//影厅id
	private String status;
	public Video() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Video(int v_id, String v_url, String v_account, String v_password, int h_id, String status) {
		super();
		this.v_id = v_id;
		this.v_url = v_url;
		this.v_account = v_account;
		this.v_password = v_password;
		this.h_id = h_id;
		this.status = status;
	}
	public int getV_id() {
		return v_id;
	}
	public void setV_id(int v_id) {
		this.v_id = v_id;
	}
	public String getV_url() {
		return v_url;
	}
	public void setV_url(String v_url) {
		this.v_url = v_url;
	}
	public String getV_account() {
		return v_account;
	}
	public void setV_account(String v_account) {
		this.v_account = v_account;
	}
	public String getV_password() {
		return v_password;
	}
	public void setV_password(String v_password) {
		this.v_password = v_password;
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
		return "Video [v_id=" + v_id + ", v_url=" + v_url + ", v_account=" + v_account + ", v_password=" + v_password
				+ ", h_id=" + h_id + ", status=" + status + "]";
	}
	
	
}
