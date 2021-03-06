import java.util.Random;

public class Driver 
{
	public static void main(String[] args)
	{
		int[] arrayOfNumbers = new int[10];
		Driver.fillArrayWithRandomInts(arrayOfNumbers);
		Driver.mergeSort(arrayOfNumbers);
		
	}
	
	
	static void mergeSort(int[] ar)
	{
		Driver.mergeSortHelper(ar, 0, ar.length-1);
	}
	
	static void mergeSortHelper(int[] ar, int begin, int end)
	{
		Driver.display(ar, begin, end);
		if(begin != end)
		{
			int leftBegin = begin;
			int leftEnd = ((end-begin)/2 + begin);
			int rightBegin = ((end-begin)/2 + begin) + 1; 
			int rightEnd = end;
			Driver.mergeSortHelper(ar, begin, ((end-begin)/2 + begin));
			Driver.mergeSortHelper(ar, ((end-begin)/2 + begin) + 1,  end);
			
			int[] temp = new int [(rightEnd - leftBegin) + 1];
			int currLeft = leftBegin;	
			int currRight = rightBegin;
			
			for(int tempPos = 0; tempPos < temp.length; tempPos++)
			{
				if(currLeft < leftEnd)
				{
					temp[tempPos] = ar[currRight];
					currRight++;
				}
				else if(currRight < rightEnd)
				{
					temp[tempPos] = ar[currLeft];
					currLeft++;
				}
				else
				{
					if(ar[currLeft] < ar[currRight])
					{
						temp[tempPos] = ar[currLeft];
						currLeft++;
					}
					else
					{
						temp[tempPos] = ar[currRight];
						currRight++;
					}
				}
			}
			int pos = 0;
			for(int i = leftBegin; i <= rightEnd; i++)
			{
				ar[i] = temp[pos];
				pos++;
			}
			
		}
	}
	
	static void display(int[] ar, int begin, int end)
	{
		for(int i= begin; i <= end; i++)
			{
				System.out.print(ar[i] + " ");
			}
			System.out.println("");
	}
	
	static void bubbleSort(int[] ar)
	{
		boolean swap = true;
		int currvalue;
		
		while(swap)
		{
			swap = false;
			for(int i = 0; i < ar.length - 1; i++)
			{
				if(ar[i] > ar[i + 1])
				{
					currvalue = ar[i];
					ar[i] = ar[i + 1];
					ar [i + 1] = currvalue;
					swap = true;
				}
			}
		}	
	}
	
	//put elements of the array in order
	static void sortArray(int[] ar)
	{
		boolean swap = true;
		int currvalue;
		
		while(swap)
		{
			swap = false;
			for(int i = 0; i < ar.length - 1; i++)
			{
				if(ar[i] > ar[i + 1])
				{
					currvalue = ar[i];
					ar[i] = ar[i + 1];
					ar [i + 1] = currvalue;
					swap = true;
				}
			}
		}
				
	}
	
	static void fillArrayWithRandomInts(int[] ar)
	{
		Random r = new Random();
		for(int i = 0; i < ar.length; i++)
		{
			ar[i] = r.nextInt(101);
		}
	}
	
	static void printIntArray(int[] ar)
	{
		for(int i = 0; i < ar.length; i++)
		{
			System.out.print(ar[i] + " ");
		}
		System.out.println();
	}
	
	static String charArrayToString(char[] ar)
	{
		String answer = "";
		for(int i = 0; i < ar.length; i++)
		{
			answer += ar[i];
		}
		return answer; 
	}
	
	static char [] stringToCharArray(String s)
	{
		char [] array = new char[s.length()];
		for(int i = 0; i < s.length(); i++)
		{
			array[i] = s.charAt(i);
		}
		return array;
	}
	
	static String substring(String s, int beginPos, int endPos)
	{
		String answer = "";
		for(int i = beginPos; i < endPos; i++)
		{
			answer += s.charAt(i);
		}
		return answer;
	}
	
	static String substring(String s, int pos)
	{
		String answer = "";
		for(int i = pos; i < s.length(); i++)
		{
			answer += s.charAt(i);
			//answer = answer + s.charAt(i)
		}
		return answer;
	}
	
	static char intToChar(int val)
	{
		return "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(val);
	}
	
	static String decimalToBase(int decimalNumber, int radix) 
	{
		String result = "";
		
		while(decimalNumber > 0)
		{
			result = Driver.intToChar(decimalNumber % radix) + result;
			decimalNumber = decimalNumber/radix;		
		}
		
		return result;
	}
	
	
	static int baseToInteger(String s, int radix)
	{
		int total = 0;
		int currentPlace = 1;
		char currChar;
		
		for(int i = s.length() - 1; i >= 0; i--)
		{
			currChar = s.charAt(i);
			total += Driver.charToInt(currChar) * currentPlace;
			currentPlace *= radix; 
		}
		return total;
	}
	
	//takes a String representation of a binary # as parameter and return as a int the decimal equivalent
	//"1011" -> 11
	static int binaryToInteger(String bin)
	{
		int total = 0;
		int currentPlace = 1;
		
		for(int i = bin.length() - 1; i >= 0; i--)
		{
			total += Driver.charToInt(bin.charAt(i)) * currentPlace;
			currentPlace *= 2; 
		}
		return total;
	}
	
	
	
	//return integer from char parameter
	static int charToInt(char c)
	{
		return "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(c);
	}
	
	//converts s (string) into an int
	static int stringToInt(String s)
	{
		int total = 0;
		int currentPlace = 1;
		char currChar;
		
		for(int i = s.length() - 1; i >= 0; i--)
		{
			currChar = s.charAt(i);
			if(currChar == '-')
			{
				return total * -1; 
			}
			total += Driver.charToInt(currChar) * currentPlace; 
			currentPlace *= 10; 
		}
		return total;
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
