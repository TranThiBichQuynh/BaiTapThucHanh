/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vidu_Laptrinh_HDT;

/**
 *
 * @author Tran Manh Truong
 */
public class Demo_Sinhvien {
    public static void main(String[] args) {
        Sinhvien sv1 = new Sinhvien("Dũng", 8, 9);
        Sinhvien sv2 = new Sinhvien();
        System.out.println("thông tin sinh viên 1:");
        sv1.Hienthi();
        System.out.println("Xếp loại: " + sv1.Xeploai());
        //nhập thông tin sv2 từ ban phím
        System.out.println("Nhập thông tin sv2:");
        sv2.Nhap();
        System.out.println("thông tin sinh viên 2:");
        sv2.Hienthi();
        System.out.println("Xếp loại: " + sv2.Xeploai());
    }
}
