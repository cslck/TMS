package com.hw.service;

import java.util.List;

import com.hw.pojo.MovieHall;

public interface MovieHallService {

	void addHall(MovieHall hall);//注册影厅信息
	
	List<MovieHall> queryHalls();//所有影厅信息
	
	MovieHall queryHallById(int id);//id查询
	
	void updateHall(MovieHall hall);//影厅信息更新
	
	void deleteHallById(int id);//id删除
}
