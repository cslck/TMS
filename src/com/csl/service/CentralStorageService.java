package com.csl.service;

import java.util.List;

import com.csl.pojo.CentralStorage;

public interface CentralStorageService {

	void addCentralStorage(CentralStorage cs);//添加信息
	
	List<CentralStorage> queryCentralStorages();//所有信息
	
	CentralStorage queryCentralStorageById(int id);//id查询
	
	void updateAudioFrequency(CentralStorage cs);//信息更新
	
	void deleteCentralStorageById(int id);//id删除
}
