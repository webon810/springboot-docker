package demo.sboot.docker.demosbootdocker;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/index")
    public String getMyPage() {
        return "Demo Spring-Boot App by Docker";
    }
}
