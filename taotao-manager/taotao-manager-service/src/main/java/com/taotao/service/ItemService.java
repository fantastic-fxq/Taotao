package com.taotao.service;

import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.common.pojo.TaotaoResult;
import com.taotao.pojo.TbItem;

public interface ItemService {
	/*
	 * 根据Id,查询商品信息
	 */
	TbItem getItemById(Long itemId);

	/*
	 * 分页查询商品列表
	 */
	EasyUIDataGridResult getItemList(int page, int rows);

	/*
	 * 添加商品信息
	 */
	TaotaoResult createItem(TbItem item, String desc, String itemParam);

	/*
	 * 根据商品id，查询规格参数
	 */
	String getItemParamHtml(Long itemId);

}
