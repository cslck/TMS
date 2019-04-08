package com.csl.dao;

import java.util.List;

import com.csl.pojo.MovieHall;

public interface MovieHallDao {

	void insertHall(MovieHall hall);//注册影厅信息
	
	List<MovieHall> searchHalls();//所有影厅信息
	
	MovieHall searchHallById(int id);//id查询
	
	void updateHall(MovieHall hall);//影厅信息更新
	
	void deleteHallById(int id);//id删除
}
