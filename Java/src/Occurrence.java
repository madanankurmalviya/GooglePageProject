import java.util.HashMap;
public class Occurrence 

{
	public static void main(String[]args)
	{
		String [] str = {"A","B","1" ,"D","A","B","1" ,"D","A","B","1" ,"D","2","aa","A","B","A","B","A","B"};
		HashMap <String , Integer> hm = new HashMap<String, Integer>();
		for(String s : str)
		{
			if(hm.get(s)!=null)
			{
				hm.put(s, hm.get(s)+1);
			}
			else
			{
				hm.put(s, 1);
			}
		}
		System.out.println(hm);
		
	}
}
