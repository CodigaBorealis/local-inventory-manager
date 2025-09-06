/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package localinventorymanager.Classes;

/**
 *
 * @author XD
 */
public class Employee {
    private final String name;
    private final String username;
    private final int id;
    private String position;
    private String shift;
    private String phoneNumber;
    private String picturePath;
    public Employee(String name,String username, int id, String position, String shift, String phoneNumber,String picturePath){
        this.name=name;
        this.username=username;
        this.id=id;
        this.position=position;
        this.shift=shift;
        this.phoneNumber=phoneNumber;
        this.picturePath=picturePath;
    
    
    
    }
    public Employee(String name,String username, int id, String position, String shift, String phoneNumber){
    
    this(name,username,id,position,shift,phoneNumber,null);
    
    
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public int getId() {
        return id;
    }

    public String getPosition() {
        return position;
    }

    public String getShift() {
        return shift;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPicturePath() {
        return picturePath;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", username=" + username + ", id=" + id + ", position=" + position + ", shift=" + shift + ", phoneNumber=" + phoneNumber + ", picturePath=" + picturePath + '}';
    }
    
}
