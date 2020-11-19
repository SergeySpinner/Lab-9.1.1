package com.task4;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStream in = new FileInputStream("F1.txt");
        ArrayList<String> array = new ArrayList<>();
        char c;
        String s = "";

        while(in.available() != 1){
            c = (char) in.read();
            s = s + c;
        }
        in.close();
        boolean key = true;
        for(String line: s.split("\\."))
        {
            if(key) {
                array.add(line);
                key = false;
            }
            else array.add(line.substring(1,line.length()));
        }
        Collections.sort(array);
        for(int i = 0; i < array.size(); i++)
            System.out.println(array.get(i));
    }
}
