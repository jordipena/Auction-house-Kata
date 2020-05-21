package com.codesai.auction_house.business.model;

public interface Repository {
    void save(Auction auction);
    Auction retireveAuction(Auction auction);

}
