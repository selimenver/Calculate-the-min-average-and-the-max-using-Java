package main;
import java.util.Scanner;

class Main{
    static int smallest(int x,int y, int z){
        return Math.min(Math.min(x,y),z);
    }

    static int biggest(int x, int y, int z){
        return Math.max(Math.max(x,y),z);
    }

    static double average(double x, double y, double z){
        return (x+y+z) / 3.0;
    }

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        System.out.println("Your first number:");
        int a = reader.nextInt();
        System.out.println("Your second number:");
        int b = reader.nextInt();
        System.out.println("Your third number:");
        int c = reader.nextInt();
        System.out.println("smallest: " + smallest(a,b,c));

        System.out.println("Biggest: " + biggest(a,b,c));

        System.out.println("Average: " + average(a,b,c));
        reader.close();
    }
}
