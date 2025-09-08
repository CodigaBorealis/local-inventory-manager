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
        StorageChecker.inventoryFileExists();
        App app=new App();
        app.setTitle("Local inventory manager");
        app.setLocationRelativeTo(null);
        app.setVisible(true);
    }
      
}
