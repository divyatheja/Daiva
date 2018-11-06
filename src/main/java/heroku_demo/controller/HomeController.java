package heroku_demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.groovy.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import heroku_demo.entity.PaymentDetail;
import heroku_demo.entity.Villager;
import heroku_demo.entity.VillagerRequest;
import heroku_demo.repository.PaymentDetailRepository;
import heroku_demo.repository.VillagerRepository;

@Controller
public class HomeController {
	@Autowired  
	private VillagerRepository villagerRepository;
	
	@Autowired  
	private PaymentDetailRepository paymentDetailRepository;
	
	@GetMapping(value = "/allVillagers")
	@ResponseBody
	public List<Villager> getAllVillagers(Model model) {
	 	return (List<Villager>)villagerRepository.findAll();
	}
	
	@GetMapping(value = "/oneVillager")
	@ResponseBody
	public List<Villager> getOneVillagers(@RequestParam("name") String name,
			@RequestParam("house") String house, Model model) {
		Villager villager = new Villager();
		villager = villagerRepository.findOneByNameAndHouse(name,house);
	 	return (List<Villager>)villagerRepository.findAll();
	 	
	}
	
	@PostMapping(value = "/addVillager")
	@ResponseBody
	public ResponseEntity<Villager> addVillager(Villager villager, Model model) {
		 Villager saved = villagerRepository.save(villager);
		return new ResponseEntity<Villager>(saved, HttpStatus.CREATED);
	}
	 
	@PostMapping(value = "/addPayment")
	@ResponseBody
	public ResponseEntity<PaymentDetail> addVillager(PaymentDetail paymentDetail, Model model) throws Exception {
		PaymentDetail saved = new PaymentDetail();
		PaymentDetail paymentExixting = new PaymentDetail();
		paymentExixting = paymentDetailRepository.getById(paymentDetail.getId());
		if(StringUtils.isEmpty(paymentExixting)){
			saved = paymentDetailRepository.save(paymentDetail);	
		}
		else if(!StringUtils.isEmpty(paymentExixting.getEmi5Amount())){
			throw new Exception();
		}
		else if(!StringUtils.isEmpty(paymentExixting.getEmi4Amount())){
			paymentExixting.setEmi5Amount(paymentDetail.getEmi1Amount());
			paymentExixting.setEmi5CollectedBy(paymentDetail.getEmi1CollectedBy());
			paymentExixting.setEmi5Date(paymentDetail.getEmi1Date());
		}
		else if(!StringUtils.isEmpty(paymentExixting.getEmi3Amount())){
			paymentExixting.setEmi4Amount(paymentDetail.getEmi1Amount());
			paymentExixting.setEmi4CollectedBy(paymentDetail.getEmi1CollectedBy());
			paymentExixting.setEmi4Date(paymentDetail.getEmi1Date());
		}
		else if(!StringUtils.isEmpty(paymentExixting.getEmi2Amount())){
			paymentExixting.setEmi3Amount(paymentDetail.getEmi1Amount());
			paymentExixting.setEmi3CollectedBy(paymentDetail.getEmi1CollectedBy());
			paymentExixting.setEmi3Date(paymentDetail.getEmi1Date());
		}
		else if(!StringUtils.isEmpty(paymentExixting.getEmi1Amount())){
			paymentExixting.setEmi2Amount(paymentDetail.getEmi1Amount());
			paymentExixting.setEmi2CollectedBy(paymentDetail.getEmi1CollectedBy());
			paymentExixting.setEmi2Date(paymentDetail.getEmi1Date());
		}
		saved = paymentDetailRepository.save(paymentExixting);
		return new ResponseEntity<PaymentDetail>(saved, HttpStatus.CREATED);
	}
	
/*	@PostMapping(value = {"/", "/index"})
	public String addComment(@ModelAttribute("comment") Villager comment
			, Model model) {
		
		commentRepository.save(comment);  // save to the database
		
		model.addAttribute("allComments", (List<Comment>)commentRepository.findAll());
		return "redirect:/index"; // redirects
	}
*/
}
