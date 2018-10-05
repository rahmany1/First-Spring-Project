package com.se.project.firstspring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@RestController

@Controller //for showing html page
public class MainController {


//  @RequestMapping(value = "/hel", method= RequestMethod.GET )
//    public String hello(){
//        return "Hello Spring";
//    }


@GetMapping("/hell")
public String helloHTML(){
    return "view/hello";
}



}
