/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TinhLuong;

/**
 *
 * @author Tran Manh Truong
 */
public class Demo1 {
    public static void main(String[] args) {
        Nhanvien nv1 = new Nhanvien("ABC", 2000000, 4);
        
        System.out.println("thông tin nv1:");
        nv1.HienthiTT();
        
        Nhanvien nv2 = new Nhanvien();
        nv2.NhapTT();
        nv2.setBacluong(5);
        System.out.println("thông tin nv2:");
        nv2.HienthiTT();
        System.out.println("Lương vn1: " + nv1.Tinhluong());
        //nv2.setBacluong(5);
        System.out.println("Lương vn2: " + nv2.Tinhluong());
    }
}
