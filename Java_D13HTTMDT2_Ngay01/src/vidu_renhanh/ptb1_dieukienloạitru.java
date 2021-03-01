/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package vidu_renhanh;

import java.util.Scanner;

/**
 *
 * @author truongtm
 */
public class ptb1_dieukienloạitru {
    public static void main(String[] args) {
        double a,b,x;
        Scanner nhap = new Scanner(System.in);

        System.out.println("Mời nhập a=");
        a = nhap.nextDouble();

        System.out.println("Mời nhập b=");
        b = nhap.nextDouble();

        if(a==0 && b==0)
        {
            System.out.println("Phương trình có vô số nghiệm");
        }
        else if(a==0 && b!=0)
        {
            System.out.println("Phương trình vô nghiệm");
        }
        else
        {
            x = -b/a;
            System.out.println("Nghiệm là: " + x);
        }

    }
}
