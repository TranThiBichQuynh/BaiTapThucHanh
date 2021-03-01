package demo_bieuthuc_toanhoc_logic;

public class vidu1_bieudien_giatri_hang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //literal: hằng giá trị, ví dụ: 26, 5.5, 'a', "chuoi"
        
        //khai bao bien
        long b1;//8byte
        int a1;//kiểu số nguyên kích thước 4byte
        float a2;
        double a3;
        char a4;
        String str;
        //gán dữ liệu
        a1 = 26;//mặc định là dạng int
        b1 = 26L;//26 ở dang Long (8 byte)
        a2 = 5.5f;
        a3 = 5.5;//mặc định 5.5 là dạng double
        a4 = 'b'; //ký tự thì đặt trong cặp nháy đơn
        str = "Viện CNTT";//chuỗi đặt trong cặp dấu nháy kép
        System.out.println("a1 = " + a1);
        System.out.println("a2 + a3 = " + (a2+a3) );
        
      //một số cách biểu diễn số nguyên ở dạng cơ số 10, 8, 16
        int a5 = 26;//số 26 ở hệ đếm cơ số thập phân
        System.out.println("a5  = " + a5 );
        
        int a6 = 026;//số 26 ở hệ đếm cơ số 8
        System.out.println("a6 = " + a6);//a6=22 ở dạng thập phân
        
        int a7 = 0xAB;//số ab ở hệ đếm cơ số 16
        System.out.println("a7 = " + a7);
        
	}

}
