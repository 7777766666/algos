package com.example.algos.quolify;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class quolify {

    @Qualifier("xx")
    @Autowired
    private XY zz;

    @Override
    public String toString() {
        return "quolify{" +
                "zz=" + zz +
                '}';
    }
}
