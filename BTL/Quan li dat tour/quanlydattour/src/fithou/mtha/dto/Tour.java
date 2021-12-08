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
public class Tour implements Serializable{
    private String maTour, thongTinTour;
    private static final long serialVersionUID = 3543809872183868402L;
    private double donGia;

    public Tour() {
    }

    public Tour(String maTour, String thongTinTour, double donGia) {
        this.maTour = maTour;
        this.thongTinTour = thongTinTour;
        this.donGia = donGia;
    }

    public String getMaTour() {
        return maTour;
    }

    public void setMaTour(String maTour) {
        this.maTour = maTour;
    }

    public String getThongTinTour() {
        return thongTinTour;
    }

    public void setThongTinTour(String thongTinTour) {
        this.thongTinTour = thongTinTour;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    
    
}
