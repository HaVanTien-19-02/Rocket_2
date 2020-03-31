//

/**
 * This class is officials. 
 * 
 * @Description: .
 * @author: HVTien
 * @create_date: 31-03-2020
 * @version: 1.0
 * @modifer: HVTien
 * @modifer_date: 31-03-2020
 */
public class Officials extends Nhanvien implements Salary{
	
	protected String department; // phòng ban làm việc
	protected int workingTime;	// thời gian làm việc theo ngày
	protected String position;	//vị trí công việc
	
	
	
	public void input() {
		System.out.println("Full name is: ");
		fullname = sc.nextLine();
		System.out.println("Department is: ");
		department = sc.nextLine();
		System.out.println("Position is: ");
		position = sc.nextLine();
		System.out.println("Salary multiplier is:");
		salaryMultiplier =  sc.nextFloat();
		System.out.println("Working time is: ");
		workingTime = sc.nextInt();
		
		if(position.equals("department head")) {
			allowance = 2000;
		}
		else if(position.equals("vice head")) {
			allowance = 1000;
		}
		else if(position.equals("staff")) {
			allowance = 500;
		}
		else {
			allowance = 0;
		}
	}
	
	public void output() {
		System.out.println("Full name is: " + fullname);
		System.out.println("Department is: " + department);
		System.out.println("Position is: " + position);
		System.out.println("Salary multiplier is:" + salaryMultiplier);
		System.out.println("Working time is: " + workingTime);
		System.out.println("Allowance is: " + allowance);
	}
	
	@Override
	public void salaryMultiplier() {
		// TODO Auto-generated method stub
		float salary = salaryMultiplier*730 + allowance + workingTime*30;
		System.out.println("Tiền lương là: " + salary);
		
	}

}