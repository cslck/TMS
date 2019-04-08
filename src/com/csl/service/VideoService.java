package com.csl.service;

import java.util.List;

import com.csl.pojo.Video;

public interface VideoService {

	void addMediaBlock(Video video);//添加信息
	
	List<Video> queryVideos();//所有信息
	
	Video queryVideoById(int id);//id查询
	Video queryVideoByHid(int id);//h_id查询
	
	void updateVideo(Video video);//信息更新
	
	void dropVideoById(int id);//id删除
}
