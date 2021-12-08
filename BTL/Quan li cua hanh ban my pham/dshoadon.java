/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaplonlamlai;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

/**
 *
 * @author ADMIN
 */
public class dshoadon {
    public int n;
    public float tonghd=0;
    ArrayList<hoadon> listhd;
    public void nhapdshd(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong hoa don: ");
        while(true) {
			try {
				n=sc.nextInt();
				if(n<=0) throw new Exception(); 	/*số hóa đơn phải >0*/
				break;
			} catch (Exception e) {
				System.out.print("Nhập sai giá trị nhập lại: ");
				sc.nextLine();
			}
		}
        listhd = new ArrayList(n);
        for(int i=0;i<n;i++){
            hoadon x = new hoadon();
            x.nhaphd();
            listhd.add(x);
        }
    }
    public void hiendshd(){
        for (hoadon x : listhd) {
            x.hienhd();
        }
        System.out.println("Tong tien cac hoa don: "+tonghd());
        System.out.println("=====================");
    }   
    public float tonghd(){
        for (hoadon x : listhd) {
            tonghd = tonghd + x.tinhtong();
        }
        return tonghd;
    }
    public void them(){
        Scanner sc = new Scanner(System.in);
        int them;
        int kt=0;
        System.out.println("Nhap so luong muon them: ");
        them = sc.nextInt();
        for (int i=0;i<listhd.size();i++) {
            if(listhd.get(i).getMahd().equals(them))
            {System.out.println("Hoa don da ton tai");
            kt=1;}
        }
        if(kt!=0){
        for(int i=0;i<them;i++){
            hoadon x = new hoadon();
            x.nhaphd();
            listhd.add(x);
        }}
        System.out.println("DANH SACH SAU KHI THEM");
        for (hoadon y : listhd) {
                y.hienhd();
            }
    }
    public void sua(){
        Scanner sc = new Scanner(System.in);
        String sua;
        int k=0;
        System.out.println("Nhap ma hoa don muon sua: ");
        sua= sc.nextLine();
        for(int i=0;i<listhd.size();i++){
            if(sua.equals(listhd.get(i).getMakh())){
                k=1;
                hoadon x = new hoadon();
                x.nhaphd();
                listhd.set(i, x);
            }
        }
        if(k!=0){
            System.out.println("DANH SACH SAU KHI SUA");
            for (hoadon y : listhd) {
                y.hienhd();
            }
        }
        else{
        System.out.println("Khong co ma hoa don tuong ung");
        }
       
    }
    public void xoa(){
        Scanner sc = new Scanner(System.in);
        String xoa;
        int k;
        System.out.println("Nhap ma hoa don muon xoa");
        xoa = sc.nextLine();
        for(int i = 0;i<listhd.size();i++){
            if(xoa.equals(listhd.get(i).getMakh())){
                listhd.remove(i);
            }
        }
        System.out.println("DANH SACH SAU KHI XOA");
        for (hoadon y : listhd) {
                y.hienhd();
            }
    }
    public void sapxep(){
        System.out.println("DANH SACH HOA DON SAU KHI SAP XEP THEO MA HOA DON");
        hoadon tg;
        for(int i=0;i<n-1;i++)
            for(int j=i+1;j<n;j++){
                if(listhd.get(i).getMahd().compareTo(listhd.get(j).getMahd())>0){
                  tg = listhd.get(i);
                  listhd.set(i,listhd.get(j));
                  listhd.set(j, tg);
                }
            }
        for (hoadon x : listhd) {
            x.hienhd();
        }
    }
    public void ghifile() throws FileNotFoundException, IOException{
        FileOutputStream out = new FileOutputStream("baongu.txt");
        ObjectOutputStream objout = new ObjectOutputStream(out);
        objout.writeObject(listhd);
        objout.close();
    }
    public ArrayList<hoadon> docfile() throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream in = new FileInputStream("baongu.txt");
        ObjectInputStream objin = new ObjectInputStream(in);
        listhd = (ArrayList<hoadon>)objin.readObject();
        objin.close();
        return listhd;
    }

    void hiendshd(ArrayList<hoadon> list) {
        System.out.println("DANH SACH SAU KHI DOC FILE");
        for (hoadon x : listhd) {
            x.hienhd();
        }
    }
}
