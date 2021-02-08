package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private InformationService informationService;
    private BuyService buyService;
    private BuyRepository buyRepository;

    public ProductOrderService(final InformationService informationService, final BuyService buyService
            , final BuyRepository buyRepository) {
        this.informationService = informationService;
        this.buyService = buyService;
        this.buyRepository = buyRepository;
    }

    public BuyDto process(final BuyRequest buyRequest){
        boolean isBought = buyService.buy(buyRequest);

        if(isBought){
            informationService.inform(buyRequest.getUser());
            buyRepository.createBuy(buyRequest);
            return new BuyDto(buyRequest.getUser(),true);
        } else {
            return new BuyDto(buyRequest.getUser(),false);
        }
    }
}
