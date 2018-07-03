package com.polly.text2speech.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pradeep_ga
 *
 */
@RestController
public class AppController {

    /**
     * @return
     */
    @RequestMapping(value="/get", method = RequestMethod.GET)
    public String welcome(){
        return "Welcome Pradeep";
    }
    
}
