/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TinhLuong;

import java.util.Scanner;

/**
 *
 * @author Tran Manh Truong
 */
public class Nhanvien {
    //khai báo một số thuộc tính Properties
    private String Hoten;
    private double LuongCoBan;
    private int Bacluong;//bậc công nhân: 1,2,3...7
    //xây dựng một số hàm tạo - Constructor
    public Nhanvien() {
    }
    public Nhanvien(String Hoten, double LuongCoBan, int Bacluong) {
        this.Hoten = Hoten;
        this.LuongCoBan = LuongCoBan;
        this.Bacluong = Bacluong;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public double getLuongCoBan() {
        return LuongCoBan;
    }

    public void setLuongCoBan(double LuongCoBan) {
        this.LuongCoBan = LuongCoBan;
    }

    public int getBacluong() {
        return Bacluong;
    }

    public void setBacluong(int Bacluong) {
        if(Bacluong>=1 && Bacluong<=7)
            this.Bacluong = Bacluong;
        else
            System.out.println("Bậc lương không hợp lệ");
    }
    public void NhapTT(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập nhân viên mới");
        System.out.println("Họ tên:");
        this.Hoten = sc.nextLine();
        System.out.println("Lương cơ bản:");
        this.LuongCoBan = sc.nextDouble();
        System.out.println("Bậc lương (1-7):");
        this.Bacluong = sc.nextInt();
    }
    public void HienthiTT(){
        System.out.println("Họ tên: " + this.Hoten 
                + ", LCB: " + this.LuongCoBan + ",Bậc: " + this.Bacluong);
    }
    //Tính và trả về lương theo công thức: thực lĩnh = Lương cơ bản * (hệ số lương/2)
    public double Tinhluong(){
        double luong;
        luong = LuongCoBan * (Bacluong/2.0);
        return luong;
    }
}
