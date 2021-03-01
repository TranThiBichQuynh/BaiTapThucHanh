/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package demo_bieuthuc_toanhoc_logic;

/**
 *
 * @author Administrator
 */
public class vidu3_quanhe_logic {
    public static void main(String[] args) {
         //biểu thức quan hệ >, <, >=,<=, ==, !=
        boolean logic;
        logic = 10 < 5;
        System.out.println("10<5 = " + logic);
        
         logic =  5==5;
        System.out.println("5==5 = " +logic);
        logic = 10 > 5 && 10 <20;
        System.out.println("10 > 5 && 10 <20 = " + logic);
        logic = 10 <= 5  && 10 <20;
        System.out.println("10 <= 5 && 10 <20 = " + logic);
        logic = 10 >= 5 || 10 >20;
        System.out.println("10 >= 5 || 10 >20 = " + logic);
         logic = !(10 >= 5) || 10 >20;
        System.out.println("!(10 >= 5)  || 10 >20 = " + logic);
         
    }
}
