
public class JavaMethods {

//Q1 repeatWord Method: Write a method that takes a String named userWord and an integer value named numTimes. In that method you will take the value in numTimes and create a new String that repeats userWord that many times. Then return the new String value from the method.
/*
 * import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CodingQuestion {

	static String repeatWord(String userWord, int numTimes) {
		// Write your code in here
		String a = "";
		for (int i = 0; i < numTimes; i++) {
		    a += userWord;
		}
		return a;
		
		
		
		
	}

    // Do not change any code below this line 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numTimes;
		String userWord;
		userWord = in.nextLine();
		numTimes = in.nextInt();
		System.out.println(repeatWord(userWord,numTimes));
	}
}	
 */


//Q2 returnSum Method: Create a method named returnSum that accepts 3 integer variables named num1, num2, and num3. Return the sum of the three variables
/*
 *  import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CodingQuestion {

    // Create your method below this line 
	public static int returnSum(int num1, int num2, int num3){
	    int a = num1 + num2 + num3;
	    return a;
	}
	
	// Create your method above this line

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1, num2, num3;
		num1 = in.nextInt();
		num2 = in.nextInt();
		num3 = in.nextInt();
		
		System.out.println(returnSum(num1, num2, num3));
		
	}
}	
 */
	
//Q3 rectanglePerimeter Method: Write a method called rectanglePerimeter that accepts 2 integer variables named length and width. The method should return an integer value representing the perimeter of the rectangle.
	/*
	 * import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CodingQuestion {

	static int rectanglePerimeter(int length, int width) {
		// Write your code here
		int perimeter = 2 * (length + width);
		return perimeter;
		
		
		
	}

    // Do not change the code below this line
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    int length = in.nextInt();
		int width = in.nextInt();
		int perimeter = rectanglePerimeter(length, width);
		System.out.println("The rectangle has a perimeter of " + perimeter);
	}
}

	 */
//q4 sumOfDigits Method: Write a method call sumOfDigits that takes an integer variable called digits. Then return the sum of all the numbers in digits. For example, 245 would be 2 + 4 + 5 = 11.

/*
 * 	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumOfDigits(234);

	}
	public static int sumOfDigits(int digits) {
		// Write your code below
		int temp0 = digits;
		int answer = 0;
		while (temp0 > 0) {
		    int temp2 = (temp0)%10;
		   // System.out.println("temp2: " + temp2);
		    answer+= temp2;
		   // System.out.println("answer: " + answer);
		    temp0 /=10;
		    //System.out.println("Temp0: " + temp0);
		    
		}
		//System.out.println(answer);
		return answer;
	}
 */
	//Q4 createArray Method: Write a method that accepts five integer values stored in the variables a, b, c, d, e. In the method, you will create an array of integers that stores the value of these five variables. Your return statement will return this newly created array.
/*
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CodingQuestion {

	static int[] createArray(int a, int b, int c, int d, int e) {
		// Add your code here 
		int[] erray = new int[]{a,b,c,d,e};
		return erray.le
		
		
		
	}

    // Do not change any of the code below this line 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a,b,c,d,e;
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		d = in.nextInt();
		e = in.nextInt();
		int[] mainArray = createArray(a, b, c, d, e);
		System.out.println("The third number in your array is: " + mainArray[2]);
	}
}
 */
// Q5	
}
