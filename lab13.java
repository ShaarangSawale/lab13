import java.util.ArrayList;
import java.io.*;

public class lab13 
{
	ArrayList<Integer> al = new ArrayList<>();
	public void readData(String filename)
	{
		try
		{
			BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
			String inn;
			while((inn = in.readLine()) != null)
			{
				if(inn.length() > 0)
				{
					al.add(Integer.parseInt(inn));
				}
				else 
				{
					break;
				}
			}
		}
		catch(Exception e)
		{	
		}
	}
	public long getTotalCount()
	{
		return al.stream().count();
	}
	public long getOddCount()
	{
		return al.stream().filter(x -> x % 2 != 0).count();
	}
	public long getEvenCount()
	{
		return al.stream().filter(x -> x % 2 == 0).count();
	}
	public long getDistinctGreaterThanFiveCount()
	{
		return al.stream().filter(x -> x > 5).distinct().count();
	}
	public Integer[] getResult1()
	{
		return al.stream().filter(x -> x > 5 && x < 50 && x % 2 == 0).sorted().toArray(Integer[]::new);
	}
	public Integer[] getResult2()
	{
		return al.stream().map(x -> x*x*3).limit(50).toArray(Integer[]::new);
	}
	public Integer[] getResult3()
	{
		return al.stream().filter(x -> x % 2 !=0).map(x -> x*2).sorted().skip(20).distinct().toArray(Integer[]::new);
	}
}