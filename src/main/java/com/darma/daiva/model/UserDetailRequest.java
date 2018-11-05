package com.darma.daiva.model;

import org.springframework.stereotype.Component;

@Component
public class UserDetailRequest {
	private String name;
	private Long amount;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}

}
