package com.bankapp;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bankapp.dao.TransactionLogDao;
import com.bankapp.dto.AddressChangeRequest;
import com.bankapp.entities.Account;
import com.bankapp.entities.Customer;
import com.bankapp.entities.TransactionLog;
import com.bankapp.service.AccountService;
import com.bankapp.service.CustomerService;

@SpringBootApplication
public class BankappFinalApplication  implements CommandLineRunner{

	@Autowired
	private AccountService accountService;
	
	@Autowired
	private TransactionLogDao transactionLogDao;
	
	@Autowired
	private CustomerService customerService;
	public static void main(String[] args) {
		SpringApplication.run(BankappFinalApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		
//		Customer cust= new Customer("Divya", "Divya123", "admin", "ctr",
//				"ctr", "5678129", "div@d.com", LocalDate.of(1999, Month.NOVEMBER, 17));
//		Customer cust1= new Customer("Sravya", "sravya123", "mgr", "ctr",
//				"ctr", "985678129", "srav@s.com", LocalDate.of(1995, Month.MAY, 11));
//		
//		customerService.addCustomer(cust);
//		customerService.addCustomer(cust1);
//		Account account1 = new Account("Divya", 1000.00 , "saving", "Big mosque col", "ctr", "4522896463", "div@gm.com", LocalDate.of(1999,Month.NOVEMBER, 17));
//    
//		Account account2 = new Account("Sravya", 1000.00 , "saving", "gandhinagar col", "ctr", "4522896463", "srav@gm.com", LocalDate.of(1995,Month.JANUARY, 11));
//		
//		accountService.save(account1);
//		accountService.save(account2);
//		
//		accountService.transfer(1, 2, 100);
//		accountService.deposit(1, 100);
//		accountService.withdraw(2, 100);
//		
//		AddressChangeRequest addressChangeRequest = new AddressChangeRequest("kk bakam", "ctr", "55654856", "kri@k.com");
//		
//		accountService.changeAddress(1, addressChangeRequest);
//		
//		List<TransactionLog> list = transactionLogDao.findByFromAccount(2);
//		
//		for(TransactionLog log:list)
//			System.out.println(log);
	}

}