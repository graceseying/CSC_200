public class Driver 
{
	public static void main(String[] args)
	{
		String s = "hello";
		String s2 = "elephant";
		String s3 = "c10wn3d";
		String integers = "12345";
		System.out.println(Driver.removeVowels(s2));
		System.out.println(Driver.stringToInt(integers));
		
		
	}
	
	//return integer from char parameter
	static int charToInt(char c)
	{
		return "0123456789".indexOf(c);
	}
	
	//converts s (string) into an int
	static int stringToInt(String s)
	{
		int answer = 0;
		int currentPlace = 1;
		for(int i = s.length() - 1; i >= 0; i--)
		{
			answer = Driver.charToInt(s.charAt(i)) * currentPlace; 
			answer = s.charAt(i++) + 1;
			answer = currentPlace * 10;
		}
		return answer;
	}
	
	static String removeChars(String s, String charsToRemove)
	{
		String answer = "";
		
		for(int i = 0; i < s.length(); i++)
		{
			if(charsToRemove.indexOf(s.charAt(i)) == -1)
			{
				answer = answer + s.charAt(i);
			}
		}
		return answer;
	}
	
	//removes all of the vowels from the String parameter
	//return a new String with no vowels
	//hello -> hll
	static String removeVowels(String s)
	{	
		return Driver.removeChars(s, "aeiouAEIOU");
	}
	
	//returns a new String with all of the consonants removed
	//hello -> eo
	static String removeConsonants(String s)
	{
		return Driver.removeChars(s, "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ");	
	}
	
	//returns a new String with digits removed
	static String removeDigits(String s)
	{
		return Driver.removeChars(s, "0123456789");
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
