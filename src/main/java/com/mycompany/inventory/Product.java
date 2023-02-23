/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventory;

/**
 *
 * @author juans
 */
public class Product {
    
    //Instance field declarations
    private int number;
    private String name;
    private int qty;
    private int price;
    
    
    //Constructor sin parametros
    Product(){
        
        number=0;
        name="";
        qty=0;
        price=0;
        
    }
    
    
    //Constructor con parametros sobrecargado
    Product(int number, String name, int qty, int price){
        
        this.name=name;
        this.number=number;
        this.qty=qty;
        this.price=price;
        
    }
    
    //Obtiene el nombre del producto
    public String getName(){
        
        return name;
               
    }
    
    //Obtiene el numero de identificacion del producto
    public int getNumber(){
        
        return number;
               
    }
    
    //Obtiene el numero de productos que quedana
    public int getQty(){
        
        return qty;
               
    }
    
    //Obtiene el precio del producto
    public int getPrice(){
        
        return price;
               
    }
    
    //Le da un nombre al producto
    public void setName(String name){
        
        this.name=name;
               
    }
    
    //Le da un numero de identificacion al producto
    public void setNumber(int number){
        
        this.number=number;
               
    }
    
    //Le da la cantidad de productos restantes
    public void setQty(int qty){
        
        this.qty=qty;
               
    }
    
    //Le da el precio al producto
    public void setPrice(int price){
        
        this.price=price;
               
    }
    
    
    public String toString(){
    
        String p1="";
        p1="Item number: "+getNumber()+ "\n"
          +"Name: "+getName()+"\n"
          +"Quantity in stock: "+getQty()+"\n"
          +"Price: "+getPrice()+"\n\n\n";
        
        return p1;
        
    }   
    
    
}
