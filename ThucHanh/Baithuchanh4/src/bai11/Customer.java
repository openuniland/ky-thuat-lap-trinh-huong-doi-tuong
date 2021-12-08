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
public class Customer extends Person {
    private String tenCongTy;
    private float giaTriHoaDon;

    public Customer() {
    }

    public Customer(String tenCongTy, float giaTriHoaDon, String hoTen, String diaChi) {
        super(hoTen, diaChi);
        this.tenCongTy = tenCongTy;
        this.giaTriHoaDon = giaTriHoaDon;

    }

    public String getTenCongTy() {
        return tenCongTy;
    }

    public void setTenCongTy(String tenCongTy) {
        this.tenCongTy = tenCongTy;
    }

    public float getGiaTriHoaDon() {
        return giaTriHoaDon;
    }

    public void setGiaTriHoaDon(float giaTriHoaDon) {
        this.giaTriHoaDon = giaTriHoaDon;
    }

    @Override
    public void hienThongTin() {
        super.hienThongTin(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Ten cong ty: "+this.tenCongTy);
        System.out.println("Gia tri hoa don: "+this.giaTriHoaDon);
    }
}

