package com.csl.service;

import java.util.List;

import com.csl.pojo.Projector;

public interface ProjectorService {

	void addProjector(Projector pj);//注册影厅信息
	
	List<Projector> queryProjectors();//所有影厅信息
	
	Projector queryProjectorById(int id);//id查询
	Projector queryProjectorByHid(int id);//h_id查询
	
	void updateProjector(Projector pj);//影厅信息更新
	
	void dropProjectorById(int id);//id删除
}
