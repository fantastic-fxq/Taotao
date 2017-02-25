package com.taotao.service;

import org.springframework.web.multipart.MultipartFile;

import com.taotao.common.pojo.PictureResult;

/**
 * 图片操作
 * @author fxq
 *
 */
public interface PictureService {
	PictureResult uploadPic(MultipartFile picFile);
}
