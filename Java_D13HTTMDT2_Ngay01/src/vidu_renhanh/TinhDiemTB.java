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
public class TinhDiemTB {
    public static void main(String[] args) {
        double toan,van,dtb;
        Scanner nhap = new Scanner(System.in);
       
        System.out.println("Nhập điểm toán:");
        toan = nhap.nextDouble();
        System.out.println("Nhập điểm văn:");
        van = nhap.nextDouble();
        dtb = (toan+van)/2;
        if(dtb<0 || dtb>10)
            System.out.println("Không hợp lệ!");
        else if(dtb<5)
            System.out.println("Trượt!");
        else if(dtb>=5 && dtb<8)
            System.out.println("Trung Bình!");
        else
            System.out.println("Giỏi!");
        
        System.out.println("kết thúc");
        
    }
}
