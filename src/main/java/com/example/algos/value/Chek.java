package com.example.algos.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Chek {

    @Value("${check.meassage}")
    private String name;


    public Chek() {

    }

    public Chek(@Value("${check.meassage}")String name) {
        this.name = name;
    }

//    public String getName() {
//        return name;
//    }

    @Override
    public String toString() {
        return "Chek{" +
                "name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }


}
