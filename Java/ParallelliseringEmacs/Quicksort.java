import java.util.Random;

public class Quicksort {

	/** Sorts an array with an insertion algorithm from index start to index end.
	 * 
	 * @param arr The array which needs to be sorted.
	 * @param start From which value the sorting will begin.
	 * @param end Too which value the sorting will continue.
	 */
	
    private static void insertionSort(final int[] arr, final int start, final int end) {
        for (int i = start + 1; i < end; ++i) {
         int j = i;
         int tmp = arr[i];
         while (j > 0 && arr[j-1] > tmp) {
                arr[j] = arr[j-1];
                j--;
         }
         arr[j] = tmp;
        }
    }

    
    private static void sQsort(final int[] arr, final int start, final int end) {
        
    	if((end - start) < 30) {	
    		insertionSort(arr, start, end+1);
        } else {
    	int left = start;
        int right = end + 1;
        // We simply pick the first element as pivot..
        final int pivot = arr[start];
        int tmp;
        
        // Rearranging the elements around the pivot, so that
        // elements smaller than the pivot end up to the left
        // and elements bigger than the pivot end up to the
        // right.
        do {
                
         // As long as elements to the left are less than
         // the pivot we just continue.
         do {
                left++;
         } while (left <= end && arr[left] < pivot);
        
         // As long as the elements to the right are
         // greater than the pivot we just continue.
         do {
                right--;
         } while (arr[right] > pivot);
        
         // If left is less than right we have values on
         // the wrong side of the pivot, so we swap them.
         if (left < right) {
                tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
         }
        
         // We continue doing this until all elements are
         // arranged correctly around the pivot.
        } while (left <= right);
        
        // Now put the pivot in the right place.
        tmp = arr[start];
        arr[start] = arr[right];
        arr[right] = tmp;
        
        // We have now "split" the range arr[start, end] into
        // two parts around the pivot value. We recurse to
        // sort those parts.
        
        if (start < right) {
         sQsort(arr, start, right);
        }
        
        if (left < end) {
        	sQsort(arr, left, end);
        }
        }
    }

    public static void sQsort(final int[] arr) {
        sQsort(arr, 0, arr.length-1);
    }
    
    /*public static void insertionSortTest(final int[] arr){
    	insertionSort(arr, 0, arr.length);
    }*/
    
    public static boolean sortCheck(int[] arr){
    
    	for(int i=0;i<arr.length-1;i++){
    		if(arr[i]<=arr[i+1]){
    			continue;
    		} else{ 
    			if(arr[i]<arr[i+1]){ 
    				System.out.println("Error at index " + i);
    				return false;
    			} else {
    				System.out.println("Error at index " + i);
    				return false;
    				}
    			}
    		}
    	return true;
    }
    
    public static int[] arrayGenerator(int length){
    
    	int[] arr = new int[length];
    	Random r = new Random();
    	
    	for(int i=0;i<arr.length;i++){
    		arr[i] = r.nextInt(10000);
    	}
    	return arr;
    }
    
    public static int[] clone(int[] arr){
    	int[] newArr = new int[arr.length];
    	
    	for(int i=0;i<arr.length;i++){
    		newArr[i] = arr[i];
    	}
    	return newArr;
    }
    
    public static boolean equals(int[] arr, int[] otherArr){
    
    	if(arr.length != otherArr.length){ 		
    		return false;
    	}
    	for(int i=0;i<arr.length;i++){
    		if(arr[i] != otherArr[i]) {
    			return false;
    		}
    	}
    	return true;
    		
    }
}
