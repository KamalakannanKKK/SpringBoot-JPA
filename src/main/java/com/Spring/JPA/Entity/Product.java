package com.Spring.JPA.Entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "product_detail", schema = "ecommere", uniqueConstraints = {
		@UniqueConstraint(name = "name", columnNames = "ProductName") })
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	
	private String ProductName;
	private String ProductDescription;
	private long price;
	@CreationTimestamp
	private LocalDateTime CreatedDate;
	@UpdateTimestamp
	private LocalDateTime updatedDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public String getProductDescription() {
		return ProductDescription;
	}

	public void setProductDescription(String productDescription) {
		ProductDescription = productDescription;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public LocalDateTime getCreatedDate() {
		return CreatedDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		CreatedDate = createdDate;
	}

	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}

	public Product(int id, String productName, String productDescription, long price, LocalDateTime createdDate,
			LocalDateTime updatedDate) {
		super();
		this.id = id;
		ProductName = productName;
		ProductDescription = productDescription;
		this.price = price;
		CreatedDate = createdDate;
		this.updatedDate = updatedDate;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", ProductName=" + ProductName + ", ProductDescription=" + ProductDescription
				+ ", price=" + price + ", CreatedDate=" + CreatedDate + ", updatedDate=" + updatedDate + "]";
	}
	
	

}
