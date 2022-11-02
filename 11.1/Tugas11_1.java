/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.upi.tugas11_1;
import java.util.Scanner;
/**
 *
 * @author Ian
 */
public class Tugas11_1 {

    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        
        System.out.println("Enter the sides of triangle : ");
        double s1 = aa.nextDouble();
        double s2 = aa.nextDouble();
        double s3 = aa.nextDouble();
        aa.nextLine();
        
        System.out.println("Enter the color triangle : ");
        String clr = aa.nextLine();
        
        System.out.println("Is the triangle filled? ");
        boolean fill = aa.nextBoolean();
        
        Triangle a = new Triangle(s1,s2,s3);
        a.setColor(clr);
        a.setFilled(fill);
        
        System.out.println(a.toString());
        System.out.println("Perimeter : "+a.getPerimeter());
        System.out.println("Area      : "+a.getArea());
        System.out.println("Color     : "+a.getColor());
        System.out.println("The triangle filled is "+a.isFilled());
        System.out.println("Created on "+a.getDateCreated());
    }
}
