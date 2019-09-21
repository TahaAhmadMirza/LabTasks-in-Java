
public class Q1 {

	/**
	 * @param args
	 */
public void CommonElements(int arr1[],int arr2[],int arr3[],int arr4[])
{
	for(int i=0;i<arr1.length;i++)
	{
		for(int j=0;j<arr2.length;j++)
		{
			for(int k=0;k<arr3.length;k++)
			{
				for(int l=0;l<arr4.length;l++)
				{
					if(arr1[i]==arr2[j] && arr2[j]==arr3[k] && arr3[k]==arr4[l])
					{
						System.out.print("The common number in arrays are "+arr1[i]+"\n");
						
					}
				}
			}
		}
	}
}

public static void  main(String []args)
{
	int [] arr1={1,10,10,10};
	int []arr2={1,10,12,34};
	int []arr3={10,34,21};
	int [] arr4={6,10,8,9};
	
	Q1 s=new Q1();
	s.CommonElements(arr1,arr2,arr3,arr4);
	
}
}