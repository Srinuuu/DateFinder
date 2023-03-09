package com.example.datefinder;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.format.DateTimeFormatter;
import java.time.LocalDate; 

@RestController
public class MyController {
    @GetMapping("/")
    public String getdate(){
        LocalDate localdate=LocalDate.now();
        LocalDate newDate = localdate.plusDays(100);
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String str=newDate.format(dtf);
        return str;
    }
    
}
