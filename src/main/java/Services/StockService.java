package Services;

/**
 * Created by nsamachipalo on 8/20/15.
 */
import Models.Share;
public class StockService {

    public Share getAStock(String symbol){
        String urlString = String.format("http://dev.markitondemand.com/Api/v2/Quote/json?symbol=%s", symbol);
        
        Share aShare = new Share();
        aShare.setSymbol(symbol);
        aShare.setName("APPLE");
        return aShare;
    }


}
