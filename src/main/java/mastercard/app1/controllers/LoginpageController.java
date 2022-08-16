package mastercard.app1.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class LoginpageController {
    @GetMapping("/")
    public String loginpage() {
        return "loginpage";
    }
}
