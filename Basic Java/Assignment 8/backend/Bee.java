//
package backend;

/**
 * This class is bee . 
 * 
 * @Description: .
 * @author: HVTien
 * @create_date: 31-03-2020
 * @version: 1.0
 * @modifer: HVTien
 * @modifer_date: 31-03-2020
 */
public class Bee {
	protected int floatingPointHealth;
	
	public Bee(){
		this.floatingPointHealth = 100;
	}
	
	public void Damage(int dame){
		if (dame >=0 && dame <= 100){
			floatingPointHealth -= dame;
			if (floatingPointHealth < 0){
				floatingPointHealth = 0;
			}
		}
	}
	
	public void CheckHealthStatus(){
		System.out.println("\t\tfloatingPointHealth = " + floatingPointHealth );		
	}

}





