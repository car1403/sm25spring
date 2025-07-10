package eud.sm.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@Slf4j
public class LoginController {
    @RequestMapping("/login")
    public String login(Model model) {
        model.addAttribute("center","login");
        return "index";
    }
    @RequestMapping("/loginimpl")
    // ?id=aaaaa&pwd=xxxxx
    public String loginimpl(Model model,
                            @RequestParam("id")  String id,
                            @RequestParam("pwd") String pwd) {
        log.info("ID:{}, PWD:{}", id, pwd);
        model.addAttribute("center","login");
        return "index";
    }
    @RequestMapping("/register")
    public String register(Model model) {
        model.addAttribute("center","register");
        return "index";
    }

    @RequestMapping("/registertestimpl")
    // ?id=aaaaa&pwd=xxxxx
    public String registertestimpl(Model model,
                            @RequestParam("hobby") List<String> hobbys,
                            @RequestParam("gender") String gender,
                            @RequestParam("car") String car,
                            @RequestParam("range") int range,
                            @RequestParam("date") String date) {
        log.info("Hobby:{}, Gender:{}, Car:{}, Range:{}, Date:{}", hobbys, gender, car, range, date);
        model.addAttribute("center","login");
        return "index";
    }
}
