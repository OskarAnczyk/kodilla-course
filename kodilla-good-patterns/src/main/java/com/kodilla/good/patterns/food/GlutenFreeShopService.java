package com.kodilla.good.patterns.food;

public class GlutenFreeShopService implements FoodSupplier {
    public boolean process(OrderRequest orderRequest){
        if(orderRequest.getFoodType() == FoodType.FOOD && orderRequest.getAmountInGrams() > 1000){
            System.out.println("Delivery provided by: " + orderRequest.getDeliveryName() + " from: GlutenFreeShop"
                    + "\nfor:" + orderRequest.getAmountInGrams() + " of " + orderRequest.getFoodType() + ".");
            return true;
        } else {
            return false;
        }
    }
}
