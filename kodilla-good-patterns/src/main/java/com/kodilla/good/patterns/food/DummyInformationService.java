package com.kodilla.good.patterns.food;

public class DummyInformationService implements InformationService{
    public void inform(OrderRequest orderRequest){
        System.out.println("Informed");
    }
}
