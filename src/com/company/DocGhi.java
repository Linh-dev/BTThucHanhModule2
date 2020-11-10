package com.company;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class DocGhi {
    public ArrayList<DanhBa> doc(){
        ArrayList<DanhBa> arr = new ArrayList<>();
        File file = new File("contacts.csv");
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object obj = null;
            while (fis.available()>0){
                obj = ois.readObject();
                DanhBa db = (DanhBa) obj;
                arr.add(db);
            }
            fis.close();
            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return arr;
    }

    public void ghi(ArrayList<DanhBa> dsDanhBa){
        File file = new File("contacts.csv");
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            for (DanhBa db : dsDanhBa){
                oos.writeObject(db);
            }

            fos.close();
            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
