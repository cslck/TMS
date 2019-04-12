package com.hw.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hw.pojo.AjaxResult;
import com.hw.pojo.CentralStorage;
import com.hw.service.CentralStorageService;

import net.sf.json.JSONObject;

@Controller
public class CentralStorageController {

	@Autowired
	private CentralStorageService centralStorageService;
	
	@RequestMapping("/allCS")//所有信息
	@ResponseBody
	public List<CentralStorage> allCentralStorages(HttpServletRequest req) {
		try {
			List<CentralStorage> cs = centralStorageService.queryCentralStorages();
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
		System.out.println(cs_id+"+++00000000000000000000000000000000000000000");
		try {
			CentralStorage cs = centralStorageService.queryCentralStorageById(cs_id);
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
