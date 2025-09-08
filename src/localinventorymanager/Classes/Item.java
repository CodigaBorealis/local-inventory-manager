/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package localinventorymanager.Classes;

import java.time.LocalDateTime;

/**
 * Represents an item in the inventory.
 * Instances should be created using the{@link Builder}.
 *
 * <p>Example usage:</p>
 * <pre>
 *     Item item = new Item("Cookie", 0.99f,...args);
 * </pre>
 *
 * @author CodigaBorealis
 * @version 1.0
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
    private String supplier;
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

    @Override
    public String toString() {
        return "name: " + name +"\n "+ "description: " + description +"\n"+ "category: " + category +"\n"+ "stock: " + stock +"\n"+"price: " + price +"\n"+"id: " + id +"\n"+"status: " + status +"\n"+"stockBound: " + stockBound +"\n"+ "supplier:" + supplier;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public int getStock() {
        return stock;
    }

    public float getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    public boolean isStatus() {
        return status;
    }

    public String getImagePath() {
        return imagePath;
    }

    public int getStockBound() {
        return stockBound;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public void setStockBound(int stockBound) {
        this.stockBound = stockBound;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }
 /**
 * Builder for creating {@code Item} instances.
 */
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
    public Item build(){
        
        return new Item(this);
    
    }
            }
}


