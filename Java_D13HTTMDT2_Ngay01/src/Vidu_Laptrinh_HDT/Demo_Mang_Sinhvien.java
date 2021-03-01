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
public class Demo_Mang_Sinhvien {
    public static void main(String[] args) {
        Sinhvien[] ds = new Sinhvien[3];//khai báo mảng 3 sinh viên;
        
        System.out.println("Nhập các sinh viên");
        for(int i=0;i<ds.length;i++)
        {
            ds[i] = new Sinhvien();//tạo Sinhvien mới gán cho phần tử thứ i
            ds[i].Nhap();
        }
        System.out.println("Hiển thị các sinh viên:");
        for(Sinhvien sv : ds)//lặp từ đầu tới cuối mảng ds gán cho sv
        {
            sv.Hienthi();
            System.out.println("Xếp loại: " + sv.Xeploai());
        }
    }
}
