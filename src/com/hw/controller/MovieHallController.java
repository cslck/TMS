package com.hw.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hw.pojo.MovieHall;
import com.hw.service.MovieHallService;

@Controller
public class MovieHallController {

	protected final Log logger = LogFactory.getLog(this.getClass());
	@Autowired
	private MovieHallService movieHallService;
	
	@RequestMapping("/allHalls")//所有影厅信息
	@ResponseBody
	public List<MovieHall> allMovieHalls(HttpServletRequest req,HttpSession session) {
		//User user = (User)session.getAttribute("user");
		try {
			List<MovieHall> mh = movieHallService.queryHalls();
			logger.info("用户：admin,操作：查询所有影厅信息"+mh);
			return mh;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
		
	}
	
	@RequestMapping("/addHall")//添加影厅
	@ResponseBody
	public String addMovieHall(HttpServletRequest req,MovieHall hall) {
		logger.info("用户：admin,操作：添加影厅信息"+hall);
		try {
			movieHallService.addHall(hall);
			return "okay";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "false";
		}
		
	}
	@RequestMapping("/queryHall")//查询影厅ID
	@ResponseBody
	public MovieHall queryMovieHall(HttpServletRequest req,Integer h_id) {
		try {
			MovieHall mh = movieHallService.queryHallById(h_id);
			logger.info("用户：admin,操作：ID查询影厅信息"+mh);
			return mh;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
		
	}
	@RequestMapping("/updateHall")//更新影厅信息
	@ResponseBody
	public String updateMovieHall(HttpServletRequest req,MovieHall hall) {
		logger.info("用户：admin,操作：更新影厅信息"+hall);
		try {
			movieHallService.updateHall(hall);
			return "okay";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "false";
		}
		
	}
	@RequestMapping("/dropHall")//删除影厅ID
	@ResponseBody
	public String dropMovieHall(HttpServletRequest req,Integer h_id) {
		logger.info("用户：admin,操作：ID删除影厅信息"+h_id);
		try {
			movieHallService.deleteHallById(h_id);
			return "okay";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "false";
		}
		
	}
	
}
