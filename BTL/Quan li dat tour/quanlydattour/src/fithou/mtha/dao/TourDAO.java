/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fithou.mtha.dao;

import fithou.mtha.dto.Tour;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author FITHOU
 */
public class TourDAO {
    ArrayList<Tour> lsTour;
    File fname = new File("tour.dat");
    
    public TourDAO(){
        lsTour = new ArrayList<>();
    }
    
    public void themTour(Tour tour) throws IOException, FileNotFoundException, ClassNotFoundException{
         if(fname.exists()){
             lsTour = docDSTour();
         }
        lsTour.add(tour);
    }
    
    public void ghiDSTour() throws FileNotFoundException, IOException{
        FileOutputStream out = new FileOutputStream(fname);
        ObjectOutputStream obOut = new ObjectOutputStream(out);
        //kiem tra file va thuc hien ghi file
        if(out !=null){
            //thuc hien ghi du lieu vao file
            obOut.writeObject(lsTour);
        }
        //dong file
        out.close();
        obOut.close();
    }
    
    public ArrayList<Tour> docDSTour() throws FileNotFoundException, IOException, ClassNotFoundException{
         ArrayList<Tour> kq = null;
        FileInputStream in = new FileInputStream(fname);
        ObjectInputStream obIn = new ObjectInputStream(in);
        //kiem tra viec mo file
        if(in!=null){
            //thuc hien doc file
            kq = (ArrayList<Tour>)obIn.readObject();
        }        
        in.close();
        obIn.close();
        return kq;
    }
}
