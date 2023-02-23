/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventory;

/**
 *
 * @author juans
 */
public class ProductTester {
    
    
    public static void main(String[] args) {
        
        Product p1=new Product();
        p1.setNumber(1);
        p1.setName("Pastel de Guayaba");
        p1.setQty(9);
        p1.setPrice(2500);
        
        Product p2= new Product();
        p2.setNumber(2);
        p2.setName("Pastel de Arqeuipe");
        p2.setQty(8);
        p2.setPrice(2500);
        
        Product p3= new Product(3,"Churro",30,1200);
        Product p4= new Product(4,"Rollo",25,1200);
        Product p5= new Product(5,"Bunuelo",50,700);
        Product p6= new Product(6,"Pan",10,4000);
        
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p6);
        
   
        
        
    }
    
}
