/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer_63050200;

import java.util.ArrayList;

/**
 *
 * @author sornp
 */
public class Committee implements Source {
    private final ArrayList<MyObserver> list ;
    private int thaiScore;
    private int uaeScore;
    
    public Committee() {
        this.list = new ArrayList<MyObserver>();
    }
     
    public void setSomeData(int thaiData, int uaeData) {
        thaiScore = thaiData;
        uaeScore = uaeData;
        notifyObserver();
    }
    
    public int getThaiScore(){
        return thaiScore;
    }

    public int getUaeScore() {
        return uaeScore;
    }
    
    @Override
    public void register(MyObserver observer){
        list.add(observer);
    }
    
    public void notifyObserver(){
        for(int j = 0;j < list.size();j++){
            list.get(j).update(this);
        }
    }
}
