package hmkg.investment.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class PortfolioController {

    @GetMapping("/portfolio")
    public String getPortfolio(){

        return "/portfolio_overview.html";
    }
}
