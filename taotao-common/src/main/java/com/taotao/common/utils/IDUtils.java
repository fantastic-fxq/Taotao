package com.taotao.common.utils;

import java.util.Random;

/**
 * 各种id生成策略
 * 
 * @author fxq 2017年2月25日
 */
public class IDUtils {

	/**
	 * 图片名生成;
	 * 
	 * @return
	 */
	public static String genImageName() {
		// 取当前时间的长整型值包含毫秒
		long millis = System.currentTimeMillis();
		// long millis = System.nanoTime();
		// 加上三位随机数
		Random random = new Random();
		int end3 = random.nextInt(999);
		// 不足三位前面补0;
		String str = millis + String.format("%03d", end3);
		return str;

	}

	/**
	 * 商品Id生成;
	 * @return
	 */
	public static long genItemId() {
		// 取当前时间的长整型值包含毫秒
		long millis = System.currentTimeMillis();
		// long mills = System.nanoTime();
		// 加上两位随机数
		Random random = new Random();
		int end2 = random.nextInt(99);
		// 如果不足两位前面补0
		String str = millis + String.format("%02d", end2);
		long id = new Long(str);
		return id;

	}

}
