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
        App app=new App();
        app.setTitle("Local inventory manager");
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        Item test=new Item.Builder(0, "name", 0, true).build();
        System.out.println(test.getName());
    }
      
}
