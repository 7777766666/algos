package com.example.algos.quolify;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Qualifier("xx")
public class X implements XY{
    @Value("${quol.xx}")
    private String clazz;

    @Override
    public String getClassName() {
        return "This clas is XXX";
    }
}
