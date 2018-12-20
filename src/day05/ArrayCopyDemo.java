package day05;

import java.util.Arrays;

//数组的复制
public class ArrayCopyDemo {
	public static void main(String[] args) {
      /*
	  int[] a = {10,20,30,40,50}; //源数组
      int[] a1 = new int[6];  //目标数组 
      System.arraycopy(a, 0, a1, 1, 4);//灵活，以后用这个
      for(int i=0;i<a1.length;i++){
    	  System.out.println(a1[i]);
      }
      */
		
	  /*	
	  int[] a = {10,20,30,40,50};
	  //如下代码:a为源数组，6为a1的长度
      int[] a1 = Arrays.copyOf(a, 4);
      for(int i=0;i<a1.length;i++){
    	  System.out.println(a1[i]);
      }
      */
	
	  //扩容(扩大容量)	
	  int[] a = {10,20,30,40,50};
	  a = Arrays.copyOf(a, a.length+1);
	  for(int i=0;i<a.length;i++){
		  System.out.println(a[i]);
	  }
      
	}
}
