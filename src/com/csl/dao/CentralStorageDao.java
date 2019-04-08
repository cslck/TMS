package com.csl.dao;

import java.util.List;

import com.csl.pojo.CentralStorage;

public interface CentralStorageDao {

	void insertCentralStorage(CentralStorage cs);//添加信息
	
	List<CentralStorage> searchCentralStorages();//所有信息
	
	CentralStorage searchCentralStorageById(int id);//id查询
	
	void updateCentralStorage(CentralStorage cs);//信息更新
	
	void deleteCentralStorageById(int id);//id删除
}
