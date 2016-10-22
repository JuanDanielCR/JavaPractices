package sources;

/**Takes one element at time, and places it in the correct order relative to those BEFORE it */
public class InsertionSorting {
	public static void insertionSort(int[]data){
		int n = data.length; //Size of our array
		for(int i = 1; i<n; i++){ 
		/*Starting our loop in 1 instead of 0 (we don't compare our zero element cause it doesn't have a BEFORE element to compare with),
		and sorting while i is lower than the array's length (its last element)*/
			int current = data[i];	//Save our current element
			int j = i;				//Create a new counter that will be higher at each iteration
			while(j > 0 && data[j-1] > current){	//Comparing if the element BEFORE is greater than the current 
				data[j] = data[j-1];				//If so, slide data rightward
				j--;								//Decreasing j by one
			}
			data[j] = current;						//Fill the position of our last moved element
		}
	}
}
