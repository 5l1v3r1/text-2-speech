package com.polly.text2speech.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.polly.text2speech.model.AudioMetadata;

/**
 * @author pradeep_ga
 *
 */
@RestController
public class AppController {

    /**
     * @return
     */
    @RequestMapping(value="converttexttospeech", method = RequestMethod.POST)
    public String convertTextToSpeech(@RequestBody AudioMetadata audioMetadata){
    	System.out.println(audioMetadata.getPlaintext());
    	System.out.println(audioMetadata.getVoice());
        return "Welcome Pradeep";
    }
    
}
