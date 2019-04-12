package com.hw.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hw.pojo.AjaxResult;
import com.hw.pojo.CentralStorage;
import com.hw.service.CentralStorageService;

@Controller
public class CentralStorageController {
	protected final Log logger = LogFactory.getLog(this.getClass());
	@Autowired
	private CentralStorageService centralStorageService;
	
	@RequestMapping("/allCS")//所有信息
	@ResponseBody
	public List<CentralStorage> allCentralStorages(HttpServletRequest req) {
		try {
			List<CentralStorage> cs = centralStorageService.queryCentralStorages();
			logger.info("用户：admin,操作：查询所有中央存储信息"+cs);
			return cs;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
		
	}
	/*@RequestMapping("/allCSAjax")//所有信息
	@ResponseBody
	public AjaxResult allCentralStoragesAjax(HttpServletRequest req) {
		HashMap<String, Object> data = new HashMap<String, Object>();
		try {
			List<CentralStorage> cs = centralStorageService.queryCentralStorages();
			data.put("data", cs);
			return new AjaxResult(AjaxResult.SUCCESS, "success", data);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new AjaxResult(AjaxResult.SYSTEM_ERROR, "error");
		}
		
	}*/
	
	@RequestMapping("/addCS")//添加信息
	@ResponseBody
	public String addCentralStorage(HttpServletRequest req,CentralStorage cs) {
		logger.info("用户：admin,操作：添加中央存储信息"+cs);
		try {
			centralStorageService.addCentralStorage(cs);
			return "okay";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "false";
		}
		
	}
	@RequestMapping("/queryCS")//ID查询
	@ResponseBody
	public CentralStorage queryCentralStorage(HttpServletRequest req,Integer cs_id) {
		try {
			CentralStorage cs = centralStorageService.queryCentralStorageById(cs_id);
			logger.info("用户：admin,操作：ID查询中央存储影厅信息"+cs);
			return cs;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
		
	}
	/*@RequestMapping("/queryCSa")//ID查询
	@ResponseBody
	public AjaxResult queryCentralStoragea(HttpServletRequest req,int id) {
		JSONObject data = new JSONObject();
		try {
			CentralStorage cs = centralStorageService.queryCentralStorageById(id);
			data.put("data", cs);
			return new AjaxResult(AjaxResult.SUCCESS, "success", data);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new AjaxResult(AjaxResult.SYSTEM_ERROR, "error");
		}
		
	}*/
	
	@RequestMapping("/updateCS")//更新信息
	@ResponseBody
	public String updateCentralStorage(HttpServletRequest req,CentralStorage cs) {
		logger.info("用户：admin,操作：更新中央存储信息"+cs);
		try {
			centralStorageService.updateCentralStorage(cs);
			return "okay";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "false";
		}
		
	}
	@RequestMapping("/dropCS")//ID删除
	@ResponseBody
	public String dropCentralStorage(HttpServletRequest req,Integer cs_id) {
		logger.info("用户：admin,操作：ID查询所有中央存储信息"+cs_id);
		try {
			centralStorageService.deleteCentralStorageById(cs_id);
			return "okay";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "false";
		}
		
	}
	
}
