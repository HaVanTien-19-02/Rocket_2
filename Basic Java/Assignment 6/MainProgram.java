//

/**
 * This class is mainprogram. 
 * 
 * @Description: .
 * @author: HVTien
 * @create_date: 31-03-2020
 * @version: 1.0
 * @modifer: HVTien
 * @modifer_date: 31-03-2020
 */
import java.util.ArrayList;

public class MainProgram {
	public static void showList(ArrayList<String> list) {
        // Show list through for-each
        for (String obj : list) {
            System.out.print("\t" + obj + ", ");
        }
        System.out.println();
    }


	public static void main(String[] args) {
		
		
		ArrayList<String> list = new ArrayList<String>();
		
		Professor p = new Professor();
		
		p.input();
		p.output();
		p.salaryMultiplier();
		
		
		Officials o = new Officials();
		
		o.input();
		o.output();
		o.salaryMultiplier();
		
		
	}

}
