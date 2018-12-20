package day05;
//数组演示
public class ArrayDemo {
	public static void main(String[] args) {
		/*
		//定义数组，new后每个元素都默认为0
		int[] arr = new int[4];
		System.out.println(arr[2]);//0
		
		int[] a;
		//System.out.println(a[2]);//错误，未初始化
		
		int[] b;
		//b = {1,4,7,3}; //错误，直接{}只能声明同时
		b = new int[4]; //先声明再初始化
		int[] c = new int[4];//声明同时初始化
		int[] d = {1,4,7,3};
		int[] e = new int[]{1,4,7,3};
		*/
		/*
		int[] arr = new int[4];
		arr[0] = 5;
		arr[2] = 8;
		arr[3] = 6;
		//arr[4] = 9;  //异常，下标越界
		System.out.println(arr.length); //4
		*/
		
		int[] arr = new int[10];
		//循环给每一个元素赋值
		for(int i=0;i<arr.length;i++){
			arr[i] = (int)(Math.random()*100);
		}
		System.out.println("数组元素如下:");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		System.out.println("倒着输出:");
		for(int i=arr.length-1;i>=0;i--){
			System.out.println(arr[i]);
		}
		
		/*
		 * 1.声明int型数组a，包含4个元素
		 *   输出a中的第3个元素----可以吗?值是?
		 * 2.声明int型数组b，直接初始化为1,4,6
		 *   声明int型数组c，new时直接初始华灯1,4,6
		 * 3.声明double型数组d，包含3个元素
		 *   给第2个元素赋值为55.5
		 *   输出最后一个元素
		 * 4.声明int型数组arr，包含10个元素
		 *   将这10个元素赋值为0到99之间的随机数
		 *   输出这10个元素的值
		 */
		
	}
}