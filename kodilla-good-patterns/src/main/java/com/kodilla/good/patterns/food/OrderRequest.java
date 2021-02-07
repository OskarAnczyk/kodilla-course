package com.kodilla.good.patterns.food;

public class OrderRequest {
    private String deliveryName;
    private FoodType foodType;
    private int amountInGrams;

    public OrderRequest(String companyName, FoodType foodType, int amountInGrams) {
        this.deliveryName = companyName;
        this.foodType = foodType;
        this.amountInGrams = amountInGrams;
    }

    public String getDeliveryName() {
        return deliveryName;
    }

    public FoodType getFoodType() {
        return foodType;
    }

    public int getAmountInGrams() {
        return amountInGrams;
    }
}
