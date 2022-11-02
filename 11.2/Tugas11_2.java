/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.upi.tugas11_2;

/**
 *
 * @author Ian
 */
public class Tugas11_2 {

    public static void main(String[] args) {
        
        Person xperson = new Person("Sambo","Sapan","081208122180","sahabatsambo@gmail.com");
        System.out.println(xperson.toString());
        System.out.println("");
        
        Student xstudent = new Student("Ilham","Bandung","0001123","sss@gmail.com","Sophomore");
        System.out.println(xstudent.toString());
        System.out.println("");
        
        Employee xemploye = new Employee("Udan","Tasik","000112392","udan@gmail.com","PT. ABC",200000);
        System.out.println(xemploye.toString());
        System.out.println("");
        
        Faculty xfacult = new Faculty("Idan","Ujung Berug","12349","idann@gmail.com","PT. XYZ",290000,8,"High Rank");
        System.out.println(xfacult.toString());
        System.out.println("");
        
        Staff xstf = new Staff("Usman","Cikutra","1294242","cikutra@gmail.com","PT. PQR",2920000,"Office Boy");
        System.out.println(xstf.toString());
        System.out.println("");
    }
}
