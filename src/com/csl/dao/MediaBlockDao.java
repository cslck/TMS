package com.csl.dao;

import java.util.List;

import com.csl.pojo.MediaBlock;

public interface MediaBlockDao {

	void insertMediaBlock(MediaBlock md);//添加信息
	
	List<MediaBlock> searchMediaBlocks();//所有信息
	
	MediaBlock searchMediaBlockById(int id);//id查询
	MediaBlock searchMediaBlockByHid(int id);//h_id查询
	
	void updateMediaBlocky(MediaBlock md);//信息更新
	
	void deleteMediaBlockById(int id);//id删除
}
