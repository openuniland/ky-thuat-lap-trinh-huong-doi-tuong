/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.GiaoTiep;
import java.io.Serializable;

/**
 *
 * @author HongSon
 */
public class KhachHang implements Serializable, GiaoTiep{
private int makh;
private String tenkh;
private String kieukh;

    public int getMakh() {
        return makh;
    }

    public void setMakh(int makh) {
        this.makh = makh;
    }

    public String getTenkh() {
        return tenkh;
    }

    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
    }

    public String getKieukh() {
        return kieukh;
    }

    public void setKieukh(String kieukh) {
        this.kieukh = kieukh;
    }

    
    @Override
    public Object[] toObject() {
        return new Object[]{
        this.getMakh(),this.getTenkh(),this.getKieukh()
    };
    
}
}

