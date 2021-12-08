/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai11;

/**
 *
 * @author Admin
 */
public class Employee extends Person{
    private float heSoLuong;
    final float LUONG_CO_BAN = 1000000;
    public float getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(float heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public Employee() {
    }

    public Employee(float heSoLuong, String hoTen, String diaChi) {
        super(hoTen, diaChi);
        this.heSoLuong = heSoLuong;
    }
    
    public float tinhLuong(){
        return LUONG_CO_BAN * this.heSoLuong;
    }

    @Override
    public void hienThongTin() {
        super.hienThongTin(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("He so luong: "+this.heSoLuong);
        System.out.println("Tinh luong: "+ tinhLuong());
    }
    
}