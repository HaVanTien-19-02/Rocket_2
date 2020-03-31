//
package backend;

/**
 * This class is drone. 
 * 
 * @Description: .
 * @author: HVTien
 * @create_date: 31-03-2020
 * @version: 1.0
 * @modifer: HVTien
 * @modifer_date: 31-03-2020
 */
public class Drone extends Bee{
	public Drone(){
		super();
	}
	
	@Override
	public void CheckHealthStatus(){
		System.out.println("\t\t:dronehealth: ");
	    super.CheckHealthStatus();	
	    if(floatingPointHealth < 50){
	    	System.out.println("\t\tBee dead and can't fly");
	    }
	}

}
