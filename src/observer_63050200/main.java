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

        String readString = sc.nextLine();
        while (true) {
            try {
                String[] a;
                a = readString.split("\\s+");
                obj.setSomeData(Integer.parseInt(a[0]),Integer.parseInt(a[1]));
                
                if (readString.equals(""))
                    break;
                if (sc.hasNextLine())
                    readString = sc.nextLine();
            } catch (Exception e) {
                break;
            }
        }
    }  
}
