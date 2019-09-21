import java.util.*;
import java.io.FileWriter;
public class Writer{
			void WriteFile(String s1,String s2)throws Exception
		{
			FileWriter f1=new FileWriter("s1.txt");
			FileWriter f2=new FileWriter("s2.txt");
		f1.write(s1);
		f2.write(s2);
} 
		}
