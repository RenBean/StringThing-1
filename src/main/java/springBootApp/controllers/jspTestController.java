package springBootApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/test/")
public class jspTestController {

    @RequestMapping(value="jspTest")
    public String jspTest() {
        return "test";
    }
}
