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
public class DatTour implements Serializable{
    private KhachHang kh;
    private Tour tour;
    private int soNgay;
    private static final long serialVersionUID = 3543809872183868402L;

    public DatTour() {
    }

    public DatTour(KhachHang kh, Tour tour, int ngayDat) {
        this.kh = kh;
        this.tour = tour;
        this.soNgay = ngayDat;
    }

    public int getNgayDat() {
        return soNgay;
    }

    public void setNgayDat(int ngayDat) {
        this.soNgay = ngayDat;
    }

    public KhachHang getKh() {
        return kh;
    }

    public void setKh(KhachHang kh) {
        this.kh = kh;
    }

    public Tour getTour() {
        return tour;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
    }

    @Override
    public String toString() {
        return "DatTour{" + "kh=" + kh.toString() + '}';
    }
    
    
}
