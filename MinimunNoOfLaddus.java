import java.util.Arrays;
import java.util.Scanner;


public class MinimunNoOfLaddus {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no of students");
		int noOfStudents = scanner.nextInt();
		System.out.println("Enter students ratings array");
		int[] ratings = new int[noOfStudents];
		for(int j=0;j<noOfStudents;j++){
			int a = scanner.nextInt();
			ratings[j]=a;
		}
		scanner.close();
		minNoOfLaddus(ratings);

	}
	
	private static void minNoOfLaddus(int[] arr){
		int minNoOfLaddus = 1;
		int firstcount = 0;
		int secondcount = 0;
		Arrays.sort(arr);
		for(int i=1; i<arr.length ; i++){
			if(arr[i] > arr[i-1]){
				firstcount++;
				minNoOfLaddus=minNoOfLaddus+firstcount+1;
			}else if(arr[i] == arr[i-1]){
				secondcount++;
				minNoOfLaddus=minNoOfLaddus+secondcount;
			}
		}
		System.out.println(minNoOfLaddus);
	}

}
