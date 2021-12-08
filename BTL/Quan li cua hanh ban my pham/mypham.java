
package baitaplonlamlai;

import java.io.Serializable;
import java.util.*;

public class mypham implements Serializable{
   private String masp;
   private String tensp;
   private String mancc;
   private int sl;
   private float giaban;

    public mypham(String masp, String tensp, String mancc, int sl, float giaban) {
        this.masp = masp;
        this.tensp = tensp;
        this.mancc = mancc;
        this.sl = sl;
        this.giaban = giaban;
    }

    public mypham() {
        masp = "";
        tensp = "";
        mancc = "";
        sl = 0;
        giaban = 0;
    }
    
    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public String getMancc() {
        return mancc;
    }

    public void setMancc(String mancc) {
        this.mancc = mancc;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public float getGiaban() {
        return giaban;
    }

    public void setGiaban(float giaban) {
        this.giaban = giaban;
    }
    public void nhapmp(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma san pham: ");masp = sc.nextLine();System.out.println("Nhap ten sp: ");tensp=sc.nextLine();System.out.println("Nhap ma nha cung cap: ");mancc = sc.nextLine();System.out.println("Nhap so luong: ");sl=sc.nextInt();System.out.println("Nhap gia ban: ");giaban=sc.nextFloat();
        
    }
    public void hienmp(){
        System.out.println("Ma san pham: "+masp);System.out.println("Ten san pham: "+tensp);System.out.println("Ma nha cung cap: "+mancc);System.out.println("So luong: "+sl);System.out.println("Gia ban: "+giaban);
    }

    @Override
    public String toString() {
        return "mypham{" + "masp=" + masp + ", tensp=" + tensp + ", mancc=" + mancc + ", sl=" + sl + ", giaban=" + giaban + '}';
    }
    
}
