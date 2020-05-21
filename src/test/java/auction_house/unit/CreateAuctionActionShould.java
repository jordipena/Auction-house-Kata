package auction_house.unit;

import com.codesai.auction_house.business.actions.CreateAuctionAction;
import com.codesai.auction_house.business.model.Auction;
import com.codesai.auction_house.business.model.Repository;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class CreateAuctionActionShould {

    @Test
    public void create_an_auction(){

        Repository repository = mock(Repository.class);
        Auction auctionExpected = new Auction("auctionId");
        CreateAuctionAction createAuctionAction = new CreateAuctionAction(repository);

        createAuctionAction.execute(auctionExpected.id);

        verify(repository, times(1)).save(auctionExpected);
    }
}
