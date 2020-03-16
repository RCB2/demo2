package rcb.com.dom;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloContro {
    @GetMapping("/hello")
    public String hello(){
        return  "hello spring boot  hello";
    }
}
