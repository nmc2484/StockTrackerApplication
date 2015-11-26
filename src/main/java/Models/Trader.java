package Models;

import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * Created by nsamachipalo on 8/23/15.
 */
public class Trader {
    private String typeName;
    private Double amountInvested;
    private Double amountAvailable;
    private Account accountId;
    private ArrayList<Share> shares;

}
