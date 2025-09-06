/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package localinventorymanager.Classes;

/**
 *
 * @author XD
 */
public class LocalInventoryManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Item test=new Item.Builder(12,"casa",3.4f,true).category("da").build();
    System.out.println(test.toString());  
    }
    
}
