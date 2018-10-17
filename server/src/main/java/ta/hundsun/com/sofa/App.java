package ta.hundsun.com.sofa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

/**
 * Hello world!
 *
 */
@SpringBootApplication(scanBasePackages = {"ta.hundsun.com.sofa"})
public class App
{
    public static void main( String[] args )
    {
        SpringApplication springApplication = new SpringApplication(App.class);
        ApplicationContext applicationContext = springApplication.run(args);
    }
}
