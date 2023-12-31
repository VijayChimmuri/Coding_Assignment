import java.util.Scanner;
public class RomanToNumber 
{
	int value(char r)
	{
		if (r == 'I'|| r == 'i')
			return 1;
		if (r == 'V'|| r == 'v')
			return 5;
		if (r == 'X'|| r == 'x')
			return 10;
		if (r == 'L'|| r == 'l')
			return 50;
		if (r == 'C'|| r == 'c')
			return 100;
		if (r == 'D'|| r == 'd')
			return 500;
		if (r == 'M'|| r == 'm')
			return 1000;
		return -1;
	}
	int romanToDecimal(String str)
	{
		int res = 0;
		for (int i = 0; i < str.length(); i++) 
		{
			int s1 = value(str.charAt(i));
			if (i + 1 < str.length()) 
			{
				int s2 = value(str.charAt(i + 1));
				if (s1 >= s2) 
				{
					res = res + s1;
				}
				else
				{
					res = res + s2 - s1;
					i++;
				}
			}
			else
			{
				res = res + s1;
			}
		}

		return res;
	}
	public static void main(String args[])
	{
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The Input: ");
		RomanToNumber ob = new RomanToNumber();
		String str = scan.nextLine();
		System.out.println(
		"Integer form of Roman Numeral" + 
		" is " + ob.romanToDecimal(str));
	}
}