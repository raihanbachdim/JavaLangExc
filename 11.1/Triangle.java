/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.upi.tugas11_1;

/**
 *
 * @author Ian
 */
public class Triangle extends GeometriObject{
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;
    public Triangle(){}
    public Triangle(double side1,double side2,double side3){
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }
    public double getSide1() {
        return side1;
    }
    public double getSide2() {
        return side2;
    }
    public double getSide3() {
        return side3;
    }
    
    public double getPerimeter(){
        return this.side1+this.side2+this.side3;
    }
    public double getArea(){
        double s=getPerimeter()/2;
        return Math.sqrt(s*(s-this.side1)*(s-this.side2)*(s-this.side3));
    }
    public String toString(){
        return "Triangle : side 1 = "+this.side1+" side 2 = "+this.side2+" side 3 = "+this.side3;
    }    
}
