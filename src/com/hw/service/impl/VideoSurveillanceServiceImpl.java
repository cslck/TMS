package com.hw.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hw.dao.VideoSurveillanceDao;
import com.hw.pojo.VideoSurveillance;
import com.hw.service.VideoSurveillanceService;
@Service
@Transactional
public class VideoSurveillanceServiceImpl implements VideoSurveillanceService {

	@Autowired
	private VideoSurveillanceDao videoDao;
	public void addMediaBlock(VideoSurveillance video) {
		// TODO Auto-generated method stub
		videoDao.insertMediaBlock(video);
	}

	public List<VideoSurveillance> queryVideos() {
		// TODO Auto-generated method stub
		return videoDao.searchVideos();
	}

	public VideoSurveillance queryVideoById(int id) {
		// TODO Auto-generated method stub
		return videoDao.searchVideoById(id);
	}

	public void updateVideo(VideoSurveillance video) {
		// TODO Auto-generated method stub
		videoDao.updateVideo(video);
	}

	public void dropVideoById(int id) {
		// TODO Auto-generated method stub
		videoDao.deleteVideoById(id);
	}

	public VideoSurveillance queryVideoByHid(int id) {
		// TODO Auto-generated method stub
		return videoDao.searchVideoByHid(id);
	}

}
