package in.infe.beans.SpringBootBasics;

import in.infe.beans.SpringBootBasics.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootBasicsApplication implements CommandLineRunner {

    @Autowired
    PaymentService paymentService1;

    @Autowired
    PaymentService paymentService2;

    @Autowired
    PaymentService paymentService3;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBasicsApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        paymentService1.pay();
        paymentService2.pay();
        paymentService3.pay();

        System.out.println(paymentService1.hashCode());
        System.out.println(paymentService2.hashCode());
        System.out.println(paymentService3.hashCode());
    }
}
