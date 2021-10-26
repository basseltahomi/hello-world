

package edu.pcc.cis.helloworld;

import java.util.Date;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        String user_name;
        System.out.print("Please enter your name: ");
        Scanner user_input = new Scanner(System.in);
        user_name = user_input.next();
        System.out.println("Hello " + user_name + "!");
        System.out.println(new Date());
    }
}
