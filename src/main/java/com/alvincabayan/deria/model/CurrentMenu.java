package com.alvincabayan.deria.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.validation.annotation.Validated;

/**
 * Menu Order
 */
@Validated
@Entity
public class CurrentMenu {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long currentMenuId;	
	private String currentMenuName;

	public Long getCurrentMenuId() {
		return currentMenuId;
	}

	public void setCurrentMenuId(Long currentMenuId) {
		this.currentMenuId = currentMenuId;
	}

	public String getCurrentMenuName() {
		return currentMenuName;
	}

	public void setCurrentMenuName(String currentMenuName) {
		this.currentMenuName = currentMenuName;
	}
	
	
	
}
