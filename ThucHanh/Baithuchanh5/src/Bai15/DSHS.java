/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai15;

/**
 *
 * @author Admin
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class DSHS {
    ArrayList<HocSinh> listHocSinh = new ArrayList<>();
    int soLuong;

    public void nhapDS() {
        System.out.print("Nhap so luong hoc sinh: ");
        soLuong = new Scanner(System.in).nextInt();
        for (int i = 0; i < soLuong; i++) {
            HocSinh hs = new HocSinh();
            hs.nhap();
            listHocSinh.add(hs);
        }
    }

    public void xuatDS() {
        for (HocSinh hocSinh : listHocSinh) {
            System.out.println("" + hocSinh.gioiThieu());
        }
    }

    public void xuatDS(ArrayList<HocSinh> lsHS) {
        for (HocSinh hocSinh : lsHS) {
            System.out.println("" + hocSinh.gioiThieu());
        }
    }
    public void timKiem() {
        System.out.print("Nhap nam sinh: ");
        int namSinh = new Scanner(System.in).nextInt();
        for (HocSinh hocSinh : listHocSinh) {
            if (namSinh == hocSinh.getNamSinh()) {
                System.out.println("" + hocSinh.gioiThieu());
            }
        }
    }

    public void ghiFile(File fName) throws FileNotFoundException, IOException {
        FileOutputStream fos = new FileOutputStream(fName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(listHocSinh);
        oos.close();
    }

    ArrayList<HocSinh> docFile(File fName) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(fName);
        ObjectInputStream ois = new ObjectInputStream(fis);
        listHocSinh= (ArrayList<HocSinh>) ois.readObject();
      
        ois.close();
        xuatDS(); 
        return listHocSinh;
    }
}
