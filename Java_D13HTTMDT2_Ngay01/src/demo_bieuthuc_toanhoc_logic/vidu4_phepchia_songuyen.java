package demo_bieuthuc_toanhoc_logic;
import java.util.Scanner;
public class vidu4_phepchia_songuyen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nhap = new Scanner(System.in); //khai báo đối tượng Scanner để nhập dữ liệu từ bàn phím
		String hoten;
		System.out.print("Mời nhập họ tên:");
		hoten = nhap.nextLine();//dừng màn hình, đợi nhập một chuỗi, nhấn ENTER khi kết thúc
		System.out.println("Xin chào bạn:" + hoten);
		//Tính lương theo công thức Thuc_Linh = Luongcoban * (Heso/2)
		//Luongcoban và Heso nhập từ bàn phím, hệ số là các giá trị từ 1, 2, ..7
		double thuclinh, luongcoban;
		int heso;
		System.out.print("Nhập lương cơ bản:");
		luongcoban = nhap.nextDouble();
		System.out.print("Nhập hệ số lương (1-7):");
		heso = nhap.nextInt();
                //thực lĩnh bằng lương cơ bản nhân 1/2 của hệ số lương
		//thuclinh = luongcoban *(heso/2);//kết quả sai khi heso là số lẻ do chia 2 số int
                thuclinh = luongcoban *(heso/2.0);//kết quả đúng khi heso là số lẻ do chia số thực
		System.out.println("Chúc mừng bạn, bạn được lĩnh: " + thuclinh + " đồng");
	}

}
