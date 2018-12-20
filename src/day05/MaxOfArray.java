package day05;
import java.util.Arrays;
//数组最大值
public class MaxOfArray {
	public static void main(String[] args) {
      int[] arr = new  int[10];
      //循环赋值 
      for(int i=0;i<arr.length;i++){
    	  arr[i] = (int)(Math.random()*100);
      }
      //循环输出值 
      for(int i=0;i<arr.length;i++){
    	  System.out.println(arr[i]);
      }
      //求最大值 
      int max = arr[0];
      for(int i=1;i<arr.length;i++){
    	 if(arr[i]>max){
    		 max = arr[i];
    	 }
      }
      System.out.println("max="+max);
      //扩容
	  arr = Arrays.copyOf(arr,arr.length+1);
	  //将max赋给最后一个元素
	  arr[arr.length-1] = max;
		
	  System.out.println("输出扩容后数据:");
	  for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
	   }
	}
}
	
