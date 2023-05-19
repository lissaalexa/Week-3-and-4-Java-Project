import java.lang.reflect.Array;

public class Assignment {

	public static void main(String[] args) {
		//Question 1a and 1b (adding 87 value)
		int[] ages = { 3, 9, 23, 64, 2, 8, 28, 93, 87};
		System.out.println(ages[ages.length - 1] - ages[0]);
		//prints out the difference between the last and first elements of the ages array
		
		//Question 1c
		double sum = 0;
		for (int age : ages) {
			sum = sum + age;
			//calculates the sum of all the elements in the ages array
		}
		double average = sum / ages.length;
		//calculates the average of all the elements in the ages array
		System.out.println(average);
		//prints out the calculated average in the ages array
		
		//Question 2a
		String[] names = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };
		double sumOfLetters = 0;
		for (String name : names) {
			sumOfLetters = sumOfLetters + name.length();
			//calculates the sum of the lengths of all the names in the names array
		}
		double averageOfLetters = sumOfLetters / names.length;
		//calculates the average length of names
		System.out.println(averageOfLetters);
		//prints out the average length in the names array
		
		//Question 2b
		String totalNames = "";
		for (String name : names) {
			totalNames = totalNames + name + " ";
			//concatenates all the names in the names array with spaces between the names
		}
		System.out.println(totalNames);
		//prints out all the total names separated by spaces
		
		//Question 3
		System.out.println(names[names.length - 1]);
		//prints the last name in the names array
		
		//Question 4
		System.out.println(names[0]);
		//prints the first name in the names array
		
		//Question 5
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		//created a new array of integers called namesLengths
		//Using a for loop to insert the length of each name to the namesLength array
		}
		//Question 6
		int nameSum = 0;
		for (int length : nameLengths) {
			nameSum = nameSum + length;
		}
		//loop to repeat over the nameLengths array and calculate the sum of all the elements in this array
		System.out.println(nameSum);
		//prints out the sum of all the names lengths
		
		System.out.println(concatWord("Hello", 3));
		//prints out the concatenation of hello an repeating itself 3x
		
		System.out.println(fullName("Melissa", "Collins"));
		//prints out the full name by concatenating the first name and the last name indicated
		
		int[] testints = {20, 50, 355};
		System.out.println(sum(testints));
		//prints true if the sum of the elements in the testints array is greater than 100
		//if not, it will indicate as false
		
		int[] testints2 = {20, 50, 5};
		System.out.println(sum(testints2));
		//prints true if the sum of the elements in the testints2 array is greater than 100
		//if not, it will indicate as false
		
		double[] testdouble = {20, 50, 5};
		System.out.println(calcAvg(testdouble));
		//prints out the calcAvg method with testdouble as the argument
		
		double[] testdouble2 = {10, 30, 78};
		System.out.println(calcAvg(testdouble2));
		//prints out the calcAvg method with testdouble2 as the argument
		
		System.out.println(isAvgGreater(testdouble2, testdouble));
		//prints results of if the average of testdouble2 is greater than the average of testdouble
		
		System.out.println(willBuyDrink(true, 30.00));
		//print willBuyDrink to return as true by inputting true (30.00)
		
		System.out.println(countVowels("aesthetic"));
		//printing word aesthetic to calculate how many vowels are in the word
	}
	
	//Question 7
	public static String concatWord(String word, int n) {
		String resultWord = "";
		for (int i = 0; i < n; i++) {
			resultWord = resultWord + word;
			//concatenates the word with the resultWord
		}
		return resultWord;
		//returns the final concatenated word
	}
	//Question 8
	//method that takes two strings, firstName and lastName and returning the full name with the space in between the names
	public static String fullName(String firstName, String lastName) {
		String resultName = firstName + " " + lastName;
		return resultName;
	}
	// Question 9
	//method that takes an array of integer and returns true if the sum of all the integers in the array are greater than 100
	//by using Boolean, and looping it in a for each loop by looping through all of the numbers
	public static boolean sum(int[] num) {
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}
		return sum > 100;
	}
	// Question 10
	//method that takes an array of double and returns the average of all the elements in the array by looping through each value in the array
	//and calculating them to the sum and dividing them by the length of the array and returning the sum average
	public static double calcAvg(double[] arr) {
		double sum = 0;
		for (double num : arr) {
			sum = sum + num;
		}
		double sumAvg = sum / arr.length;
		return sumAvg;
	}
	// Question 11
	//takes 2 arrays of double and returning if it is true if the average of the elements in the first array are greater
	//than the average of the elements in the second array
	public static boolean isAvgGreater(double[] arr1, double[] arr2) {
		double sum1 = 0;
		for (double num1 : arr1) {
			sum1 = sum1 + num1;
		}
		double sum1Avg = sum1 / arr1.length;
		double sum2 = 0;
		for (double num2 : arr2) {
			sum2 = sum2 + num2;
		}
		double sum2Avg = sum2 / arr2.length;
		return sum1Avg > sum2Avg;
	}
	// Question 11 another example
	public static boolean isAverageGreater(double[] arr1, double[] arr2) {
		return calcAvg(arr1) > calcAvg(arr2);
	}
	// Question 12
	//takes boolean isHotOutside and a double moneyInPocket and returns true if it is hot outside AND if there is moneyInPocket greater than 10.50
	//if statement to indicate this, anything else will return false
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside && moneyInPocket > 10.50) {
			return true;
		} else {
			return false; 
		}
	}
	// Question 13
	//CountVowel is the method I chose that takes a string as an input and returns the number of vowels 
	//in the string. CountVowels is the method.
	//The variable called 'count' begins at 0 and loops through each character in the string. For each
	//character in the string, it checks if it is a vowel and if it does, it increments by 1.
	public static int countVowels(String word) {
		int count =  0;
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				count++;
			}
		}
		return count;
	//once finished going through all of the characters in the string, it returns the final count of the word.
	}
}