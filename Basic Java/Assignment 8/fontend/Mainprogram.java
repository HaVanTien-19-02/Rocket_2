//
package fontend;
import java.util.ArrayList;
import java.util.Scanner;
import backend.Bee;
import backend.Drone;
import backend.Queen;
import backend.Worker;
import utils.ScannerUtil;
import java.util.List;
import java.util.Random;
import java.util.Collections;
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
public class Mainprogram {
	
	static List<Bee>bees;
	
	private void createBeeList(){
		bees = new ArrayList<>();
		int rnd = new Random().nextInt(11);
		int rnd1 = new Random().nextInt(11-rnd);
		int rnd2 = 10-(rnd + rnd1);
		for(int i=0; i<rnd; i++){
			Worker bee = new Worker();
			bees.add(bee);
		}
		for(int i=0; i<rnd1; i++){
			Queen bee = new Queen();
			bees.add(bee);
		}
		for(int i=0; i<rnd2; i++){
			Drone bee = new Drone();
			bees.add(bee);
		}
		Collections.shuffle(bees);
		System.out.println("CREATE SUCCESSFULLY!");			
	}
	
	private void attackBee(){
		for (Bee bee : bees) {
			bee.Damage(new Random().nextInt(81));
		}
		System.out.println("ATTACK SUCCESSFULLY!");
		System.out.println("-----------------------------------------");
		System.out.println();
	}
	
	private void statusBee(){
		int i = 1;
		for (Bee bee : bees) {
			System.out.println("\tBee " + i);
			i++;
			bee.CheckHealthStatus();
			System.out.println("-----------------------------------------");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choose;
		
		Mainprogram obj = new Mainprogram();
		
		while (true){
			System.out.println("1. Tao danh sach bee");
			System.out.println("2. Tan cong bee");
			System.out.println("3. Thoat");
			choose = ScannerUtil.readInt(sc,"Yeu cau nhap so nguyen! \t Vui long nhap lai!");
			switch(choose){
			case 1:
				obj.createBeeList();
				break;
			case 2:
				if (bees == null){
					System.out.println("Tao danh sach bee dau tien");
					break;
				}
				else {
					obj.attackBee();
					obj.statusBee();
					break;
				}								
			case 3:
				System.exit(0);
			default:
				System.out.println("PLEASE CHOOSE FROM 1 --> 3!");
				break;												
			}
		}
	}
	
	

}
