//
package AgainAssignment1;

/**
 * This class is teacher. 
 * 
 * @Description: .
 * @author: HVTien
 * @create_date: 23-04-2020
 * @version: 1.0
 * @modifer: HVTien
 * @modifer_date: 23-04-2020
 */
public class Teachers {
	int magv;
	String fullName;
	int age;
	String address;
	String boMon;
	float salary;
	GioiTinh gioiTinh;
	
	public void dayHoc(){
		System.out.println("Đến trường học dạy học");
	}
	public void diemDanh(){
		System.out.println("Điểm danh buổi học đó");
	}
	public void giaoBaiTap(){
		System.out.println("Giao bài tập về nhà và bài tập lớn");
	}
	public void kiemTra(){
		System.out.println("Kiểm tra giữa kỳ lấy điểm thành phần");
	}
	public void chamDiem(){
		System.out.println("Chấm điểm bài tập và bài kiểm tra");
	}
	public void traDiem(){
		System.out.println("Trả các điểm thành phần cho học sinh");
	}
}
