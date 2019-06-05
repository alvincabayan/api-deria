package com.alvincabayan.model;

import javax.persistence.Entity;

public class MenuType {
	private Long menuTypeId;
	private String menuTypeName;
	
	public Long getMenuTypeId() {
		return menuTypeId;
	}
	public void setMenuTypeId(Long menuTypeId) {
		this.menuTypeId = menuTypeId;
	}
	public String getMenuTypeName() {
		return menuTypeName;
	}
	public void setMenuTypeName(String menuTypeName) {
		this.menuTypeName = menuTypeName;
	}
	
}
