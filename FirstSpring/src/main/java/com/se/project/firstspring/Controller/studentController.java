package com.se.project.firstspring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class studentController {


    //Show the form in the browser
    @GetMapping("/student")
    public String Studentform(){

        return "view/springform";
    }

    //when click on the submit method we have a method to handle it
@PostMapping("/student")
    public String StPrintInfo(@RequestParam("fname") String fname,@RequestParam("lname") String lname){
        System.out.println("First Name:" +fname+"\t Last Name:"+lname);
return "redirect:/student";
    }

}
