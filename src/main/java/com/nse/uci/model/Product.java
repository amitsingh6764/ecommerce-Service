package com.nse.uci.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "product")
@Data
@Builder
@DynamicUpdate
@NoArgsConstructor
@AllArgsConstructor
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "prod_seq")
	@SequenceGenerator(name = "prod_seq", sequenceName = "PROD_SEQ", initialValue = 1000, allocationSize = 1)
	@Column(name = "product_id")
	private Long id;
	
	@Column(name = "product_name")
	private String name;
	
	@Column(name = "price")
	private BigDecimal price;
	
	@Column(name = "category")
	private String category;
	
	@Column(name = "brand")
	private String brand;
	
	@Column(name = "discount")
	private BigDecimal discount;
	
	@Column(name = "quantity")
	private Integer stockQuantity;
	
	@Column(name = "color")
	private String color;
	
	@Column(name = "PRODUCT_SIZE")
	private String size;
	
	@Column(name = "status")
	private String status;
	
	@CreationTimestamp
    @Column(name = "CREATED_DATE", nullable = false, updatable = false)
    private LocalDateTime orderedAt;

    @UpdateTimestamp
    @Column(name = "UPDATED_DATE", nullable = false)
    private LocalDateTime updatedAt;
}
