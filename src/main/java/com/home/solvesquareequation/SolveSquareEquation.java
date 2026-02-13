/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.home.solvesquareequation;
/**
 *
 * @author PC
 */
public class SolveSquareEquation 
{

    public static void main(String[] args) throws Exception
    {
        var console = System.console();
        System.out.println("Input coefficients of square equation");
        var a = Float.parseFloat(console.readLine());
        var b = Float.parseFloat(console.readLine());
        var c = Float.parseFloat(console.readLine());
        System.out.printf
        (
            "Try to solve the equation:%f*x^2+%f*x+%f=0\r\n", 
            a, b, c
        );
        if(a == 0)
        {
            if ((b == 0) && (c == 0))
            {
                System.out.println("The answer is any number");
            }
            else if ((b == 0) && (c != 0))
            {
                System.out.println("The equation has no roots");
            }
            else
            {
                System.out.printf
                (
                    "The equation has the following root:%f\r\n", 
                    -c / b
                );
            }
        }
        else
        {
            var d = b * b - 4 * a * c;
            var nRoots = Math.signum(d) + 1;
            if (nRoots > 0)
            {
                var x1 = (-b - Math.sqrt(d)) / (2 * a);
                var x2 = (-b + Math.sqrt(d)) / (2 * a);
                System.out.println("The equation has the following roots:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
            else
            {
                System.out.println("The equation has no roots");
            }
        }
    }
}
