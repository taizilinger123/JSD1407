package day06;
import java.util.Random;
import java.util.Arrays;
public class Homework {
	public static void main(String[] args) {
		/*
		//最小值放在第1个位置
		Random rand = new Random();
		int[] arr = new int[10];
		for(int i=0;i<arr.length;i++){
			arr[i] = rand.nextInt(100);
			System.out.println(arr[i]);
		}
		
		int min = arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]<min){
				min = arr[i];
			}
		}
		//扩容
		arr = Arrays.copyOf(arr,arr.length+1);
		//所有元素平移到它的下一个元素--自己带数
		for(int i=arr.length-1;i>0;i--){
			arr[i] = arr[i-1];
		}
		
		arr[0] = min;
		System.out.println("最新数据:");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		*/
    //开关用于解决:
		//  一次判断不能得到最终结果的情况
		int count = 0; //计数器
		for(int n=2;n<=100;n++){
			boolean flag = true; //假设每个数是质数
			for(int i=2;i<=Math.sqrt(n);i++){//Math.sqrt取平方根 
				if(n%i==0){
					flag = false; //不是质数
					break;
				}
			}
			if(flag){ //相当于if(flag == true),因为flag是boolean类型!flag
				System.out.print(n+" ");
				count++;  //计数增1
				if(count%10==0){ //每10个换一行
					System.out.println();
				}
			}
		}
		System.out.println("共"+count+"个质数");
		
		/*
		for(int n=2;n<=100;n++){
			#int n = 8;
			boolean flag = true; //假设是质数
			for(int i=2;i<n/2;i++){
				if(n%i==0){
					flag = false; //不是质数
					break;
				}
				
			}
			if(flag == true){
				System.out.println(n+"是质数");
			}
		}
		*/
		
		
	}
}