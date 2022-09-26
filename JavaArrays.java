
public class JavaArrays {

	//Q1 Create & Return An Array of Characters: In the method wordToArray take the value of userWord and turn it into an array of characters from each letter in word. Call your new array charArray and return that variable in the method wordToArray.
	/*
	 * import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CodingQuestion {

	static char[] wordToArray(String userWord) {
	    //Write your code below 
	    char[] charArray = userWord.toCharArray();
	    return charArray;
	    
	    
	    
	    
	    
	}

    //Do not change the code below this line
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String userWord;;
		userWord = in.nextLine();
		
		System.out.println("Your array is: ");
		System.out.println(Arrays.toString(wordToArray(userWord)));

	}
}
	 */
	//Q2 Reverse An Array: Create an array using five (5) integers provided by the user. Once the array is created, create a new array that is the reverse of the original array. Loop through each array and print each element in the console.
	/*
	 * import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CodingQuestion {

	static void reverseArray(int a, int b, int c, int d, int e) {
		// Write your code below this line 
		int[] erray = new int[]{a,b,c,d,e};
		int temp = erray.length;
		int[] erray2 = new int[temp];
		for (int i = 0; i < temp; i++){
		    erray2[i] = erray[(temp-1)-i];
		    System.out.println(erray[i]);

		}
		for (int i = 0; i < temp; i++){
		    System.out.println(erray2[i]);
		    
		}

		
		
		
		
		// Write your code above this line 
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a,b,c,d,e;
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		d = in.nextInt();
		e = in.nextInt();
		reverseArray(a, b, c, d, e);
	}
}
	 */
	//Q3 Create An Array of Integer: In the method createInt take the 6 variables that are passed in as num1, num2, num3, num4, num5 and num6 and use them to create an array of integers called arrayInt. Return the last item in arrayInt.
	/*
	 * import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CodingQuestion {

	static int createInt(int num1, int num2, int num3, int num4, int num5, int num6) {
		// Write your code below this line 
		int[] arrayInt = new int[]{num1,num2,num3,num4,num5,num6};
		int temp = arrayInt.length -1;
		return arrayInt[temp];
		
		
		
		
		
	}

    // Do not change the code below this line 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1, num2, num3, num4, num5, num6; 
		num1 = in.nextInt();
		num2 = in.nextInt();
		num3 = in.nextInt();
		num4 = in.nextInt();
		num5 = in.nextInt();
		num6 = in.nextInt();
		
		int returnedInt = createInt(num1, num2, num3, num4, num5, num6);
		System.out.println("The last number of the array is " + returnedInt);
	}
}
	 */
	//Q4 Modifying Elements in an Array: Given an array of integers, replace the first and last value stored in the array with integer values provided by the user. Loop through the array and print the changed array to the console.
	/*
	 * import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CodingQuestion {

	static void changeTwo(int a, int b, int[] arr) {
        // Add your code below this line 
        int temp = arr.length -1;
        arr[0] = a;
        arr[temp] = b;
        for (int num : arr) {
            System.out.println(num);
        }
        
        
        
        
        // Add your code above this line 
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a,b;
		a = in.nextInt();
		b = in.nextInt();
		
		int[] arr = { 3, 7, 0, 4, -6, 10, 55 };
		changeTwo(a, b, arr);
	}
}
	 */
	//Q5 Build A New Array: Given an array of words, create a new array that combines three (3) words provided by the user and the original array. Loop through the new array and print each element to the console.
	/*import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CodingQuestion {

	static void newArray(String word1, String word2, String word3, String[] arr) {
		// Add your code below this line 
		int temp = arr.length;
		String[] words = new String[temp+3];
		for (int i = 0; i < temp; i++) {
		    words[i] = arr[i];
		}
		words[temp] = word1;
		words[temp+1] = word2;
		words[temp+2] = word3;		
		for (String word : words){
		    System.out.println(word);
		}
		
		
		
		
		// Add your code abouve this line
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] arr = {"Astros", "Reds", "Phillies", "Dodgers", "Angels"};
		String word1, word2, word3;
		word1 = in.nextLine();
		word2 = in.nextLine();
		word3 = in.nextLine();
		newArray(word1, word2, word3, arr);
		
	}
}
	 * 
	 */
//Q6 Create an equation that adds num1 and num2 and then multiply that by num3. Format it as follows (2 + 2) x 3. Assign that answer to variable named yourAnswer.
	/*
	 * import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CodingQuestion {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1, num2, num3;
		num1 = in.nextInt();
		num2 = in.nextInt();
		num3 = in.nextInt();

        // place your code below this line
        
        int yourAnswer = (num1+num2) * num3;
        
        // write your code above this line 
        
        System.out.println(yourAnswer); //DO NOT CHANGE THIS LINE 

	}
}
	 */
	//Q7 Build An Array: In the method buildArray you will take the integer value stored in the variable num and build an array of that size called numArray. To fill the array, you will write a for loop that checks to see if the iterator is less than num and add each iteration to one of the slots in numArray. Return the variable numArray.
	/*
	 * import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CodingQuestion {

	static int[] buildArray(int num) {
		// Write your code below
		int[] numArray = new int[num];
		for (int i =0; i < num; i++){
		    numArray[i] = i;
		}
		return numArray;
		
		
		
		
	}
    // Do not change any of the code below this line
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num;
		num = in.nextInt();
		System.out.println("Your array is: ");
		System.out.println(Arrays.toString(buildArray(num)));
	}
}
	 */
}
