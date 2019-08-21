package com.paginator.mediators;

public class PagesLength {
	int startPage;
	int pageSize;
	public int getStartPage() {
		return startPage;
	}
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	@Override
	public String toString() {
		return "PagesLength [startPage=" + startPage + ", pageSize=" + pageSize + "]";
	}
	
}
