package Controllers;

/**
 * Created by nsamachipalo on 8/25/15.
 */
import Models.Account;
import Models.Trader;
import Providers.AccountDAO;
import Providers.UserDAO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AccountController {
    @RequestMapping("/My-Account")
    public String MyAccount(){
        return "null";
    }

//    @RequestMapping("/Create-Account")
//    public String CreateAccount(Model model){
//        Account account = null;
//        try{
//            account = new
//        }
//    }

//
//    @Autowired
//    private AccountDAO accountDAO;
}
