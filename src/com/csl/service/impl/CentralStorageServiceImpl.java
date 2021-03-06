package com.csl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.csl.dao.CentralStorageDao;
import com.csl.pojo.CentralStorage;
import com.csl.service.CentralStorageService;
@Service
@Transactional
public class CentralStorageServiceImpl implements CentralStorageService {

	@Autowired
	private CentralStorageDao centralStorageDao;
	
	public void addCentralStorage(CentralStorage cs) {
		// TODO Auto-generated method stub
		centralStorageDao.insertCentralStorage(cs);
	}

	public List<CentralStorage> queryCentralStorages() {
		// TODO Auto-generated method stub
		return centralStorageDao.searchCentralStorages();
	}

	public CentralStorage queryCentralStorageById(int id) {
		// TODO Auto-generated method stub
		return centralStorageDao.searchCentralStorageById(id);
	}

	public void updateAudioFrequency(CentralStorage cs) {
		// TODO Auto-generated method stub
		centralStorageDao.updateCentralStorage(cs);
	}

	public void deleteCentralStorageById(int id) {
		// TODO Auto-generated method stub
		centralStorageDao.deleteCentralStorageById(id);
	}

}
