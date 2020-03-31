//
package backend;

/**
 * This class is worker. 
 * 
 * @Description: .
 * @author: HVTien
 * @create_date: 31-03-2020
 * @version: 1.0
 * @modifer: HVTien
 * @modifer_date: 31-03-2020
 */
public class Worker extends Bee{
	
	public Worker(){
		super();
	}
	
	@Override
	public void CheckHealthStatus(){
		System.out.println("\t\t:workerhealth: ");
	    super.CheckHealthStatus();	
	    if(floatingPointHealth < 70){
	    	System.out.println("\t\tBee dead and can't fly");
	    }
	}

}
