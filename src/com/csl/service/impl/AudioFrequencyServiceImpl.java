package com.csl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.csl.dao.AudioFrequencyDao;
import com.csl.pojo.AudioFrequency;
import com.csl.service.AudioFrequencyService;
@Service
@Transactional
public class AudioFrequencyServiceImpl implements AudioFrequencyService {

	@Autowired
	private AudioFrequencyDao audioFrequencyDao;
	public void addAudioFrequency(AudioFrequency af) {
		// TODO Auto-generated method stub
		audioFrequencyDao.insertAudioFrequency(af);
	}

	public List<AudioFrequency> queryAudioFrequencys() {
		// TODO Auto-generated method stub
		return audioFrequencyDao.searchAudioFrequencys();
	}

	public AudioFrequency queryAudioFrequencyById(int id) {
		// TODO Auto-generated method stub
		return audioFrequencyDao.searchAudioFrequencyById(id);
	}

	public void updateAudioFrequency(AudioFrequency af) {
		// TODO Auto-generated method stub
		audioFrequencyDao.updateAudioFrequency(af);
	}

	public void dropAudioFrequencyById(int id) {
		// TODO Auto-generated method stub
		audioFrequencyDao.deleteAudioFrequencyById(id);
	}

	public AudioFrequency queryAudioFrequencyByHid(int id) {
		// TODO Auto-generated method stub
		return audioFrequencyDao.searchAudioFrequencyByHid(id);
	}

}
