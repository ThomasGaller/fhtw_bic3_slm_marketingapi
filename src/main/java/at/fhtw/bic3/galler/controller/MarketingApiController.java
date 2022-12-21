package at.fhtw.bic3.galler.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MarketingApiController {
    @GetMapping("/convert_percentage_to_grade")
    public int calcGrade(@RequestParam("percentage") double percentage){
        if(percentage>=88)return 1;
        if(percentage>=75)return 2;
        if(percentage>=63)return 3;
        if(percentage>=50)return 4;
        return 5;
    }
}
