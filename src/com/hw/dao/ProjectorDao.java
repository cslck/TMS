package com.hw.dao;

import java.util.List;

import com.hw.pojo.Projector;

public interface ProjectorDao {

	void insertProjector(Projector pj);//注册影厅信息
	
	List<Projector> searchProjectors();//所有影厅信息
	
	Projector searchProjectorById(int id);//id查询
	Projector searchProjectorByHid(int id);//h_id查询
	
	void updateProjector(Projector pj);//影厅信息更新
	
	void deleteProjectorById(int id);//id删除
	
}
