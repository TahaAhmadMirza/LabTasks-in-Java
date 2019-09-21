import java.util.*;
import java.io.File;
public class Q5{
		Boolean ReadFile(String s1,String s2)throws Exception
			{
				Scanner x1=new Scanner(new File("f1.txt"));
				Scanner x2=new Scanner(new File("f2.txt"));
			while(x1.hasNext())
			{
				s1+=((x1.next()).toString()+" ");
				}
			while(x2.hasNext())
			{	
				s2+=((x2.next()).toString()+" ");
				}
			if(s1==s2)
{
			return true;	
			}
		return false;
		
				}
			
		public static void main(String []args)
		{
			Q5 a=new Q5();
			Writer w=new Writer();			
			String s1="\0",s2="\0";
					
			w.WriteFile(s1,s2);
			a.ReadFile(s1,s2);		
			}
		
		
				}
