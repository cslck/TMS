package com.hw.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hw.dao.VideoDao;
import com.hw.pojo.Video;
import com.hw.service.VideoService;
@Service
@Transactional
public class VideoServiceImpl implements VideoService {

	@Autowired
	private VideoDao videoDao;
	public void addMediaBlock(Video video) {
		// TODO Auto-generated method stub
		videoDao.insertMediaBlock(video);
	}

	public List<Video> queryVideos() {
		// TODO Auto-generated method stub
		return videoDao.searchVideos();
	}

	public Video queryVideoById(int id) {
		// TODO Auto-generated method stub
		return videoDao.searchVideoById(id);
	}

	public void updateVideo(Video video) {
		// TODO Auto-generated method stub
		videoDao.updateVideo(video);
	}

	public void dropVideoById(int id) {
		// TODO Auto-generated method stub
		videoDao.deleteVideoById(id);
	}

	public Video queryVideoByHid(int id) {
		// TODO Auto-generated method stub
		return videoDao.searchVideoByHid(id);
	}

}
