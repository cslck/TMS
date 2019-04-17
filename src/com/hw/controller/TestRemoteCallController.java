package com.hw.controller;

import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hw.pojo.AjaxResult;
import com.hw.pojo.CentralStorage;

import net.sf.json.JSONObject;
@Controller
public class TestRemoteCallController {

	@RequestMapping("/queryList")
	@ResponseBody
    public AjaxResult RemoteResult(HttpServletRequest request,HttpServletResponse response) {
		HashMap<String, Object> data = new HashMap<String, Object>();
		
		// 调用远程接口
		String url = "http://172.16.50.191:8080/TMS/allCS";
		URL realUrl;
		try {
			realUrl = new URL(url);
			URLConnection urlConnection = realUrl.openConnection();
			urlConnection.connect();
			Map<String, List<String>> map = urlConnection.getHeaderFields();
			//data.put("list", map);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new AjaxResult(AjaxResult.SUCCESS, "列表信息！",data);
	}
}
