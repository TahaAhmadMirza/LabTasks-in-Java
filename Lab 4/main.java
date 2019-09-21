public class main{
	public static void main(String []args)
	{
//Q1's main function
	System.out.println("\t--------Q1's Test Function------- \n");
	int [] arr1={1,10,10,10};
	int []arr2={1,10,12,34};
	int []arr3={10,34,21};
	int [] arr4={6,10,8,9};
	
	Q1 s=new Q1();
	s.CommonElements(arr1,arr2,arr3,arr4);
	System.out.println("\t---------Q2's Test Function--------\n");
		int [] arr={1,10,10,10};
		int sum=0;
		int index=0;
		Q2 s1=new Q2();
		System.out.print(s1.SumIs30(arr, sum, index));
System.out.println("\n\t----------Q3's Test Function----------\n" );
		int [] Arr3={1,2,2,9,8,7,6,5};
	Q3 q3=new Q3();
		
	q3.sort(Arr3,0,Arr3.length-1);
	q3.Display(Arr3);
	System.out.print(q3.Number(Arr3)+"\n");
	
	System.out.println("\t---------Q4's Test Function--------\n");
	
		int[]Arr4={1,2,3,4,5,0,-9,-8,-7,-6,21,-4,-3,-2,-1};
		Q4 q4=new Q4();
		q4.sort(Arr4,0,Arr4.length-1);
		q4.Display(Arr4);	
		System.out.println("\nThe longest number of consecutive integers are "+q4.Longest(Arr4));
		q4.Display(Arr4);
	
	System.out.println("\t---------Q5's Test Function--------\n");
	System.out.println("In Q5 i am facing some errors i tried my best but the logic is correct if you uncomment it");
	/*			Q5 a=new Q5();
			Writer w=new Writer();			
			String s1="\0",s2="\0";
					
			w.WriteFile(s1,s2);
			a.ReadFile(s1,s2);		
*/
	System.out.println("I have used the exception of Question 7 as Exception used in Question 6\n");
				q7 q=new q7();
			q.g();

				}

}

