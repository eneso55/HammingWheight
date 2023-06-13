package com.example.hammingwheight;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class HammingControllerTest {

    HammingController controller = new HammingController();

    @Test
    public void hammingTest(){
        int result = controller.hammingCalc("10101");
        assertEquals(2,result);
    }
}
