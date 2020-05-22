package auction_house.unit;

import com.codesai.auction_house.business.actions.CreateAuctionAction;
import com.codesai.auction_house.business.actions.RetrieveAuctionAction;
import com.codesai.auction_house.business.model.Auction;
import com.codesai.auction_house.business.model.Repository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class CreateAuctionActionShould {

    Repository repository;
    CreateAuctionAction createAuctionAction;

    @BeforeEach
    public void setUp(){
        repository = mock(Repository.class);
        createAuctionAction = new CreateAuctionAction(repository);
    }

    @Test
    public void create_an_auction(){
        Auction auctionExpected = new Auction("auctionId");

        createAuctionAction.execute(auctionExpected.id);

        verify(repository, times(1)).save(auctionExpected);
    }

    @Test
    public void retrieve_an_auction_by_id(){

        Auction auctionExpected = new Auction("auctionId");

        when(repository.retireveAuction(any())).thenReturn(auctionExpected);

        RetrieveAuctionAction retrieveAuctionAction = new RetrieveAuctionAction(repository);

        Auction newAuction = retrieveAuctionAction.execute(auctionExpected.id);

        assertEquals(newAuction,auctionExpected);
    }
}
