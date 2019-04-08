package com.csl.dao;

import java.util.List;

import com.csl.pojo.Video;

public interface VideoDao {

	void insertMediaBlock(Video video);//添加信息
	
	List<Video> searchVideos();//所有信息
	
	Video searchVideoById(int id);//id查询
	Video searchVideoByHid(int id);//h_id查询
	
	void updateVideo(Video video);//信息更新
	
	void deleteVideoById(int id);//id删除
}
