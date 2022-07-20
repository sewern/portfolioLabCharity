package pl.coderslab.charity.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.service.DonationService;
import pl.coderslab.charity.service.InstitutionService;


@Controller
public class HomeController {
    private final InstitutionService institutionService;
    private final DonationService donationService;

    public HomeController(InstitutionService institutionService, DonationService donationService) {
        this.institutionService = institutionService;
        this.donationService = donationService;
    }

    @RequestMapping("/")
    public String homeAction(Model model){
        model.addAttribute("institutions", institutionService.getInstitutions());
        model.addAttribute("statsAsObjArr", donationService.getStatsAsObjArr());
        model.addAttribute("statsAsTuple", donationService.getStatsAsTuple());
        model.addAttribute("statsAsIntf", donationService.getStatsAsIntf());
        model.addAttribute("statsAsClass", donationService.getStatsAsClass());
        return "index";
    }
}
