package com.taotao.common.pojo;

import java.util.List;

public class EasyUIDataGridResult {

	private long total;
	private List<?> rows;//任何类型都行;
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List<?> getRows() {
		return rows;
	}
	public void setRows(List<?> rows) {
		this.rows = rows;
	}

}
