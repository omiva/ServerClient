package com.company;

import java.lang.*;
import java.io.*;
import java.net.*;
import java.util.Scanner;

class Server {
    public static void main(String[] args)
    {
        System.out.println("Enter the text: ");
        Scanner ss = new Scanner(System.in);
        String data = ss.nextLine();
//        System.out.println("the input string is "+data);
        try {
            ServerSocket srvr = new ServerSocket(1234);
            Socket skt = srvr.accept();
            System.out.print("Server has connected!\n");
            PrintWriter out = new PrintWriter(skt.getOutputStream(), true);
            System.out.print("Sending string: '" + data + "'\n");
            out.print(data);
            out.close();
            skt.close();
            srvr.close();
        }
        catch(Exception e) {
            System.out.print("It didn't work!\n");
        }
    }
}