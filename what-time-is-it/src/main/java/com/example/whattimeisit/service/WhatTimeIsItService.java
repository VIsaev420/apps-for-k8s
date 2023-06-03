package com.example.whattimeisit.adapter.service;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import org.springframework.util.StreamUtils;

import java.io.IOException;

@Service
public class WhatTimeIsItService {

    public byte[] getImage() throws IOException {
        var imgFile = new ClassPathResource("im/Adventure_Time_-_Title_card.png");

        return StreamUtils.copyToByteArray(imgFile.getInputStream());
    }
}
