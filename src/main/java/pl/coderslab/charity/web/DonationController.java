package pl.coderslab.charity.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.coderslab.charity.domain.Category;
import pl.coderslab.charity.domain.Donation;
import pl.coderslab.charity.domain.Institution;
import pl.coderslab.charity.service.CategoryService;
import pl.coderslab.charity.service.DonationService;
import pl.coderslab.charity.service.InstitutionService;

import javax.validation.Valid;
import java.util.Collection;

@Controller
public class DonationController {
  private final DonationService donationService;
  private final CategoryService categoryService;
  private final InstitutionService institutionService;

  public DonationController(DonationService donationService,
                            CategoryService categoryService, InstitutionService institutionService) {
    this.donationService = donationService;
    this.categoryService = categoryService;
    this.institutionService = institutionService;
  }

  @ModelAttribute("categories")
  public Collection<Category> categories() {
    return categoryService.getCategories();
  }

  @ModelAttribute("institutions")
  public Collection<Institution> institutions() {
    return institutionService.getInstitutions();
  }

  @RequestMapping("/donation")
  public String donationAction(Model model){
    model.addAttribute("donation", new Donation());
    //return "form";
    return "donation";
  }

  @RequestMapping("/form")
  public String donationForm(Model model){
    model.addAttribute("donation", new Donation());
    return "form";
  }

  @RequestMapping(value = "/form", method = RequestMethod.POST)
  public String saveDonation(@Valid Donation donation, BindingResult result) {
    //if (result.hasErrors()) {
    //  return "form";
    //}
    donationService.add(donation);
    //return "redirect:/";
    return "form-confirmation";
  }
}
