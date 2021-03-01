package demo_bieuthuc_toanhoc_logic;

public class vidu2_phepchia {

	public static void main(String[] args) {
            // TODO Auto-generated method stub
            int a1 = 7%2;//chia lấy dư
            System.out.println("a1 = " + a1);//a1 = 1
            //phép chia ký hiệu /
            //nếu một trong 2 toán hạng là số thực (dobule,float) thì kết quả là dạng số thực
            //nếu cả 2 toán hạng là số nguyên (int, long,short,..) thì kết quả là số nguyên
            int a2 = 7/2;//phép chia số nguyên kết quả phải là số nguyên
            System.out.println("a2 = " + a2);//a2 = 3
            
            double a3 = 7/2;//phép chia số nguyên kết quả phải là số nguyên kết quả  là 3 và gán cho a3
            System.out.println("a3 = " + a3);//a3 = 3.0
            //int a4 = 7/2.0;// 3.5 dạng double
            //System.out.println("a4 = " + a4);
            double a5 = 7/2.0;//1 trong 2 toán hạng của phép chia là số thực thì kết quả là số thực và có kiểu là double (vì 2.0 là double)
            System.out.println("a5 = " + a5);//a5 = 3.5
           
            //float a6 = 7/2.0;//lỗi do 2.0 là double thì kết là 3.5 dạng double nên không thể gán cho kiểu bé hơn là float được
            float a6 = 7/2.0f;
            System.out.println("a6 = " + a6);
            
            double a7 = (double)7/2;
            System.out.println("a7 = " + a7);//a7 = 3.5
	}

}
