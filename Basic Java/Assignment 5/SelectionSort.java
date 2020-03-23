
public class SelectionSort extends SequenceNumber implements Sort{

	SelectionSort(int n) {
		super(n);
		
	}
	@Override
	public void sort() {
		// TODO Auto-generated method stub
		int n = array.length; 
		  
        // One by one move boundary of unsorted subarray 
        for (int i = 0; i < n-1; i++) 
        { 
            // Find the minimum element in unsorted array 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (array[j] < array[min_idx]) 
                    min_idx = j; 
  
            // Swap the found minimum element with the first 
            // element 
            int temp = array[min_idx]; 
            array[min_idx] = array[i]; 
            array[i] = temp; 
        } 
		
	}

	@Override
	public void sort(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		
	}
	
	

}
