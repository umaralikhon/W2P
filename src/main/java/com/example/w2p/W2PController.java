package com.example.w2p;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class W2PController {

    private final W2PService w2PService;

    public W2PController(W2PService w2PService){
        this.w2PService = w2PService;
    }

    @PostMapping("/w2p")
    public String convert2Pdf() throws Exception {

        try {
            w2PService.convert2Pdf();
            return "Success";
        }catch (Exception ex){
            return ex.getMessage();
        }
    }
}
