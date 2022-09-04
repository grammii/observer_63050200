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
    private int someData;
    
    public Committee() {
        this.list = new ArrayList<MyObserver>();
    }
     
    public void setSomeData(int aData) {
        someData = aData;
        notifyObserver();
    }
    
    public int getSomeData(){
        return someData;
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
