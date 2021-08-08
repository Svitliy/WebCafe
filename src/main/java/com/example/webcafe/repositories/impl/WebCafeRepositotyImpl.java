package com.example.webcafe.repositories.impl;

import com.example.webcafe.repositories.WebCafeRepository;
import org.springframework.stereotype.Component;


@Component
public class WebCafeRepositotyImpl implements WebCafeRepository {

    public WebCafeRepositotyImpl() {
        System.out.println("********** WebCafeRepositotyImpl is called *********" );
    }
    @Override
    public String getFamouseWeCafeName() {
        return "Snow";
    }
}
