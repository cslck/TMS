package com.csl.dao;

import java.util.List;

import com.csl.pojo.Projector;

public interface ProjectorDao {

	void insertProjector(Projector pj);//注册放映机信息
	
	List<Projector> searchProjectors();//所有放映机信息
	
	Projector searchProjectorById(int id);//id查询
	Projector searchProjectorByHid(int id);//h_id查询
	
	void updateProjector(Projector pj);//放映机信息更新
	
	void deleteProjectorById(int id);//id删除
	
}
