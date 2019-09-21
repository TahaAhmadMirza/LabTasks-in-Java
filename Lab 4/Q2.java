
public class Q2 {

	/**
	 * @param args
	 */
	public Boolean SumIs30(int arr[],int sum,int i)
	{
		if(i>=arr.length|| i<0)
		{
			if(sum==30)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			if(arr[i]==10)
			{
				sum+=10;
				return SumIs30(arr,sum,i+1);
			}
			else
			{
				return SumIs30(arr, sum, i+1);
			}
			
		}
		
		
	}
/*	public static void main(String[] args)
	{
		int [] arr={1,10,10,10};
		int sum=0;
		int index=0;
		Q2 s=new Q2();
		System.out.print(s.SumIs30(arr, sum, index));
		
	}
	
*/
}
