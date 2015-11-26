package Models;

import java.util.ArrayList;

/**
 * Created by nsamachipalo on 8/23/15.
 */
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

public class Account {

    private String accountId;
    private String password;
    private String userName;
    private String firstName;
    private String lastName;

    private ArrayList<Trader> myTraders;

    public String getAccountId() {
        return accountId;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
