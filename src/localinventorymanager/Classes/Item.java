/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package localinventorymanager.Classes;

/**
 *
 * @author XD
 */

public class Item {
    private String name;
    private String description;
    private String category;
    private int stock;
    private float price;
    private int id;
    private boolean status;
    private String imagePath;
    private int stockBound;
    String supplier;
    private Item(Builder builder){
        this.name=builder.name;
        this.description=builder.description;
        this.category=builder.category;
        this.stock=builder.stock;
        this.price=builder.price;
        this.status=builder.status;
        this.imagePath=builder.imagePath;
        this.stockBound=builder.stockBound;
        this.supplier=builder.supplier;
        this.id=builder.id;
    }
    public static class Builder{
        //must have
        private int id;
        private String name;
        private float price;
        private boolean status;
        
        //optionals
        private String description=null;
        private String category=null;
        private int stock=0;
        private String imagePath=null;
        private int stockBound=0;
        private String supplier=null;
    
    public Builder(int id, String name, float price, boolean status){
        this.id=id;
        this.name=name;
        this.price=price;
        this.status=status;
                    }
    public Builder description(String description){
    
        this.description=description;
        return this;
    
    }
    public Builder category(String category){
    
        this.category=category;
        return this;
    
    }
    public Builder stock(int stock){
    
        this.stock=stock;
        return this;
    
    }
    public Builder imagePath(String imagePath){
    
        this.imagePath=imagePath;
        return this;
    
    }
    public Builder stockBound(int stockBound){
    
        this.stockBound=stockBound;
        return this;
    
    }
    public Builder supplier(String supplier){
    
        this.supplier=supplier;
        return this;
    
    }
            }
}


