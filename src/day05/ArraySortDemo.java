package day05;
import java.util.Arrays;
import java.util.Random;   //1.
//数组排序
public class ArraySortDemo {
	public static void main(String[] args) {
		/*
		int[] arr = {1,7,56,45,232,44,12};
		//效率最高----建议使用
		Arrays.sort(arr);//对arr数组进行升序排序
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		*/
		
		Random rand = new Random();  //2.
		int[] arr = new int[100];
		for(int i=0;i<arr.length;i++){
			//arr[i] = (int)(Math.random()*100);
			arr[i] = rand.nextInt(100); //3.
		}
		//冒泡算法
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]<arr[j+1]){  //倒序排序
					int t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
				}
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
		
		
	}
}