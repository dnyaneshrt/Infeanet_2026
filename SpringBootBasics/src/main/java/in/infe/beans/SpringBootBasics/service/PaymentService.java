package in.infe.beans.SpringBootBasics.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

//IOC container /Appln contenxt /Bean factory.
@Component
/*@Service
@Repository
@Controller
@RestController*/

//Bean lifecycle  ->  Bean created -> Dep injection --> bean init  -> ( @PostConstruct) bean used  --> (  @PreDestroy)bean is destroyed
//bean scopes: -
//singleton (default), prototype, request, application, session


//@PreDestroy works only for singletons; Spring does not manage the full lifecycle of prototype beans and will ignore their @PreDestroy methods.
@Scope("prototype")
public class PaymentService {

    public void pay()
    {
        System.out.println("paid...");
    }

    @PostConstruct
    public void afterBeanInit()
    {
        System.out.println("@PostConstruct called before bean use!!");
    }


    @PreDestroy
    public void beforeBeanDestroy()
    {
        System.out.println("PreDestroy called before bean destroy");
    }
}
