package com.hw.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hw.pojo.AjaxResult;
import com.hw.pojo.AudioFrequency;
import com.hw.pojo.MediaBlock;
import com.hw.pojo.MovieHall;
import com.hw.pojo.Projector;
import com.hw.pojo.VideoSurveillance;
import com.hw.service.AudioFrequencyService;
import com.hw.service.MediaBlockService;
import com.hw.service.MovieHallService;
import com.hw.service.ProjectorService;
import com.hw.service.VideoSurveillanceService;
@Controller
public class TheaterConfigurationController {

	@Autowired
	private AudioFrequencyService audioFrequencyService;
	
	@Autowired
	private MediaBlockService mediaBlockService;
	
	@Autowired
	private ProjectorService projectorService;
	
	@Autowired
	private VideoSurveillanceService videoService;
	
	@Autowired
	private MovieHallService movieHallService;
	
	@RequestMapping("/queryallHalls")//所有影厅
	@ResponseBody
	public AjaxResult allMovieHalls(HttpServletRequest req) {
		HashMap<String, Object> data = new HashMap<String, Object>();
		try {
			List<MovieHall> mh = movieHallService.queryHalls();
			int ids = mh.get(0).getH_id();
			Projector pj = projectorService.queryProjectorByHid(ids);
			MediaBlock mb = mediaBlockService.queryMediaBlockByHid(ids);
			VideoSurveillance vd = videoService.queryVideoByHid(ids);
			AudioFrequency af = audioFrequencyService.queryAudioFrequencyByHid(ids);
			data.put("pj", pj);
			data.put("mb", mb);
			data.put("vd", vd);
			data.put("af", af);
			data.put("mh", mh);
			return new AjaxResult(AjaxResult.SUCCESS, "success", data);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new AjaxResult(AjaxResult.SYSTEM_ERROR, "error");
		}
		
	}
	
	@RequestMapping("/queryHallInfo")//所有影厅信息
	@ResponseBody
	public AjaxResult allCentralStoragesAjax(HttpServletRequest req,Integer h_id) {
		HashMap<String, Object> data = new HashMap<String, Object>();
		try {
			Projector pj = projectorService.queryProjectorByHid(h_id);
			MediaBlock mb = mediaBlockService.queryMediaBlockByHid(h_id);
			VideoSurveillance video = videoService.queryVideoByHid(h_id);
			AudioFrequency af = audioFrequencyService.queryAudioFrequencyByHid(h_id);
			data.put("pj", pj);
			data.put("mb", mb);
			data.put("video", video);
			data.put("af", af);
			return new AjaxResult(AjaxResult.SUCCESS, "success", data);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new AjaxResult(AjaxResult.SYSTEM_ERROR, "error");
		}
		
	}
	
	/*
	 * 放映机操作：增加、编辑、删除
	 */
	@RequestMapping("/queryProjector")//ID查询放映机
	@ResponseBody
	public AjaxResult queryProjector(HttpServletRequest req,Integer p_id) {
		HashMap<String, Object> data = new HashMap<String, Object>();
		try {
			Projector pj = projectorService.queryProjectorById(p_id);
			data.put("pj", pj);
			return new AjaxResult(AjaxResult.SUCCESS, "success", data);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new AjaxResult(AjaxResult.SYSTEM_ERROR, "error");
		}
		
	}
	
	@RequestMapping("/addProjector")//添加放映机
	@ResponseBody
	public AjaxResult addProjector(HttpServletRequest req,Projector pro) {
		try {
			/*Projector pj = new Projector();
			pj.setP_id(pro.getP_id());
			pj.setP_account(pro.getP_account());
			
			pj.setH_id(id);*/
			projectorService.addProjector(pro);
			return new AjaxResult(AjaxResult.SUCCESS, "success");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new AjaxResult(AjaxResult.SYSTEM_ERROR, "error");
		}
		
	}
	@RequestMapping("/updateProjector")//更新放映机信息
	@ResponseBody
	public AjaxResult updateProjector(HttpServletRequest req,Projector pro) {
		try {
			projectorService.updateProjector(pro);
			return new AjaxResult(AjaxResult.SUCCESS, "success");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new AjaxResult(AjaxResult.SYSTEM_ERROR, "error");
		}
		
	}
	@RequestMapping("/delProjector")//删除放映机
	@ResponseBody
	public AjaxResult delProjector(HttpServletRequest req,Integer p_id) {
		try {
			projectorService.dropProjectorById(p_id);
			return new AjaxResult(AjaxResult.SUCCESS, "success");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new AjaxResult(AjaxResult.SYSTEM_ERROR, "error");
		}
		
	}
	
