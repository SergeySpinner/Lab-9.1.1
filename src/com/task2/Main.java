package com.task2;

import java.io.*;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStream in = new FileInputStream("F1.txt");
        TreeSet<String> tempTreeSet = new TreeSet<String>();
        char c;
        String s = "";
        while(in.available() != 1){
            c = (char) in.read();
            if(c != ' ' && c != '.' && (int)c != 10) s = s + c;
            else
            {
                tempTreeSet.add(s.toLowerCase());
                s = "";
            }
        }
        in.close();

        for(var temp:tempTreeSet)
            System.out.println(temp);
    }
}
