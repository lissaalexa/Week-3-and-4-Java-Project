import java.lang.reflect.Array;

public class Assignment {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Question 1a and 1b (adding 87 value)
		int[] ages = { 3, 9, 23, 64, 2, 8, 28, 93, 87};
		System.out.println(ages[ages.length - 1] - ages[0]);
		
		//Question 1c
		double sum = 0;
		for (int age : ages) {
			sum = sum + age;
		}
		double average = sum / ages.length;
		System.out.println(average);
		
		//Question 2a
		String[] names = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };
		double sumOfLetters = 0;
		for (String name : names) {
			sumOfLetters = sumOfLetters + name.length();
		}
		double averageOfLetters = sumOfLetters / names.length;
		System.out.println(averageOfLetters);
		
		//Question 2b
		String totalNames = "";
		for (String name : names) {
			totalNames = totalNames + name + " ";
		}
		System.out.println(totalNames);
		
		//Question 3
		System.out.println(names[names.length - 1]);
		
		//Question 4
		System.out.println(names[0]);
		
		//Question 5
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		//Question 6
		int nameSum = 0;
		for (int length : nameLengths) {
			nameSum = nameSum + length;
		}
		System.out.println(nameSum);
		
		System.out.println(concatWord("Hello", 3));
		
		System.out.println(fullName("Melissa", "Collins"));
		
		int[] testints = {20, 50, 355};
		System.out.println(sum(testints));
		
		int[] testints2 = {20, 50, 5};
		System.out.println(sum(testints2));
		
		double[] testdouble = {20, 50, 5};
		System.out.println(calcAvg(testdouble));
		
		double[] testdouble2 = {10, 30, 78};
		System.out.println(calcAvg(testdouble2));
		
		System.out.println(isAvgGreater(testdouble2, testdouble));
		
		System.out.println(willBuyDrink(true, 30.00));
		
		Print("test");
	}
	
	//Question 7
	public static String concatWord(String word, int n) {
		String resultWord = "";
		for (int i = 0; i < n; i++) {
			resultWord = resultWord + word; 
		}
		return resultWord;
	}
	//Question 8
	public static String fullName(String firstName, String lastName) {
		String resultName = firstName + " " + lastName;
		return resultName;
	}
	// Question 9
	public static boolean sum(int[] num) {
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}
		return sum > 100;
	}
	// Question 10
	public static double calcAvg(double[] arr) {
		double sum = 0;
		for (double num : arr) {
			sum = sum + num;
		}
		double sumAvg = sum / arr.length;
		return sumAvg;
	}
	// Question 11
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
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside && moneyInPocket > 10.50) {
			return true;
		} else {
			return false; 
		}
	}
	// Question 13
	public static void Print(String text) {
		
		System.out.print(text);
	}
}