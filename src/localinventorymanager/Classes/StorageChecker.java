/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package localinventorymanager.Classes;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author XD
 */
public class StorageChecker {
      public static void inventoryFileExists() {
        String folderName = "storage";
        String fileName = "inventory.json";
        File directory = new File(folderName);
        File jsonFile = new File(directory, fileName);
        try {
            if (!directory.exists()) {
                directory.mkdirs();
                System.out.println("Created directory: " + folderName);
                
            }
            if (!jsonFile.exists()) {
                boolean created = jsonFile.createNewFile();
                try(FileWriter writer=new FileWriter(jsonFile)){
                writer.write("{}");
                writer.flush();
                
                }
                if (created) {
                    System.out.println("Created file: " + jsonFile.getPath());
                } else {
                    System.out.println("Failed to create file.");
                }
            } else {
                System.out.println("File already exists: " + jsonFile.getPath());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
