package com.practice.ms.webservice.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Card {

	private int price;
	private String message;

	public Card(int price) {
		this.price = price;
	}
}
