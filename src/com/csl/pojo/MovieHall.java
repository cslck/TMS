package com.csl.pojo;

public class MovieHall {
	//影厅信息
	private int h_id;
	private int h_number;//号码
	private String h_name;//名称
	private String h_cncnumber;//CNC号码
	private int seat;//座位
	private int duration;//中场休息时长
	private String comment;//注释
	private String status;
	public MovieHall() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MovieHall(int h_id, int h_number, String h_name, String h_cncnumber, int seat, int duration, String comment,
			String status) {
		super();
		this.h_id = h_id;
		this.h_number = h_number;
		this.h_name = h_name;
		this.h_cncnumber = h_cncnumber;
		this.seat = seat;
		this.duration = duration;
		this.comment = comment;
		this.status = status;
	}
	public int getH_id() {
		return h_id;
	}
	public void setH_id(int h_id) {
		this.h_id = h_id;
	}
	public int getH_number() {
		return h_number;
	}
	public void setH_number(int h_number) {
		this.h_number = h_number;
	}
	public String getH_name() {
		return h_name;
	}
	public void setH_name(String h_name) {
		this.h_name = h_name;
	}
	public String getH_cncnumber() {
		return h_cncnumber;
	}
	public void setH_cncnumber(String h_cncnumber) {
		this.h_cncnumber = h_cncnumber;
	}
	public int getSeat() {
		return seat;
	}
	public void setSeat(int seat) {
		this.seat = seat;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "MovieHall [h_id=" + h_id + ", h_number=" + h_number + ", h_name=" + h_name + ", h_cncnumber="
				+ h_cncnumber + ", seat=" + seat + ", duration=" + duration + ", comment=" + comment + ", status="
				+ status + "]";
	}
	
	
}
