package com.hw.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hw.dao.MovieHallDao;
import com.hw.pojo.MovieHall;
import com.hw.service.MovieHallService;
@Service
@Transactional
public class MovieHallServiceImpl implements MovieHallService {

	@Autowired
	private MovieHallDao movieHallDao;
	
	public void addHall(MovieHall hall) {
		// TODO Auto-generated method stub
		movieHallDao.insertHall(hall);
	}

	public List<MovieHall> queryHalls() {
		// TODO Auto-generated method stub
		return movieHallDao.searchHalls();
	}

	public MovieHall queryHallById(int id) {
		// TODO Auto-generated method stub
		return movieHallDao.searchHallById(id);
	}

	public void updateHall(MovieHall hall) {
		// TODO Auto-generated method stub
		movieHallDao.updateHall(hall);
	}

	public void deleteHallById(int id) {
		// TODO Auto-generated method stub
		movieHallDao.deleteHallById(id);
	}

}
