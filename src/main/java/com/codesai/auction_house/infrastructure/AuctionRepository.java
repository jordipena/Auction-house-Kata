package com.codesai.auction_house.infrastructure;

import com.codesai.auction_house.business.model.Auction;
import com.codesai.auction_house.business.model.Repository;

import java.util.ArrayList;
import java.util.List;

public class AuctionRepository implements Repository {

    private List<Auction> auctionList;

    public AuctionRepository(List<Auction> auctionList) {
        this.auctionList = new ArrayList<>();
    }

    @Override
    public void save(Auction auction) {
        auctionList.add(auction);
    }

    @Override
    public Auction retireveAuction(Auction auction) {

      return auction;

    }
}
