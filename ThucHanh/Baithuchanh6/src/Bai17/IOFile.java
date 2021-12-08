package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HongSon
 */
public class IOFile {
    public void ghiFile(List list, String filename ){
        try(FileOutputStream fos = new FileOutputStream(new File(filename))){
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
        }catch(Exception e){
            System.out.println("got an exception.");
        }
    }
    
    public List docFile(String filename){
        ArrayList list = new ArrayList();
        
        try(FileInputStream fos = new FileInputStream(new File(filename))){
            ObjectInputStream ois = new ObjectInputStream(fos);
            list = (ArrayList) (List) ois.readObject();
        }catch(Exception e){
            System.out.println("got an exception.");
        }
        return list;
    }
}
