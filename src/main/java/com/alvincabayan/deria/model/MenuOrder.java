package com.alvincabayan.deria.model;

import java.util.Date;
import java.util.Objects;

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
public class MenuOrder {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idMenuOrder = null;

	private String menuOrderName = null;

	private String customerName = null;

	private String customerCompany = null;

	private String menuOrderSize = null;
	
	private Date menuOrderDate = null;

	public MenuOrder idMenuOrder(Long idMenuOrder) {
		this.idMenuOrder = idMenuOrder;
		return this;
	}

	public Long getIdMenuOrder() {
		return idMenuOrder;
	}

	public void setIdMenuOrder(Long idMenuOrder) {
		this.idMenuOrder = idMenuOrder;
	}

	public String getMenuOrderName() {
		return menuOrderName;
	}

	public void setMenuOrderName(String menuOrderName) {
		this.menuOrderName = menuOrderName;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerCompany() {
		return customerCompany;
	}

	public void setCustomerCompany(String customerCompany) {
		this.customerCompany = customerCompany;
	}
	
	public String getMenuOrderSize() {
		return menuOrderSize;
	}
	
	public void setMenuOrderSize(String menuOrderSize) {
		this.menuOrderSize = menuOrderSize;
	}
	
	public Date getMenuOrderDate() {
		return menuOrderDate;
	}

	public void setMenuOrderDate(Date menuOrderDate) {
		this.menuOrderDate = menuOrderDate;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		MenuOrder menuOrder = (MenuOrder) o;
		return Objects.equals(this.idMenuOrder, menuOrder.idMenuOrder) && Objects.equals(this.menuOrderName, menuOrder.menuOrderName)
				&& Objects.equals(this.customerName, menuOrder.customerName)
				&& Objects.equals(this.customerCompany, menuOrder.customerCompany)
				&& Objects.equals(this.menuOrderSize, menuOrder.menuOrderSize)
				&& Objects.equals(this.menuOrderDate, menuOrder.menuOrderDate);
	}

	@Override
	public int hashCode() {
		return Objects.hash(idMenuOrder, menuOrderName, customerName, customerCompany, menuOrderSize, menuOrderDate);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Order {\n");

		sb.append("    idOrders: ").append(toIndentedString(idMenuOrder)).append("\n");
		sb.append("    name: ").append(toIndentedString(menuOrderName)).append("\n");
		sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
		sb.append("    customerCompany: ").append(toIndentedString(customerCompany)).append("\n");
		sb.append("    menuOrderSize: ").append(toIndentedString(menuOrderSize)).append("\n");
		sb.append("    menuOrderDate: ").append(toIndentedString(menuOrderDate)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
