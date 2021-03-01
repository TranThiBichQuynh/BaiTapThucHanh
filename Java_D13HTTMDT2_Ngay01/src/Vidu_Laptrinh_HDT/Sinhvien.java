/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vidu_Laptrinh_HDT;

import java.util.Scanner;

/**
 *
 * @author Tran Manh Truong
 */
public class Sinhvien {
    //Khai báo các Properties:
    private String Hoten;
    private double Toan;
    private double Van;
    //Khai các các hàm tạo (Constructor)
    public Sinhvien() {
    }

    public Sinhvien(String Hoten, double Toan, double Van) {
        this.Hoten = Hoten;
        this.Toan = Toan;
        this.Van = Van;
    }
    //Khai báo các phương thức

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public double getToan() {
        return Toan;
    }

    public void setToan(double Toan) {
        this.Toan = Toan;
    }

    public double getVan() {
        return Van;
    }

    public void setVan(double Van) {
        this.Van = Van;
    }
    //Xây dựng các phương thức (method) nhập, hiển thị, xếp loại
    public void Nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ tên:");
        this.Hoten = sc.nextLine();
        System.out.println("Nhập điểm toán:");
        this.Toan = sc.nextDouble();
        System.out.println("Nhập điểm văn:");
        this.Van = sc.nextDouble();
    }
    public void Hienthi()
    {
        System.out.println("Họ tên: " + this.Hoten);
        System.out.println("Điểm Toán: " + this.Toan + ", Văn: " + this.Van);
    }
    public String Xeploai()
    {
        double DTB = (Toan+Van)/2.0;
        if(DTB<5.0)
            return "Trượt";
        else if(DTB >=5.0 &&  DTB <6.5)
            return "Trung bình";
        else if(DTB>=6.5 && DTB<8)
            return "Khá";
        else
            return "Giỏi";
    }
}
