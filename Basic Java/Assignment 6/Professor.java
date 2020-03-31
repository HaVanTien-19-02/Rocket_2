//

/**
 * This class is Professor. 
 * 
 * @Description: .
 * @author: HVTien
 * @create_date: 31-03-2020
 * @version: 1.0
 * @modifer: HVTien
 * @modifer_date: 31-03-2020
 */
public class Professor extends Nhanvien implements Salary{
	protected String faculty;
	protected String academicdegree;
	protected int monthlyteachingtime;
	
	public void input(){
		System.out.println("Full name is: ");
		fullname = sc.nextLine();
		System.out.println("Faculty is: ");
		faculty = sc.nextLine();
		System.out.println("Academic degree is: ");
		academicdegree = sc.nextLine();		
		System.out.println("Monthly teaching time is: ");
		monthlyteachingtime = sc.nextInt();
		System.out.println("Salary multiplier is: ");
		salaryMultiplier = sc.nextFloat();
		
		
		if (academicdegree.equals("Bachelor")){
			allowance = 300;
		}
		else if (academicdegree.equals("Master")){
			allowance = 500;
		}
		else if (academicdegree.equals("Doctor")){
			allowance = 1000;
		}		
	}
	
	public void output(){
		System.out.println("Full name is: "+ fullname);		
		System.out.println("Faculty is: "+ faculty);		
		System.out.println("Academic degree is: "+ academicdegree);						
		System.out.println("Monthly teaching time is: "+ monthlyteachingtime);		
		System.out.println("Salary multiplier is: "+ salaryMultiplier);		
	}
	
	@Override
	public void salaryMultiplier (){		
		float salary = salaryMultiplier*730 + allowance + monthlyteachingtime*45;
		System.out.println("Your salary is :" + salary);
	}

}
