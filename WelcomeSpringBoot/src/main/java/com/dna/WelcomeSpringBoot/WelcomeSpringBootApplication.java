package com.dna.WelcomeSpringBoot;

import com.dna.WelcomeSpringBoot.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WelcomeSpringBootApplication  implements CommandLineRunner {

    @Autowired
    LoanService loanService;

	public static void main(String[] args) {
		SpringApplication.run(WelcomeSpringBootApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
//        LoanService loanService=new LoanService();  don't do thatin SB
        loanService.approveLoan();
    }
}
