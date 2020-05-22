package com.codesai.auction_house.business.actions;

import com.codesai.auction_house.business.model.Auction;
import com.codesai.auction_house.business.model.Repository;

public class RetrieveAuctionAction {
    private final Repository repository;

    public RetrieveAuctionAction(Repository repository) {
        this.repository = repository;
    }

    public Auction execute(String auctionId){

        return repository.retireveAuction(new Auction(auctionId));
    }
}
