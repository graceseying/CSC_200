public class Driver 
{
	public static void main(String[] args)
	{
		String s = "hello";
		String s2 = "elephant";
		String s3 = "c10wn3d";
		System.out.println(Driver.removeVowels(s));
		System.out.println(Driver.removeConsonants(s2));
		System.out.println(Driver.removeDigits(s3));
	}
	
	//removes all of the vowels from the String parameter
	//return a new String with no vowels
	//hello -> hll
	static String removeVowels(String s)
	{	
		String noVowels = "";
		for(int i = 0; i < s.length(); i++)
		{
			char c = s.charAt(i);
			if(c == 'b' || c == 'c' || c == 'd' || c == 'f' || c == 'g' || c == 'h' || c == 'j' || c == 'k' || c == 'l' || c == 'm' || c == 'n' || c == 'p' || c == 'q' || c == 'r' || c == 's' || c == 't' || c == 'v' || c == 'w' || c == 'x' || c == 'y' || c == 'z')
			{
				noVowels = noVowels + s.charAt(i);
			}
		}
		return noVowels;
	}
	
	//returns a new String with all of the consonants removed
	//hello -> eo
	static String removeConsonants(String s)
	{
		String noConsonants = "";
		for(int i = 0; i < s.length(); i++)
		{
			char c = s.charAt(i);
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
			{
				noConsonants = noConsonants + s.charAt(i);
			}
		}
		return noConsonants;
	}
	
	//returns a new String with digits removed
	static String removeDigits(String s)
	{
		String noDigits = "";
		for(int i = 0; i < s.length(); i++)
		{
			char c = s.charAt(i);
			if(c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9')
			{
				noDigits = noDigits + s.charAt(i);
			}
		}
		return noDigits;
	}
	
	//return the first occurrence in s where c is found or -1 if
	//it was not found, we can't use the String's indexOf
	static int indexOf(String s, char c)
	{
		for(int i = 0; i < s.length(); i = i + 1)
		{
			if(s.charAt(i) == c)
			{
				return i;
			}
		}
		//if we are still looking...
		return -1;
	}
	
	static void displayString(String s)
	{
		//should display the contents of the String one character per line
		for(int i = 0; i < s.length(); i = i + 1)
		{
			System.out.println(s.charAt(i));
		}
	}
	
	static void displayWithSpaces(String s)
	{
		String answer = "";
		for(int i = 0; i < s.length(); i = i + 1)
		{
			answer = answer + s.charAt(i) + " ";
		}
		System.out.println(answer);
	}
	
	//this method should display on a single line the input String
	//in reverse: "hello" -> "olleh"
	static String reverseString(String s)
	{
		String reverse = "";
		for(int i = s.length() - 1; i >= 0; i--)
		{
			reverse = reverse + s.charAt(i);
		}
		return reverse;
	}
}
