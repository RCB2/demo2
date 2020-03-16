package rcb.com.dom;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 项目启动类中的@ComponentScan注解，除了扫描Service、@Repository、@Component
 * 、@Controller、@RestController等之外，也会扫描@Configuration
 */




@SpringBootApplication
//@EnableAutoConfiguration//表示开启自动化配置，项目中添加了spring-boot-starter-web在开启之后自动进行Spring和SpringMVC的配置
//@ComponentScan//扫描的类，默认是当前类所在的包下面，启动类放在根包下面
public class App {
        public static void main(String[] args) {
            SpringApplication.run(App.class, args);
        }

    }


