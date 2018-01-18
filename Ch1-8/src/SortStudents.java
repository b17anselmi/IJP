//Exercise 7.13, given student names and grades, display them in descending order 
import java.util.Scanner;
public class SortStudents {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		  System.out.print("Enter the number of students:");
		 
		  int n = input.nextInt();
		  double[] score = new double[n];
		  String[] names = new String[n];
		 
		  System.out.println("Enter student names and score:");
		 
		  for (int i = 0; i < score.length; i++) {
		   names[i] = input.next();
		   score[i] = input.nextDouble();
		  }
		  selectionSort(score, names);
		   
		  System.out.println("Student names and scores in decreasing order:" + '\n');
		  for (int i = names.length - 1; i >= 0; i--) {
		   System.out.println(names[i] + ": " + score[i]);
		  }
		 
		 }
		 
		 public static void selectionSort(double[] list, String[] names) {
		 
		  for (int i = 0; i < list.length - 1; i++) {
		   // Find the minimum in the list[i..list.length-1]
		   double currentMin = list[i];
		   int currentMinIndex = i;
		 
		   for (int j = i + 1; j < list.length; j++) {
		    if (currentMin > list[j]) {
		     currentMin = list[j];
		     currentMinIndex = j;
		    }
		   }
		 
		   // Swap list[i] with list[currentMinIndex] if necessary
		   if (currentMinIndex != i) {
		    list[currentMinIndex] = list[i];
		    list[i] = currentMin;
		    // Swap names
		    String temp = names[currentMinIndex];
		    names[currentMinIndex] = names[i];
		    names[i] = temp;
		 
		   }
		  }
		 }
		 }


