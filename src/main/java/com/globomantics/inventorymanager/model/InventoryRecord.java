package com.globomantics.inventorymanager.model;

import java.io.Serializable;

public class InventoryRecord implements Serializable {
    private Integer productId;
    private Integer quantity;
    private String productName;

    public InventoryRecord() { }

    public InventoryRecord(Integer productId, Integer quantity, String productName) {
        this.productId = productId;
        this.quantity = quantity;
        this.productName = productName;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }


    @Override
    public String toString() {
        return "InventoryRecord{" +
                "productId=" + productId +
                ", quantity=" + quantity +
                ", productName='" + productName + '\'' +
                '}';
    }
}
