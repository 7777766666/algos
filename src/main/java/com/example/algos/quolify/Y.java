package com.example.algos.quolify;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Qualifier("yy")
public class Y implements XY{
    @Value("${quol.yy}")
    @Override
    public String getClassName() {
        return "This class is YYY";
    }
}
