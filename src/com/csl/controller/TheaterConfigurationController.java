package com.csl.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.csl.pojo.AjaxResult;
import com.csl.pojo.AudioFrequency;
import com.csl.pojo.MediaBlock;
import com.csl.pojo.MovieHall;
import com.csl.pojo.Projector;
import com.csl.pojo.Video;
import com.csl.service.AudioFrequencyService;
import com.csl.service.MediaBlockService;
import com.csl.service.MovieHallService;
import com.csl.service.ProjectorService;
import com.csl.service.VideoService;

@Controller
public class TheaterConfigurationController {

	@Autowired
	private AudioFrequencyService audioFrequencyService;
	
	@Autowired
	private MediaBlockService mediaBlockService;
	
	@Autowired
	private ProjectorService projectorService;
	
	@Autowired
	private VideoService videoService;
	
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
			Video vd = videoService.queryVideoByHid(ids);
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
	
	@RequestMapping("/queryHallInfo")//影厅配置信息
	@ResponseBody
	public AjaxResult allCentralStoragesAjax(HttpServletRequest req,int id) {
		HashMap<String, Object> data = new HashMap<String, Object>();
		try {
			Projector pj = projectorService.queryProjectorByHid(id);
			MediaBlock mb = mediaBlockService.queryMediaBlockByHid(id);
			Video video = videoService.queryVideoByHid(id);
			AudioFrequency af = audioFrequencyService.queryAudioFrequencyByHid(id);
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
	public AjaxResult queryProjector(HttpServletRequest req,int id) {
		HashMap<String, Object> data = new HashMap<String, Object>();
		try {
			Projector pj = projectorService.queryProjectorById(id);
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
	public AjaxResult addProjector(HttpServletRequest req,int id,Projector pro) {
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
	public AjaxResult delProjector(HttpServletRequest req,int id) {
		try {
			projectorService.dropProjectorById(id);
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
	public AjaxResult queryMB(HttpServletRequest req,int id) {
		HashMap<String, Object> data = new HashMap<String, Object>();
		try {
			MediaBlock mb = mediaBlockService.queryMediaBlockById(id);
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
	public AjaxResult addMB(HttpServletRequest req,int id,MediaBlock mb) {
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
	public AjaxResult delMB(HttpServletRequest req,int id) {
		try {
			mediaBlockService.dropMediaBlockById(id);
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
	public AjaxResult queryAF(HttpServletRequest req,int id) {
		HashMap<String, Object> data = new HashMap<String, Object>();
		try {
			AudioFrequency af = audioFrequencyService.queryAudioFrequencyById(id);
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
	public AjaxResult addAF(HttpServletRequest req,int id,AudioFrequency af) {
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
	public AjaxResult delAF(HttpServletRequest req,int id) {
		try {
			audioFrequencyService.dropAudioFrequencyById(id);
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
	public AjaxResult queryVideo(HttpServletRequest req,int id) {
		HashMap<String, Object> data = new HashMap<String, Object>();
		try {
			Video vi = videoService.queryVideoById(id);
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
	public AjaxResult addVideo(HttpServletRequest req,int id,Video vi) {
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
	public AjaxResult updateVideo(HttpServletRequest req,Video vi) {
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
	public AjaxResult delVideo(HttpServletRequest req,int id) {
		try {
			videoService.dropVideoById(id);
			return new AjaxResult(AjaxResult.SUCCESS, "success");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new AjaxResult(AjaxResult.SYSTEM_ERROR, "error");
		}
		
	}
}
