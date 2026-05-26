package com.bala.dsa.blind75.arraysHashing.encodeAndDecodeStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncodingAndDecoding {

    public static void main(String[] args) {

        EncodingAndDecoding end = new EncodingAndDecoding();
        List<String> strs1 = Arrays.asList("Hello", "World");
        String encoded1 = end.encode(strs1);

        System.out.println("Encoded: " + encoded1);
        System.out.println("Decoded: " + end.decode(encoded1));

        List<String> strs2 = List.of("");
        String encoded2 = end.encode(strs2);

        System.out.println("Encoded: " + encoded2);
        System.out.println("Decoded: " + end.decode(encoded2));
    }
    public String encode(List<String> strs) {
        if (strs.isEmpty()) return "";
        StringBuilder res = new StringBuilder();
        List<Integer> sizes = new ArrayList<>();
        for (String str : strs) {
            sizes.add(str.length());
        }
        for (int size : sizes) {
            res.append(size).append(',');
        }
        res.append('#');
        for (String str : strs) {
            res.append(str);
        }
        return res.toString();
    }

    public List<String> decode(String str) {
        if (str.isEmpty()) {
            return new ArrayList<>();
        }
        List<String> res = new ArrayList<>();
        List<Integer> sizes = new ArrayList<>();
        int i = 0;
        while (str.charAt(i) != '#') {
            StringBuilder cur = new StringBuilder();
            while (str.charAt(i) != ',') {
                cur.append(str.charAt(i));
                i++;
            }
            sizes.add(Integer.parseInt(cur.toString()));
            i++;
        }
        i++;
        for (int sz : sizes) {
            res.add(str.substring(i, i + sz));
            i += sz;
        }
        return res;
    }
}

//TimeComplexity -- O(m) for each encode and decode method calls
//SpaceComplexity -- O(m+n) for each encode and decode method calls
