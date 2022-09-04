/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer_63050200;

/**
 *
 * @author sornp
 */
public class Thai implements MyObserver {
    @Override
    public void update(Source o){
        System.out.println("Thai  "+((Committee)o).getThaiScore()+"-"+((Committee)o).getUaeScore()+"  UAE");
      
    }
}
