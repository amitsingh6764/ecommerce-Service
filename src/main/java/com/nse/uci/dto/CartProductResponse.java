package com.nse.uci.dto;

public class CartProductResponse {

	private Long productId;
    private String productName;

    public CartProductResponse(Long productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    public Long getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }
}
