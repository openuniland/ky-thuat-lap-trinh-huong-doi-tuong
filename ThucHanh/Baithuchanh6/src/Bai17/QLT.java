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
public class QLT implements Serializable,GiaoTiep{
    private Tour t;
    private KhachHang h;
  
    

    public Tour getT() {
        return t;
    }

    public void setT(Tour t) {
        this.t = t;
    }

    public KhachHang getH() {
        return h;
    }

    public void setH(KhachHang h) {
        this.h = h;
    }

    
    @Override
    public Object[] toObject() {
        return new Object[]{
            this.getT().getMa(),this.getH().getMakh(),this.getH().getTenkh(),this.getH().getKieukh(),this.getT().getKieu()
        };
    }
    
}
