package com.hw.dao;

import java.util.List;

import com.hw.pojo.VideoSurveillance;

public interface VideoSurveillanceDao {

	void insertVideo(VideoSurveillance video);//添加信息
	
	List<VideoSurveillance> searchVideos();//所有信息
	
	VideoSurveillance searchVideoById(int id);//id查询
	VideoSurveillance searchVideoByHid(int id);//h_id查询
	
	void updateVideo(VideoSurveillance video);//信息更新
	
	void deleteVideoById(int id);//id删除
}
