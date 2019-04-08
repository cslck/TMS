package com.hw.pojo;

public class MediaBlock {
	//媒体块信息
	private int mb_id;
	private String mb_name;
	private String mb_type;//类型
	private String mb_sequence;//序列号
	private String mtas;//Max. transfers as source
	private String myad;//Max. transfers as destination
	private String management_account;//管理登录账户
	private String management_password;//管理密码
	private String management_url;//管理URL
	private String management_interface;//管理接口
	private String file_account;//文件管理里登录账户
	private String file_password;//文件管理密码
	private String file_url;//文件管理URL
	private String file_interface;//文件管理接口
	private int h_id;//影厅id
	private String status;
	public MediaBlock() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MediaBlock(int mb_id, String mb_name, String mb_type, String mb_sequence, String mtas, String myad,
			String management_account, String management_password, String management_url, String management_interface,
			String file_account, String file_password, String file_url, String file_interface, int h_id,
			String status) {
		super();
		this.mb_id = mb_id;
		this.mb_name = mb_name;
		this.mb_type = mb_type;
		this.mb_sequence = mb_sequence;
		this.mtas = mtas;
		this.myad = myad;
		this.management_account = management_account;
		this.management_password = management_password;
		this.management_url = management_url;
		this.management_interface = management_interface;
		this.file_account = file_account;
		this.file_password = file_password;
		this.file_url = file_url;
		this.file_interface = file_interface;
		this.h_id = h_id;
		this.status = status;
	}
	public int getMb_id() {
		return mb_id;
	}
	public void setMb_id(int mb_id) {
		this.mb_id = mb_id;
	}
	public String getMb_name() {
		return mb_name;
	}
	public void setMb_name(String mb_name) {
		this.mb_name = mb_name;
	}
	public String getMb_type() {
		return mb_type;
	}
	public void setMb_type(String mb_type) {
		this.mb_type = mb_type;
	}
	public String getMb_sequence() {
		return mb_sequence;
	}
	public void setMb_sequence(String mb_sequence) {
		this.mb_sequence = mb_sequence;
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
	public String getManagement_account() {
		return management_account;
	}
	public void setManagement_account(String management_account) {
		this.management_account = management_account;
	}
	public String getManagement_password() {
		return management_password;
	}
	public void setManagement_password(String management_password) {
		this.management_password = management_password;
	}
	public String getManagement_url() {
		return management_url;
	}
	public void setManagement_url(String management_url) {
		this.management_url = management_url;
	}
	public String getManagement_interface() {
		return management_interface;
	}
	public void setManagement_interface(String management_interface) {
		this.management_interface = management_interface;
	}
	public String getFile_account() {
		return file_account;
	}
	public void setFile_account(String file_account) {
		this.file_account = file_account;
	}
	public String getFile_password() {
		return file_password;
	}
	public void setFile_password(String file_password) {
		this.file_password = file_password;
	}
	public String getFile_url() {
		return file_url;
	}
	public void setFile_url(String file_url) {
		this.file_url = file_url;
	}
	public String getFile_interface() {
		return file_interface;
	}
	public void setFile_interface(String file_interface) {
		this.file_interface = file_interface;
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
	
	
}
