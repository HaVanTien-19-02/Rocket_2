//
package backend;

/**
 * This class is queen. 
 * 
 * @Description: .
 * @author: HVTien
 * @create_date: 31-03-2020
 * @version: 1.0
 * @modifer: HVTien
 * @modifer_date: 31-03-2020
 */
public class Queen extends Bee{
	public Queen(){
		super();
	}
	
	@Override
	public void CheckHealthStatus(){
		System.out.println("\t\t:queenhealth: ");
	    super.CheckHealthStatus();	
	    if(floatingPointHealth < 20){
	    	System.out.println("\t\tBee dead and can't fly");
	    }
	}

}
