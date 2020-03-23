
public class MainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//      QuickSort 		QS = new QuickSort(6);
        SelectionSort	ss = new SelectionSort(7);
//	    InsertSort		is = new InsertSort(5);
		
//		is.input();
//		is.sort();
//		is.print(array);
		
		int[] array = SequenceNumber.array;
		
//		QS.input();
//		QS.sort(array, 0, 5);
//		QS.print(array);
		
		
        ss.input();
	    ss.sort();
	    ss.print(array);
		

		
		
	}

}