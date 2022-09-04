/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer_63050200;

import java.util.*;
/**
 *
 * @author sornp
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Committee obj = new Committee();
        Thai obj1 = new Thai();
        UAE obj2 = new UAE();
        
        obj.register(obj1);
        obj.register(obj2);
        
        int thaiScore = sc.nextInt();
        int uaeScore = sc.nextInt();
        
        
        
        System.out.println(thaiScore+"  "+uaeScore);
        
        
    }
    
}
