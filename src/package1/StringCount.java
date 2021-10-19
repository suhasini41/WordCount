package package1;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StringCount
{
	private String countString(String str) {
		String[] s = str.split(" ");
		Map<String,Integer> map = new HashMap<>();
		
		for(String s1 :s)
		{
			if(!s1.isBlank())
			{
				map.put(s1, map.getOrDefault(s1, 0)+1);
			}
		}
		String count = map.toString();
		return count;
	}
	@Test
	public void testCase1()
	{
		Assert.assertTrue(countString("our   thoughts become   our lives").contains("thoughts=1"));
	}
	@Test
	public void testCase2()
	{
		Assert.assertTrue(countString("our   thoughts become   our lives").contains("lives=1"));
	}
	@Test
	public void testCase3()
	{
		Assert.assertTrue(countString("our   thoughts become   our lives").contains("our=2"));
	}
	@Test
	public void testCase4()
	{
		Assert.assertTrue(countString("our   thoughts become   our lives").contains("become=1"));
	}

}
