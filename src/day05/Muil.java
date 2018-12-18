package day05;
//九九乘法表
public class Muil {
	public static void main(String[] args) {
		for(int n=1;n<=9;n++){//外层循环
			for(int i=1;i<=n;i++){//内层循环
				System.out.print(i+"*"+n+"="+i*n+"\t");
			}
			System.out.println(); //换行
		}
	}
}
