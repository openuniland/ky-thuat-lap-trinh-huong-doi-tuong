/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai7;

/**
 *
 * @author Admin
 */
public class Diem {
    private float x, y;
    public Diem(){       
    }
    Diem (float x, float y) {
        this.x = x;
        this.y = y;
    }
    
    public float getX () {
        return x;
    }
    public void setX(float x) {
        this.x = x;
    }
    public float getY () {
        return y;
    }
    public void setY(float y) {
        this.y = y;
    }
    @Override
    public String toString() {
        return "(" +x+ ";" +y+ ')';
    }
}
