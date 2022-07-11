package com.example.can_bac_2;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/api")
public class mainapp {
    @GetMapping
    public ResponseEntity canbac2(@RequestParam("a") int a ,@RequestParam("b") int b ,@RequestParam("c") int c ){
        int denta = b*b - 4 * a * c;
        if(denta < 0) return  ResponseEntity.ok(new DataResponde("Phuong trinh vo nghiem",0,0));
        if(denta == 0){
            int x = -b / 2 * a;
            return  ResponseEntity.ok(new DataResponde("Phuong trinh co nghiem kep",x,x));
        }
        double candenta = Math.sqrt(denta);
        float cd = (float) candenta;
        return  ResponseEntity.ok(new DataResponde("Phuong trinh co nghiem kep",(-b + cd)/2* a,(-b - cd)/2* a));
    }
}
