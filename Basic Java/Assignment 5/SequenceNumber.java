import java.util.Scanner;

public class SequenceNumber {
	static Scanner sc= new Scanner(System.in);
    
	public static int[] array;
	
	public void input(){
		for (int i = 0; i < array.length; i++){
			System.out.println("nhap phan tu thu " + (i+1) + " la :");
			array[i] = sc.nextInt();
		}
	}
	
	public void print(int array[]){
		int n = array.length;
		for (int i = 0; i < n; i++){
			System.out.println(array[i]);
		}		
	}
	
	SequenceNumber(int n){
		array = new int[n];
	}
	
}  

	
