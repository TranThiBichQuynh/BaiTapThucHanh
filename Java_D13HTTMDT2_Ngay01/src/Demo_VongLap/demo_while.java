package Demo_VongLap;

import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tran Manh Truong
 */
public class demo_while {
    public static void main(String[] args) {
        int i=1;
        //hiện thị từ 1 đến 5
        while( i<=5 )
        {
            System.out.println("Lần thứ " + i);
            i++;
        }
        
        int tuoi = 0;
        Scanner nhap = new Scanner(System.in);
        //n nhập số n cho tới khi n > 0 và n nhỏ hơn bằng 100;
        while(tuoi<=0 || tuoi>100)
        {
            System.out.print("Nhập tuoi >=0 va <=100 :");
            tuoi = nhap.nextInt();
            if(tuoi<=0 || tuoi>100)
                System.out.println("Bạn nhập sai, mời nhập lại");
        }
        System.out.println("Tuoi ban la: " + tuoi);
        
    }
}





