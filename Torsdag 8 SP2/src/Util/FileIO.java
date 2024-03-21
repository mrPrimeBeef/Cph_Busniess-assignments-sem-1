package Util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIO {

    public ArrayList<String> readData(String path) {

        ArrayList<String> dataList = new ArrayList<>();

        File file = new File(path);
        try {
            Scanner scan = new Scanner(file);
            scan.nextLine();//skip header

            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                dataList.add(line);
            }

        } catch (FileNotFoundException e) {

            System.out.println("File was not found");

        }
        return dataList;
    }


    public void saveData(ArrayList<String> dataList, String path, String header) {

        try {
            FileWriter writer = new FileWriter(path);
            writer.write(header + "\n"); //Giv csv filen en header
            for (String element : dataList) {
                writer.write(element + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("File was no saved");

        }
    }


}
