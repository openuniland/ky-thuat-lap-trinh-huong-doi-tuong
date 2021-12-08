/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fithou.mtha.dao;

import fithou.mtha.dto.KhachHang;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * xu ly danh sach khach hang
 * thuc hien doc ghi file
 * @author FITHOU
 */
public class KhachHangDAO {
    ArrayList<KhachHang> lsKH;
    File fname = new File("khachhang.dat");
    public KhachHangDAO(){
        lsKH = new ArrayList<KhachHang>();
    }
    
    public boolean themKhachHang(KhachHang kh) throws IOException, FileNotFoundException, ClassNotFoundException{
        //thuc hien doc du lieu cu tu file
        if(fname.exists()){
            //thuc hien doc du lieu
            lsKH = docDSKH();
        }
        return lsKH.add(kh);
    }
    
    //thuc hien ghi ds khach hang vao file
    public void ghiDSKH() throws FileNotFoundException, IOException{     
        FileOutputStream out = new FileOutputStream(fname);
        ObjectOutputStream obOut = new ObjectOutputStream(out);
        //kiem tra file va thuc hien ghi file
        if(out !=null){
            //thuc hien ghi du lieu vao file
            obOut.writeObject(lsKH);
        }
        //dong file
        out.close();
        obOut.close();
    }
    
    //doc du lieu tu file do vao danh sach
    public ArrayList<KhachHang> docDSKH() throws FileNotFoundException, IOException, ClassNotFoundException{
        ArrayList<KhachHang> kq = null;
        FileInputStream in = new FileInputStream(fname);
        ObjectInputStream obIn = new ObjectInputStream(in);
        //kiem tra viec mo file
        if(in!=null){
            //thuc hien doc file
            kq = (ArrayList<KhachHang>)obIn.readObject();
        }
        
        in.close();
        obIn.close();
        return kq;
    }
}
