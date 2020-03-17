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
public class ShapeTest
{
    public static void main(String[] args)
    {
        //programming for interfaces not implementation
        Shape shape = new Circle(10);
        shape.draw();
        System.out.println("Area="+shape.getArea());
        System.out.println("Radius="+ ((Circle) shape).getRadius());
        
        //switching from one implementation to another easily
        shape = new Rectangle(10,10);
        shape.draw();
        System.out.println("Area="+shape.getArea());
        
        
    }
}
