package com.example.algos.solution;

import java.nio.charset.StandardCharsets;

public class SubStringIndex {

    public int strStr(String haystack, String needle) {
        byte[] start = haystack.getBytes(StandardCharsets.UTF_8);
        byte[] need = needle.getBytes(StandardCharsets.UTF_8);
        int startLength = start.length;
        int needLength = need.length;

        if (startLength < needLength) {
            return -1;
        }

        for (int i = 0; i < startLength - 1 - needLength - 1; i++) {
            int t = i;
            for (int j = 0; j < needLength - 1; j++) {
                if (start[t] == need[j]) {
                    if (j == needLength - 1) {
                        return t - needLength + 1;
                    }
                    t++;
                }
            }
        }

        return -1;
    }
}
