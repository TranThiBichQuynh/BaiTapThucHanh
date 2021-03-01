/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vidu_renhanh;

import java.util.Scanner;

/**
 *
 * @author Tran Manh Truong
 */
public class kiemtra_chanle {
    public static void main(String[] args) {
       int n;
       Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap số nguyên:");
       n = nhap.nextInt();
       int sodu = n%2;
       if(sodu==0){
           System.out.println("Số " + n  + " là số chẵn!");
       }
       else{
           System.out.println("Số " + n + " là số lẻ");
       }
       System.out.println("Kết thúc!");
    }
}