	/*
	 * 媒体块操作：增加、删除、编辑
	 */
	@RequestMapping("/queryMB")//ID查询媒体块
	@ResponseBody
	public AjaxResult queryMB(HttpServletRequest req,Integer mb_id) {
		HashMap<String, Object> data = new HashMap<String, Object>();
		try {
			MediaBlock mb = mediaBlockService.queryMediaBlockById(mb_id);
			data.put("mb", mb);
			return new AjaxResult(AjaxResult.SUCCESS, "success", data);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new AjaxResult(AjaxResult.SYSTEM_ERROR, "error");
		}
		
	}
	@RequestMapping("/addMB")//添加媒体块
	@ResponseBody
	public AjaxResult addMB(HttpServletRequest req,MediaBlock mb) {
		try {
			mediaBlockService.addMediaBlock(mb);
			return new AjaxResult(AjaxResult.SUCCESS, "success");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new AjaxResult(AjaxResult.SYSTEM_ERROR, "error");
		}
		
	}
	@RequestMapping("/updateMB")//更新媒体块信息
	@ResponseBody
	public AjaxResult updateMB(HttpServletRequest req,MediaBlock mb) {
		try {
			mediaBlockService.updateMediaBlock(mb);
			return new AjaxResult(AjaxResult.SUCCESS, "success");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new AjaxResult(AjaxResult.SYSTEM_ERROR, "error");
		}
		
	}
	@RequestMapping("/delMB")//删除媒体块
	@ResponseBody
	public AjaxResult delMB(HttpServletRequest req,Integer mb_id) {
		try {
			mediaBlockService.dropMediaBlockById(mb_id);
			return new AjaxResult(AjaxResult.SUCCESS, "success");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new AjaxResult(AjaxResult.SYSTEM_ERROR, "error");
		}
		
	}
	
	/*
	 * 音频处理器操作：增加、删除、编辑
	 */
	@RequestMapping("/queryAF")//ID查询音频
	@ResponseBody
	public AjaxResult queryAF(HttpServletRequest req,Integer af_id) {
		HashMap<String, Object> data = new HashMap<String, Object>();
		try {
			AudioFrequency af = audioFrequencyService.queryAudioFrequencyById(af_id);
			data.put("af", af);
			return new AjaxResult(AjaxResult.SUCCESS, "success", data);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new AjaxResult(AjaxResult.SYSTEM_ERROR, "error");
		}
		
	}
	@RequestMapping("/addAF")//添加音频
	@ResponseBody
	public AjaxResult addAF(HttpServletRequest req,AudioFrequency af) {
		try {
			audioFrequencyService.addAudioFrequency(af);
			return new AjaxResult(AjaxResult.SUCCESS, "success");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new AjaxResult(AjaxResult.SYSTEM_ERROR, "error");
		}
		
	}
	@RequestMapping("/updateAF")//更新音频信息
	@ResponseBody
	public AjaxResult updateAF(HttpServletRequest req,AudioFrequency af) {
		try {
			audioFrequencyService.updateAudioFrequency(af);
			return new AjaxResult(AjaxResult.SUCCESS, "success");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new AjaxResult(AjaxResult.SYSTEM_ERROR, "error");
		}
		
	}
	@RequestMapping("/delAF")//删除音频
	@ResponseBody
	public AjaxResult delAF(HttpServletRequest req,Integer af_id) {
		try {
			audioFrequencyService.dropAudioFrequencyById(af_id);
			return new AjaxResult(AjaxResult.SUCCESS, "success");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new AjaxResult(AjaxResult.SYSTEM_ERROR, "error");
		}
		
	}
	/*
	 * 视频输入操作：增加、删除、编辑
	 */
	@RequestMapping("/queryVideo")//ID查询视频
	@ResponseBody
	public AjaxResult queryVideo(HttpServletRequest req,Integer v_id) {
		HashMap<String, Object> data = new HashMap<String, Object>();
		try {
			VideoSurveillance vi = videoService.queryVideoById(v_id);
			data.put("vi", vi);
			return new AjaxResult(AjaxResult.SUCCESS, "success", data);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new AjaxResult(AjaxResult.SYSTEM_ERROR, "error");
		}
		
	}
	@RequestMapping("/addVideo")//添加视频
	@ResponseBody
	public AjaxResult addVideo(HttpServletRequest req,VideoSurveillance vi) {
		try {
			videoService.addMediaBlock(vi);
			return new AjaxResult(AjaxResult.SUCCESS, "success");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new AjaxResult(AjaxResult.SYSTEM_ERROR, "error");
		}
		
	}
	@RequestMapping("/updateVideo")//更新视频信息
	@ResponseBody
	public AjaxResult updateVideo(HttpServletRequest req,VideoSurveillance vi) {
		try {
			videoService.updateVideo(vi);
			return new AjaxResult(AjaxResult.SUCCESS, "success");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new AjaxResult(AjaxResult.SYSTEM_ERROR, "error");
		}
		
	}
	@RequestMapping("/delVideo")//删除视频
	@ResponseBody
	public AjaxResult delVideo(HttpServletRequest req,Integer v_id) {
		try {
			videoService.dropVideoById(v_id);
			return new AjaxResult(AjaxResult.SUCCESS, "success");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new AjaxResult(AjaxResult.SYSTEM_ERROR, "error");
		}
		
	}
}
