/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.bienmang;

import java.util.Scanner;

/**
 *
 * @author Tran Manh Truong
 */
public class demo_array {
    public static void main(String[] args) {
        int[] a = new int[5];//khai báo mảng a gồm dãy 5 số nguyên đánh số 0,1,2,3,4
        float[] b;//khai báo biến mảng b chứa các số thực dạng float
        b = new float[10];//khởi tạo mảng 10 phần tử gán cho biến mảng b
        double[] c = {0.5, 1.5, 2.0,2.5,3.0};//khai báo biến mảng c và khởi tạo mảng 5 phần tử
        a[1] = 10;//gán giá trị 10 vào ô nhớ thứ 2 của mảng
        a[2] = 20;//gán giá trị 20 vào ô nhớ thứ 3 của mảng
        a[0] = a[1] + a[2];//lấy ô số 1 cộng với ô số 2 gán vào ô số 0
        System.out.println("phần tử số 0 của mảng là: " + a[0]);
        //demo nhập các giá trị từ bàn phím
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập các phần tử của mảng");
        for(int i=0; i<5; i++){
            System.out.println("Nhập phần tử thứ " + (i+1)  + ":");
            a[i] = sc.nextInt();
        }
        //hiển thị các phần tử
        System.out.println("các phần tử của mảng là:");
        for(int i=0; i<a.length;i++){
            System.out.print(a[i] + "   ");
        }
        System.out.println("\nSử dụng for each tự động duyệt mảng");
        
        for(int x : a){//tự động lặp từ đầu đến cuối mảng a, mỗi lần lặp gán giá trị vào x
            System.out.print(x +"   ");
        }
    }
}
