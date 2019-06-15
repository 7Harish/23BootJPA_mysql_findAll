package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Table(name="prod_tab")
public class Product {
	@Id
	@GeneratedValue
	@NonNull
	private Integer prodID;
	@NonNull
	private String prodCode;
	@NonNull
	private Double prodCost;
	public Product(@NonNull String prodCode, @NonNull Double prodCost) {
		super();
		this.prodCode = prodCode;
		this.prodCost = prodCost;
	}
	
}
