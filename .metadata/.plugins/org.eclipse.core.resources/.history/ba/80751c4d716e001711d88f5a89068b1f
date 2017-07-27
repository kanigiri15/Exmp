package exampleProj;

import java.util.*;
import java.util.List;

public class Sol2 {

	public static List<Integer> list ;
	public static List<Integer> Maxlist;
	static int sum = 0;
	static int largstSum = 0;
	public static void main(String[] args) {

		list = new ArrayList<>();
		Maxlist = new ArrayList<>();
		//System.out.println("Enter no of test cases:");
		//Scanner input = new Scanner(System.in);

		//int size = input.nextInt();
		int sum = 0;
		int high = 0;
		int largestSum =0;
		int lrgArr[] = new int[5];
		//int[][] arr = { { 3000,400,1500,4350,2700 }, { 2050, 3650,650,2750,4300 }, { 2000, 700, 2100,700,1650 }, { 300, 200,500,600, 200 },{3000,3100,3200,1100,1400} };
		int[][] arr = { { 800,3000,600,3600,800 }, { 1400, 5200,1600,6000,2600 }, { 3200, 5200, 3200,1600,2400 }, { 800, 2800,4800,600, 1400 },{5200,1400,4800,3800,800},{5000,4200,4800,1800,2000} };
		Sol2 sol = new Sol2();
		System.out.println(sol.rec(arr,0));
	}
	int rec(int[][] arr,int len){
		for(int i=0;i<5;i++){
			if(list.size() <= 5)
			{
				list.add(len,arr[len][i]);
			}
			else{
				list.set(len,arr[len][i]);				
			}
			if(len<arr.length-1){
				rec(arr,len+1);
			}
			else{
				Iterator itr = list.iterator();
				int high = 0;
				sum = 0;
				while(itr.hasNext()){
					int temp = (int) itr.next();
					if(high < temp){
						sum += temp;
						high = temp;
					}
				}
				if(largstSum < sum){
					largstSum = sum;
					Maxlist = list;
				}
			}
		}
		return largstSum;
	}

}
