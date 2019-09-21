



public class Q3 {

	int partition(int arr[], int low, int high) 
	 { 
        int pivot = arr[high];  
        int i = (low-1); // index of smaller element 
        for (int j=low; j<high; j++) 
        { 
            if (arr[j] < pivot) 
            { 
                i++; 
  
                // swap arr[i] and arr[j] 
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
  
        // swap arr[i+1] and arr[high] (or pivot) 
        int temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
  
        return i+1; 
    } 
  
  
   public void sort(int arr[], int low, int high) 
    { 
        if (low < high) 
        { 
            int pi = partition(arr, low, high); 
  
            sort(arr, low, pi-1); 
            sort(arr, pi+1, high); 
        } 
    }
      void Display(int []arr)
	{
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]);
	
	}
		System.out.println();		
	}
	public int Number(int []arr)
	{
		int count=0;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				count+=1;
				}
			}
		
		return count;
		}	
public static void main(String[] args) {
	int [] arr={1,2,2,9,8,7,6,5};
	Q3 q=new Q3();
		
	q.sort(arr,0,arr.length-1);
	q.Display(arr);
	System.out.print(q.Number(arr)+"\n");
	}

}
