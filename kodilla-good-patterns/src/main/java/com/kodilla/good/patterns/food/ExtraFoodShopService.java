package com.kodilla.good.patterns.food;

public class ExtraFoodShopService implements FoodSupplier {
    public boolean process(OrderRequest orderRequest){
        if(orderRequest.getAmountInGrams() < 5000){
            System.out.println("Delivery provided by: " + orderRequest.getDeliveryName() + " from: ExtraFoodShop"
            + "\nfor:" + orderRequest.getAmountInGrams() + " of " + orderRequest.getFoodType() + ".");
            return true;
        } else {
            return false;
        }
    }
}
