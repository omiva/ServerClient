package com.company;

import java.lang.*;
import java.io.*;
import java.net.*;

class Client {
    public static void main(String[] args) {
        try {
            Socket skt = new Socket("localhost", 1234);
            BufferedReader in = new BufferedReader(new InputStreamReader(skt.getInputStream()));
            System.out.print("Received string: ");

//            while (!in.ready()) {
//
//            }
            System.out.println(in.readLine()); // Read one line and output it
            in.close();
        }
        catch(Exception e) {
            System.out.print("It didn't work!\n");
        }
    }
}