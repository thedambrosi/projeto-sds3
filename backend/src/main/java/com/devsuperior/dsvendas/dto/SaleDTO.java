package com.devsuperior.dsvendas.dto;

import java.time.LocalDate;

import com.devsuperior.dsvendas.entities.Sale;

public class SaleDTO {
	
	private Long id;
	private Integer Viseted;
	private Integer deals;
	private Double amount;
	private LocalDate date;
	
	private SellerDTO seller;
	
	public SaleDTO() {
		
	}

	public SaleDTO(Long id, Integer viseted, Integer deals, Double amount, LocalDate date, SellerDTO seller) {
		this.id = id;
		this.Viseted = viseted;
		this.deals = deals;
		this.amount = amount;
		this.date = date;
		this.seller = seller;
	}
	public SaleDTO(Sale entity) {
		id = entity.getId();
		Viseted = entity.getViseted();
		deals = entity.getDeals();
		amount = entity.getAmount();
		date = entity.getDate();
		seller = new SellerDTO( entity.getSeller());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getViseted() {
		return Viseted;
	}

	public void setViseted(Integer viseted) {
		Viseted = viseted;
	}

	public Integer getDeals() {
		return deals;
	}

	public void setDeals(Integer deals) {
		this.deals = deals;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public SellerDTO getSeller() {
		return seller;
	}

	public void setSeller(SellerDTO seller) {
		this.seller = seller;
	}
	

}
