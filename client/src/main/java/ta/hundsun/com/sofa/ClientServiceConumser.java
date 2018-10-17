package ta.hundsun.com.sofa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ta.hundsun.com.sofa.service.ClientServiceReference;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class ClientServiceConumser
{
    public static void main( String[] args )
    {
        //change port to run in local machine
        System.setProperty("server.port", "8081");

        SpringApplication springApplication = new SpringApplication(ClientServiceConumser.class);

        ApplicationContext applicationContext = springApplication.run(args);

        ClientServiceReference annotationService = applicationContext.getBean(ClientServiceReference.class);

        System.err.println(annotationService.getClients().get(0).getId());
    }
}
