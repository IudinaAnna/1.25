package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
    System.out.println("number 1:");
    int x1=input.nextInt();
    if (x1 % 2==0) System.out.println(x1+"четное число");
    else System.out.println(x1+"нечетное");
    }
}
