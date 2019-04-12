package com.hw.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hw.dao.CentralStorageDao;
import com.hw.pojo.CentralStorage;
import com.hw.service.CentralStorageService;
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

	public void updateCentralStorage(CentralStorage cs) {
		// TODO Auto-generated method stub
		centralStorageDao.updateCentralStorage(cs);
	}

	public void deleteCentralStorageById(int id) {
		// TODO Auto-generated method stub
		centralStorageDao.deleteCentralStorageById(id);
	}

}
