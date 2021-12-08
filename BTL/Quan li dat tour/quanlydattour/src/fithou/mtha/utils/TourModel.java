/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fithou.mtha.utils;

import fithou.mtha.dto.Tour;
import java.util.ArrayList;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author FITHOU
 */
public class TourModel extends AbstractListModel implements ComboBoxModel{
    ArrayList<Tour> lsTour;
    Tour tour = null;
    
    public TourModel(ArrayList<Tour> tour){
        super();
        lsTour = tour;      
    }
    @Override
    public int getSize() {
        return lsTour.size();
    }

    @Override
    public Object getElementAt(int i) {
        return lsTour.get(i);
    }

    @Override
    public void setSelectedItem(Object o) {
        tour = (Tour)o;
    }

    @Override
    public Object getSelectedItem() {
        return tour;
    }
    
}
