package com.cqut.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cqut.Util.DateJsonValueProcessor;
import com.cqut.Util.ResponseUtil;
import com.cqut.Util.StringUtil;
import com.cqut.bean.AirBus;
import com.cqut.bean.PageBean;
import com.cqut.service.AirBusService;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;





/**
 * 客户Controller层
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/airbus")
public class AirBusController {

	@Resource
	private AirBusService airBusService;
	
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));   //true:允许输入空值，false:不能为空值
	}
	
	/**
	 * 分页条件查询客户
	 * @param page
	 * @param rows
	 * @param s_airBus
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/list")
	public String list(@RequestParam(value="page",required=false)String page,@RequestParam(value="rows",required=false)String rows,AirBus s_airbus,HttpServletResponse response)throws Exception{
		System.out.println("sfssdfsf");
		PageBean pageBean=new PageBean(Integer.parseInt(page),Integer.parseInt(rows));
		Map<String,Object> map=new HashMap<String,Object>();
		//map.put("khno", StringUtil.formatLike(s_airbus.getId()));
		map.put("name", StringUtil.formatLike(s_airbus.getName()));
		map.put("start", pageBean.getStart());
		map.put("size", pageBean.getPageSize());
		if(airBusService == null){
			System.out.println("fdsdsfsfsfsf");
		}
		else{
			System.out.println("2222");
		}
		List<AirBus> airBusList=airBusService.find(map);
		Long total=airBusService.getTotal(map);
		JSONObject result=new JSONObject();
		JsonConfig jsonConfig=new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd"));
		JSONArray jsonArray=JSONArray.fromObject(airBusList,jsonConfig);
		result.put("rows", jsonArray);
		result.put("total", total);
		ResponseUtil.write(response, result);
		return null;
	}
	
	/**
	 * 添加或者修改客户
	 * @param user
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/save")
	public String save(AirBus airBus,HttpServletResponse response)throws Exception{
		System.out.println("sfssdfsfxxxxxxxxxxxxxxxxxx");
		int resultTotal=0; // 操作的记录条数
		if(airBus.getId()==null){
			
			resultTotal=airBusService.add(airBus);
		}else{
			resultTotal=airBusService.update(airBus);
		}
		JSONObject result=new JSONObject();
		if(resultTotal>0){
			result.put("success", true);
		}else{
			result.put("success", false);
		}
		ResponseUtil.write(response, result);
		return null;
	}
	
	
	/**
	 * 删除客户
	 * @param ids
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/delete")
	public String delete(@RequestParam(value="ids")String ids,HttpServletResponse response)throws Exception{
		String []idsStr=ids.split(",");
		for(int i=0;i<idsStr.length;i++){
			airBusService.delete(Integer.parseInt(idsStr[i]));
		}
		JSONObject result=new JSONObject();
		result.put("success", true);
		ResponseUtil.write(response, result);
		return null;
	}
}
