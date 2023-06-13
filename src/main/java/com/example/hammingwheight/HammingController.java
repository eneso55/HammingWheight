package com.example.hammingwheight;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HammingController {


    @RequestMapping("/hamming")
    public int hammingCalc(@RequestParam String a) {
        int hammingWeight = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '0') {
                hammingWeight++;
            }
        }
        return hammingWeight;
    }
}
