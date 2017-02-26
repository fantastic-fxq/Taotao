package com.taotao.service;

import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.common.pojo.TaotaoResult;

/**
 * 商品规格参数模板
 * @author fxq
 *
 */
public interface ItemParamService {

	/**
	 * 根据商品类目ID查询商品规则参数模板
	 * @param cid
	 * @return
	 */
	TaotaoResult getItemParamByCid(Long cid);
	
	/**
	 * 添加商品规则参数;
	 * @param cid
	 * @param paramData
	 * @return
	 */
	TaotaoResult insertItemParam(Long cid,String paramData);
	
	/**
	 * 查询规格列表
	 * @param page
	 * @param rows
	 * @return
	 */
	EasyUIDataGridResult getItemParamList(int page,int rows);
	
}
