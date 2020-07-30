package com.buzzardsview.readit;

import java.io.File;
import java.io.IOException;

public class Runner {

    public static void main(String[] args) {
        String filePath = new File("").getAbsolutePath();
        String command = "python " + filePath + "\\src\\python\\main.py";
        System.out.println(filePath);;
        try {
            Process p = Runtime.getRuntime().exec(command);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
