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
public class Rectangle implements Shape
{
    private double width;
    private double height;
	
    public Rectangle(double w, double h)
    {
        this.width=w;
        this.height=h;
    }

    @Override
    public void draw()
    {
        System.out.println("Drawing Rectangle");
    }

    @Override
    public double getArea()
    {
        return this.height*this.width;
    }
}
