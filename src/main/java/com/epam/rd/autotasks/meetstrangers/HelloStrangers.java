package com.epam.rd.autotasks.meetstrangers;

import java.io.IOException;
import java.util.Scanner;

public class HelloStrangers {
    public static void main(String[] args) throws IOException {
        Scanner scanNumber = new Scanner(System.in);
        int numberOfStrangers = scanNumber.nextInt();
        if (numberOfStrangers > 0) {
            for (int num = 1;num <= numberOfStrangers;num++) {
                Scanner scanName = new Scanner(System.in);
                String name = scanName.nextLine();
                System.out.println("Hello, " + name);
            }
        } else if (numberOfStrangers == 0) {
            System.out.println("Oh, it looks like there is no one here");
        } else {
            System.out.println("Seriously? Why so negative?");
        }
    }
}
