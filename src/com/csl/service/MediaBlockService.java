package com.csl.service;

import java.util.List;

import com.csl.pojo.MediaBlock;

public interface MediaBlockService {

	void addMediaBlock(MediaBlock md);//添加信息
	
	List<MediaBlock> queryMediaBlocks();//所有信息
	
	MediaBlock queryMediaBlockById(int id);//id查询
	MediaBlock queryMediaBlockByHid(int id);//h_id查询
	
	void updateMediaBlock(MediaBlock md);//信息更新
	
	void dropMediaBlockById(int id);//id删除
}
