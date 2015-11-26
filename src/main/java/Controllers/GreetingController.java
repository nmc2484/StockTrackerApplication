package Controllers;

import Models.Trader;
import Providers.AccountDAO;
import Models.Account;
import Providers.UserDAO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
    @RequestMapping("/")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        Account account = new Account();
        account.setAccountId("Nsama Account");
        account.setFirstName("Nsama");
        account.setLastName("Chipalo");
        model.addAttribute("account", account);
        return "greeting";
    }

    @RequestMapping("/create-trader")
    public String User(Model model){
        Trader trader;
        try{
            trader = new Trader();
            userDAO.save(trader);
        }
        catch (Exception ex) {
            return "Error creating the trader: " + ex.toString();
        }
        return "Trader succesfully created!";
    }

    @Autowired
    private AccountDAO accountDAO;

    @Autowired
    private UserDAO userDAO;

}