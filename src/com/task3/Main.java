package com.task3;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStream in = new FileInputStream("F1.txt");
        Map<String, Integer> tempTreeMap = new HashMap<>();
        char c;
        String s = "";

        while(in.available() != 1){
            c = (char) in.read();
            if(c != ' ' && c != '.' && (int)c != 10){
                s = s + c;
            }
            else
            {
                if(s != "")
                tempTreeMap.put(s.toLowerCase(), 0);
                s = "";
            }
        }
        in.close();

        c = 0;
        s = "";


       in = new FileInputStream("F1.txt");
       tempTreeMap.remove("");
       while(in.available() != 1){
           c = (char) in.read();
           if(c != ' ' && c != '.' && (int)c != 10){
               s = s + c;
           }
           else
           {
               try {
                   tempTreeMap.put(s.toLowerCase(), tempTreeMap.get(s.toLowerCase()) + 1);
                   s = "";
               }
               catch (NullPointerException e) {}
           }
       }
       in.close();
       Set<String> keys = tempTreeMap.keySet();
       TreeMap<String,Double> tempTree = new TreeMap<>();
       int sumUp = 0;

       for(var index: keys) sumUp += tempTreeMap.get(index);

       for(var index: keys) tempTree.put(index, (double)tempTreeMap.get(index) / sumUp);

       System.out.println(tempTree + "\n" + sumUp);
    }
}
