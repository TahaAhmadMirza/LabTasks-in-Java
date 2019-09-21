public class Q4
{
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
	public int Longest(int []arr){
		int count=1,count1=1;		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i-1]==arr[i]-1)
	{
		count+=1;
					}
		
			}
		if(count>count1)
			{
				count1=count;
			}
			
		return count1;
			}
	void Display(int []arr){
		System.out.println();
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");}}		
public static void main(String[]args)
	{
		int[]arr={1,2,3,4,5,0,-9,-8,-7,-6,21,-4,-3,-2,-1};
		Q4 q=new Q4();
		q.sort(arr,0,arr.length-1);
		q.Display(arr);	
		System.out.println("\nThe longest number of consecutive integers are "+q.Longest(arr));
		q.Display(arr);
			}
		}
