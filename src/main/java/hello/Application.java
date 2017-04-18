package hello;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {
    private static final Logger logger = LoggerFactory.getLogger(Application.class);

    @Autowired
    private DataSource ds;

    @RequestMapping("/")
    String home() {
    	logger.info("Datasource: " + ds.toString());
        return "hello binye !";
    }

    public static void main(String[] args) {


        SpringApplication.run(Application.class, args);

        logger.info("------------------------------------------");
        logger.info("myapp start in Application");
        logger.info("------------------------------------------");

//      ApplicationContext ctx = SpringApplication.run(Application.class, args);
//        logger.debug("start in Application:");
//        System.out.println("start in Application:");

//        String[] beanNames = ctx.getBeanDefinitionNames();
//        Arrays.sort(beanNames);
//        for (String beanName : beanNames) {
//            System.out.println(beanName);
//        }
    }

}
