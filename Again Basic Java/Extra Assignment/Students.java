//
package AgainAssignment1;

import java.util.Date;

/**
 * This class is student. 
 * 
 * @Description: .
 * @author: HVTien
 * @create_date: 22-04-2020
 * @version: 1.0
 * @modifer: HVTien
 * @modifer_date: 22-04-2020
 */
public class Students {
	int masv;
	String fullName;
	int age;
	Date birthday;
	String address;
	Level level;
	String phone;
	String lop;
	GioiTinh gioiTinh;
	
	public void diHoc(){
		System.out.println("Đến trường học");
	}
	public void hocBai(){
		System.out.println("Học bài trên lớp và ở nhà");
	}
	public void kiemTra(){
		System.out.println("Làm bài kiểm tra trên lớp");
	}
	public void thiHocKy(){
		System.out.println("Thi cuối học kỳ");
	}
	public void thamGiaCLB(){
		System.out.println("Tham gia câu lạc bộ");
	}
	public void xemDiem(){
		System.out.println("Xem điểm thi và điểm kiểm tra");
	}
	public void traCuuHocPhi(){
		System.out.println("Tra cứu học phí");
	}
	
}
enum Level {
	UNIVERSITY, COLLEGES;
}
enum GioiTinh {
	MALE, FEMALE;
}
