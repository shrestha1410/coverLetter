package com.coverletter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.coverletter.Dto.RequestDto;
import com.coverletter.Servce.CoverletterService;

@RestController
public class CoverLetterController {
    @Autowired
    private CoverletterService coverletterService;
    @PostMapping("/create-cover-letter")
    public String createCoverLetter(@RequestBody RequestDto requestDto){
        return coverletterService.coverLetter(requestDto);
    }
}
