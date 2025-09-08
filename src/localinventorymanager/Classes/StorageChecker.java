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

            }
            if (!jsonFile.exists()) {
                try (FileWriter writer = new FileWriter(jsonFile)) {
                    writer.write("{}");
                    writer.flush();

                }
            }
        } catch (IOException e) {
        }
    }
}
