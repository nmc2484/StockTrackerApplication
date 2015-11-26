package Controllers;


import Models.Share;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StocksController {
    @RequestMapping("/stocks")
    public String stocks(ModelMap model) {
        Share myShare = new Share();
        myShare.setName("APPLE");
        model.put("mystock", myShare);
        return "stocks";
    }
}
