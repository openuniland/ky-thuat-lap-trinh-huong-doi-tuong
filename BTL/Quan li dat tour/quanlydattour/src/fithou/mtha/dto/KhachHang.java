/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fithou.mtha.dto;

import java.io.Serializable;

/**
 *
 * @author FITHOU
 */
public class KhachHang implements Serializable{
    private String maKH, hoTen, nSinh;
    private static final long serialVersionUID = 3543809872183868402L;

    public KhachHang() {
    }

    public KhachHang(String maKH, String hoTen, String nSinh) {
        this.maKH = maKH;
        this.hoTen = hoTen;
        this.nSinh = nSinh;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getnSinh() {
        return nSinh;
    }

    public void setnSinh(String nSinh) {
        this.nSinh = nSinh;
    }

    @Override
    public String toString() {
        return "KhachHang{" + "maKH=" + maKH + ", hoTen=" + hoTen + ", nSinh=" + nSinh + '}';
    }
    
}
