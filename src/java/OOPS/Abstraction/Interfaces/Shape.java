/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPS.Abstraction.Interfaces;

import java.io.Serializable;
import java.util.RandomAccess;



/**
 *
 * @author HP
 */
public interface Shape
{
    //implicitly public, static and final
    public String LABLE="Shape";

    //interface methods are implicitly abstract and public
    void draw();

    double getArea();
}
