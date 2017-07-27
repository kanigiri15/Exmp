package exampleProj;

import java.util.*;

public class Sol {

	public static List<Integer> list ;
	
	public static List<Integer> Maxlist;
	private int sum = 0;
	private int largstSum = 0;
	
	
	public static void main(String[] args) {
		list = new ArrayList<>();
		Maxlist = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int [][] arr = new int[size][5];
		for(int i=0;i<size;i++){
			for(int j=0;j<5;j++){
				arr[i][j]= input.nextInt();
			}
		}
		input.close();
		Sol sol = new Sol();
		sol.rec(arr, 0);
		System.out.println(sol.toString());
	}
	void rec(int[][] arr,int len){
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
				Iterator<Integer> itr = list.iterator();
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
	}
	@Override
	public String toString() {
		return "largstSum = " + largstSum + " for the List: "+ (ArrayList<Integer>) Maxlist;
	}
}
