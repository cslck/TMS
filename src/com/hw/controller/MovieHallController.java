package com.hw.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hw.pojo.MovieHall;
import com.hw.service.MovieHallService;

@Controller
public class MovieHallController {

	@Autowired
	private MovieHallService movieHallService;
	
	@RequestMapping("/allHalls")//所有影厅信息
	@ResponseBody
	public List<MovieHall> allMovieHalls(HttpServletRequest req) {
		try {
			List<MovieHall> mh = movieHallService.queryHalls();
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
	public MovieHall queryMovieHall(HttpServletRequest req,int id) {
		try {
			MovieHall mh = movieHallService.queryHallById(id);
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
	public String dropMovieHall(HttpServletRequest req,int id) {
		try {
			movieHallService.deleteHallById(id);
			return "okay";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "false";
		}
		
	}
	
}
