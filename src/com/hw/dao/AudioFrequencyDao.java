package com.hw.dao;

import java.util.List;

import com.hw.pojo.AudioFrequency;

public interface AudioFrequencyDao {

	void insertAudioFrequency(AudioFrequency af);//添加信息
	
	List<AudioFrequency> searchAudioFrequencys();//所有信息
	
	AudioFrequency searchAudioFrequencyById(int id);//id查询
	AudioFrequency searchAudioFrequencyByHid(int id);//h_id查询
	
	void updateAudioFrequency(AudioFrequency af);//信息更新
	
	void deleteAudioFrequencyById(int id);//id删除
}
