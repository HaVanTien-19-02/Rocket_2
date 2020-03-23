
public class InsertSort extends SequenceNumber implements Sort{

	InsertSort(int n) {
		super(n);
		
	}
	@Override
	public void sort() {
		// TODO Auto-generated method stub
		int n = array.length; 
        for (int i = 1; i < n; ++i) { 
            int key = array[i]; 
            int j = i - 1; 
  
            /* Move elements of arr[0..i-1], that are 
               greater than key, to one position ahead 
               of their current position */
            while (j >= 0 && array[j] > key) { 
                array[j + 1] = array[j]; 
                j = j - 1; 
            } 
            array[j + 1] = key; 
        } 
		
	}

	@Override
	public void sort(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		
	}

}
