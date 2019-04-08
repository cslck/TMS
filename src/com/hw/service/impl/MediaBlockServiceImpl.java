package com.hw.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hw.dao.MediaBlockDao;
import com.hw.pojo.MediaBlock;
import com.hw.service.MediaBlockService;
@Service
@Transactional
public class MediaBlockServiceImpl implements MediaBlockService {

	@Autowired
	private MediaBlockDao mediaBlockDao;
	
	public void addMediaBlock(MediaBlock md) {
		// TODO Auto-generated method stub
		mediaBlockDao.insertMediaBlock(md);
	}

	public List<MediaBlock> queryMediaBlocks() {
		// TODO Auto-generated method stub
		return mediaBlockDao.searchMediaBlocks();
	}

	public MediaBlock queryMediaBlockById(int id) {
		// TODO Auto-generated method stub
		return mediaBlockDao.searchMediaBlockById(id);
	}

	public void updateMediaBlock(MediaBlock md) {
		// TODO Auto-generated method stub
		mediaBlockDao.updateMediaBlocky(md);
	}

	public void dropMediaBlockById(int id) {
		// TODO Auto-generated method stub
		mediaBlockDao.deleteMediaBlockById(id);
	}

	public MediaBlock queryMediaBlockByHid(int id) {
		// TODO Auto-generated method stub
		return mediaBlockDao.searchMediaBlockByHid(id);
	}

}
