/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPS.Abstraction.Interfaces;

/**
 *
 * @author HP
 */
public class Circle implements Shape
{
    private double radius;
    
    public Circle(double r)
    {
        this.radius = r;
    }

    @Override
    public void draw()
    {
        System.out.println("Drawing Circle");
    }

    @Override
    public double getArea()
    {
        return Math.PI * radius * radius;
    }
 
    public double getRadius()
    {
        return radius;
    }
}
