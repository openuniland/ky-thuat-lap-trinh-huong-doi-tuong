
package bai10;

import java.util.Scanner;

public class TuLanh extends MatHang{
    private int dungTich;
    private String color;
    private String hangSX;
    private int soLuong;
    private float donGia;
        
    public TuLanh(){
    }

    public TuLanh(int dungTich, String color, String hangSX, int soLuong, float donGia) {
        this.dungTich = dungTich;
        this.color = color;
        this.hangSX = hangSX;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }
    
    public float ThanhTien() {
		return soLuong*donGia;             
    }
    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap dung tich: ");
        dungTich = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap mau sac: ");
        color = sc.nextLine();
        System.out.print("Nhap hang SX: ");
        hangSX = sc.nextLine();
        System.out.print("Nhap so luong: ");
        soLuong = sc.nextInt();
        System.out.print("Nhap don gia: ");
        donGia = sc.nextFloat();
    }

    public void hien() {
        super.xuat();
        System.out.println("\n + Dung tich: "+dungTich +"\n + Mau sac: "+color+"\n + Hang SX: "+hangSX+
                           "\n + So luong: "+soLuong+"\n + Don gia: "+donGia+"\n + Thanh tien:"+ThanhTien());
    }
}

