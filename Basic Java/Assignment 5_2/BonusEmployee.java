
abstract class Employee { 
	
	private String name, address; 
	protected int basicSalary; 
	
	public String getName(){ 
		return name; } 
 
    public String getAddress(){ 
    	return address; } 

  
    public int getBasicSalary(){ 
    	return basicSalary; } 
 
    public void setAddress(String add){
    	address = add; } 
 
    public void setName(String nm){ 
    	name = nm; } 
 
    public void setBasicSalary(int sal){
    	basicSalary = sal; } 
    
 
    public abstract int getMonthlySalary(); 
    
} 
 
class NormalEmployee extends Employee{
	
	public int getMonthlySalary(){
		return basicSalary;
	}
	
}

public class BonusEmployee extends Employee {
	
	private int bonus;
	public int getBonus(){
		return bonus;
	}
	public void setBonus(int bn){
		bonus = bn;
	}
	@Override
	public int getMonthlySalary() {
		return basicSalary + bonus;
	}	
	


    public static void main(String[] args) {
	
	NormalEmployee nv = new NormalEmployee();
	nv.setName("Ha Van Tien");
	nv.setAddress("Thai Binh");
	nv.setBasicSalary(10000000);
	System.out.println("Ten nhan vien la : " + nv.getName());
	System.out.println("Dia chi : " + nv.getAddress());
	System.out.println("Luong co ban la: " + nv.getBasicSalary());
	
	BonusEmployee nb = new BonusEmployee();
	nb.setName("Le Chi Thanh");
	nb.setAddress("Thai Binh");
	nb.setBasicSalary(15000000);
	nb.setBonus(2000000);
	System.out.println("Ten nhan vien la : " + nb.getName());
	System.out.println("Dia chi : " + nb.getAddress());
	System.out.println("Luong hang thang la : " + nb.getMonthlySalary());	
    }	
}