package com.taotao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.taotao.common.pojo.PictureResult;
import com.taotao.common.utils.JsonUtils;
import com.taotao.service.PictureService;

/**
 * 图片上传Controller
 * @author fxq
 *
 */
@Controller
public class PictureController {
	@Autowired
	private PictureService pictureService;
	
	@RequestMapping("/pic/upload")
	@ResponseBody
	public String  uploadFile(MultipartFile uploadFile)
	{  //解决浏览器兼容问题;返回文本
		PictureResult result = pictureService.uploadPic(uploadFile);
		String json=JsonUtils.objectToJson(result);
		System.out.println(json);
		return json;
	}
	
//	public PictureResult uploadFile(MultipartFile uploadFile)
//	{
//		PictureResult result = pictureService.uploadPic(uploadFile);
//		return result;
//	}

}
