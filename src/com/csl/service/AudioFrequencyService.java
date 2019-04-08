package com.csl.service;

import java.util.List;

import com.csl.pojo.AudioFrequency;

public interface AudioFrequencyService {

	void addAudioFrequency(AudioFrequency af);//添加信息
	
	List<AudioFrequency> queryAudioFrequencys();//所有信息
	
	AudioFrequency queryAudioFrequencyById(int id);//id查询
	AudioFrequency queryAudioFrequencyByHid(int id);//h_id查询
	
	void updateAudioFrequency(AudioFrequency af);//信息更新
	
	void dropAudioFrequencyById(int id);//id删除
}
