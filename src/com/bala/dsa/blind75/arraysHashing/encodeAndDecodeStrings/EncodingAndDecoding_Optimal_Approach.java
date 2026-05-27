package com.bala.dsa.blind75.arraysHashing.encodeAndDecodeStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncodingAndDecoding_Optimal_Approach {

    public static void main(String[] args) {

        EncodingAndDecoding_Optimal_Approach endoa = new EncodingAndDecoding_Optimal_Approach();
        List<String> strs1 = Arrays.asList("Hello", "World");
        String encoded1 = endoa.encode(strs1);

        System.out.println("Encoded: " + encoded1);
        System.out.println("Decoded: " + endoa.decode(encoded1));

        List<String> strs2 = List.of("");
        String encoded2 = endoa.encode(strs2);

        System.out.println("Encoded: " + encoded2);
        System.out.println("Decoded: " + endoa.decode(encoded2));
    }
    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();
        for (String s : strs) {
            res.append(s.length()).append('#').append(s);
        }
        return res.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            j = i + length;
            res.add(str.substring(i, j));
            i = j;
        }
        return res;
    }
}

//TimeComplexity -- O(m) for each encode and decode method calls
//SpaceComplexity -- O(m+n) for each encode and decode method calls
