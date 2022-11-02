/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.upi.tugas11_1;

/**
 *
 * @author Ian
 */
public abstract class GeometriObject {
  private String color = "white";
  private boolean filled;
  private java.util.Date dateCreated;

  protected GeometriObject() {
    dateCreated = new java.util.Date();
  }

  protected GeometriObject(String color, boolean filled) {
    dateCreated = new java.util.Date();
    this.color = color;
    this.filled = filled;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public boolean isFilled() {
    return filled;
  }

  public void setFilled(boolean filled) {
    this.filled = filled;
  }

  public java.util.Date getDateCreated() {
    return dateCreated;
  }

  public String toString() {
    return "created on " + dateCreated + "\ncolor: " + color +
      " and filled: " + filled;
  }

    
}
