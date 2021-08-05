package practiceproject.springproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import practiceproject.springproject.controllers.helloworldendpoint;
import practiceproject.springproject.productdata.productdetails;

@SpringBootApplication
@RestController
public class SpringprojectApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringprojectApplication.class, args);
    }
    @GetMapping(path = "/abc")
    public String helloworld(){
        String value = new helloworldendpoint("abc").showPassword();
        return value;
    }
    @PostMapping(path = "/bcd")
    public String postmapped(@RequestBody String myString){
        System.out.println(myString);
        return new helloworldendpoint("abc").setPassword(myString);

    }
    @PostMapping("/device/add")
    public String addDevice(@RequestBody int[] product){
        return new productdetails().addProduct(product);
    }
    @PostMapping("/device/list")
    public boolean getDevice(@RequestBody int number){
        return new productdetails().returnProduct(number);
    }
}
