package Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * Created by nsamachipalo on 8/20/15.
 */
@Entity
@Table(name = "shares")
public class Share {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotNull
    private String name;

    @NotNull
    private String symbol;

    private float currPrice;
    private float percentChange;
    private float percentChangeSincePurchase;
    private float dollarChange;
    private float dollarCHangeSincePurchace;

    //Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setPercentChange(float percentChange) {
        this.percentChange = percentChange;
    }

    public void setDollarChange(float dollarChange) {
        this.dollarChange = dollarChange;
    }

    public void setDollarCHangeSincePurchace(float dollarCHangeSincePurchace) {
        this.dollarCHangeSincePurchace = dollarCHangeSincePurchace;
    }

    public void setPercentChangeSincePurchase(float percentChangeSincePurchase) {
        this.percentChangeSincePurchase = percentChangeSincePurchase;
    }

    public void setCurrPrice(float currPrice) {
        this.currPrice = currPrice;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setName(String name) {
        this.name = name;
    }


    //Getters
    public int getId() {
        return id;
    }

    public float getPercentChange() {
        return percentChange;
    }

    public float getDollarChange() {
        return dollarChange;
    }

    public float getDollarCHangeSincePurchace() {
        return dollarCHangeSincePurchace;
    }

    public float getPercentChangeSincePurchase() {
        return percentChangeSincePurchase;
    }

    public float getCurrPrice() {
        return currPrice;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }



}
