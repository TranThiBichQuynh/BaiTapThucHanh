/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vidu1;
import java.util.Scanner;
/**
 *
 * @author Tran Manh Truong
 */
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hoten;//khai báo biến hoten kiểu chuỗi
        int tuoi;//khai báo biến tuổi kiểu số nguyên
        System.out.println("Hello Java");
        System.out.println("Nhập họ tên:");
        hoten = sc.nextLine();//dừng màn hình đợi nhập 1 chuỗi
        System.out.println("Nhập tuổi:");
        tuoi = sc.nextInt();
        System.out.println("Xin chào: " + hoten + ", tuổi: " + tuoi);
    }
}
