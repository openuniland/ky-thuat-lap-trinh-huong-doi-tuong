/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fithou.mtha.dao;

import fithou.mtha.dto.DatTour;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * thuc hien tren danh sach dat tour
 * ghi du lieu vao file dattour.dat
 * @author FITHOU
 */
public class DatTourDAO {
    ArrayList<DatTour> lsDatTour;
    File fname = new File("dattour.dat");
    public DatTourDAO(){
        lsDatTour = new ArrayList<>();
    }
    
    public void themDatTour(DatTour dt) throws IOException, FileNotFoundException, ClassNotFoundException{
         if(fname.exists()){
             lsDatTour = docDSDatTour();
         }
        lsDatTour.add(dt);        
    }
    
      //thuc hien ghi ds khach hang vao file
    public void ghiDSDatTou() throws FileNotFoundException, IOException{     
        FileOutputStream out = new FileOutputStream(fname);
        ObjectOutputStream obOut = new ObjectOutputStream(out);
        //kiem tra file va thuc hien ghi file
        if(out !=null){
            //thuc hien ghi du lieu vao file
            obOut.writeObject(lsDatTour);
        }
        //dong file
        out.close();
        obOut.close();
    }
    
    //doc du lieu tu file do vao danh sach
    public ArrayList<DatTour> docDSDatTour() throws FileNotFoundException, IOException, ClassNotFoundException{
        ArrayList<DatTour> kq = null;
        FileInputStream in = new FileInputStream(fname);
        ObjectInputStream obIn = new ObjectInputStream(in);
        //kiem tra viec mo file
        if(in!=null){
            //thuc hien doc file
            kq = (ArrayList<DatTour>)obIn.readObject();
        }
        
        in.close();
        obIn.close();
        return kq;
    }
}
