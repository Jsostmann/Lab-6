/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg6;

/**
 *
 * @author jamesostmann
 */
public class Main {
    public static void main(String[] args) {
        A a = new A();
        a.setU(0);
        
        B b = new B();
        b.setU(5);
        System.out.println("a: u Value is " + a.getU());
        System.out.println("b: u Value is " + b.getU());
    }
}
