package com.codesai.auction_house.business.actions;

import com.codesai.auction_house.business.model.Auction;
import com.codesai.auction_house.business.model.Repository;

public class CreateAuctionAction {

    private final Repository repository;

    public CreateAuctionAction(Repository repository) {
        this.repository = repository;
    }

    public void execute(String auctionId){

        Auction auction = new Auction(auctionId);

        repository.save(auction);
    }
}
