package gic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import gic.dto.AccountDto;
import gic.service.AccountService;

@Controller		
public class AccountListController {		
		
	@Autowired	
	private AccountService accountService ; 	
		
	@ModelAttribute("accountList")	
	List<AccountDto> getAccList(){	
		List<AccountDto> accList = accountService.getAccountList();
		return accList;
	}	
		
	@RequestMapping(value = "/init")	
	public String init() {
		System.out.println("Hello");
		return "account/account";
	}	
}		
