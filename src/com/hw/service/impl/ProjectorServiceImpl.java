package com.hw.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hw.dao.ProjectorDao;
import com.hw.pojo.Projector;
import com.hw.service.ProjectorService;
@Service
@Transactional
public class ProjectorServiceImpl implements ProjectorService {

	@Autowired
	private ProjectorDao projectorDao;
	
	public void addProjector(Projector pj) {
		// TODO Auto-generated method stub
		projectorDao.insertProjector(pj);
	}

	public List<Projector> queryProjectors() {
		// TODO Auto-generated method stub
		return projectorDao.searchProjectors();
	}

	public Projector queryProjectorById(int id) {
		// TODO Auto-generated method stub
		return projectorDao.searchProjectorById(id);
	}

	public void updateProjector(Projector pj) {
		// TODO Auto-generated method stub
		projectorDao.updateProjector(pj);
	}

	public void dropProjectorById(int id) {
		// TODO Auto-generated method stub
		projectorDao.deleteProjectorById(id);
	}

	public Projector queryProjectorByHid(int id) {
		// TODO Auto-generated method stub
		return projectorDao.searchProjectorByHid(id);
	}

}
