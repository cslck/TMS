package com.csl.service;

import java.util.List;

import com.csl.pojo.VideoSurveillance;

public interface VideoSurveillanceService {

	void addMediaBlock(VideoSurveillance video);//添加信息
	
	List<VideoSurveillance> queryVideos();//所有信息
	
	VideoSurveillance queryVideoById(int id);//id查询
	VideoSurveillance queryVideoByHid(int id);//h_id查询
	
	void updateVideo(VideoSurveillance video);//信息更新
	
	void dropVideoById(int id);//id删除
}
