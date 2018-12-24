package day06;
import java.util.Random;
import java.util.Scanner;
//猜字符
public class GuessingGame1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int level;
		do{
			System.out.println("请输入等级(5、7、9)：");
			level = scan.nextInt();
		}while(level!=5 && level!=7 && level!=9);
		int count = 0;  //记录猜错的次数
		char[] chs = generate(level); //生成5个字符
		for(int i=0;i<chs.length;i++){
			System.out.print(chs[i]);
		}
		System.out.println();
		while(true){  //自造死循环
			System.out.println("猜吧!");
			String str = scan.next().toUpperCase();//接收用户的串
			if("EXIT".equals(str)){//判断字符串相等的方法
				System.out.println("下次再来");
				break;
			}
			char[] input = str.toCharArray();//将串转为数组
			int[] result = check(chs,input);//对比
			if(result[1]==chs.length){
				int score = chs.length*100-count*10;
				System.out.println("恭喜你，猜对了，得分"+score);
				break;  //结束循环
			}else{
				count++; //猜错一次加1
				System.out.println("字符对了"+result[0]+"个，位置对了"+result[1]+"个");
			}
			
		}
	}
	
	//随机生成5个字符数组
	public static char[] generate(int level){
		char[] chs = new char[level];
		Random rand = new Random();
		char[] letters = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		boolean[] flags = new boolean[letters.length];
		for(int i=0;i<chs.length;i++){
			int index;
			do{
				index = rand.nextInt(letters.length);
			}while(flags[index]);
			chs[i] = letters[index];
			flags[index] = true;
		}
		return chs;
	}
  //比较
  public static int[] check(char[] chs,char[] input){
  	int[] result = new int[2];
  	for(int i=0;i<chs.length;i++){
  		for(int j=0;j<input.length;j++){
  			if(chs[i]==input[j]){
  				result[0]++; //字符对增1
  				if(i==j){
  					result[1]++; //位置对增1
  				}
  				break;
  			}
  		}
  	}
  	return result;
  }
}

// 作业： 
//   public  static int[] gennerateArray(int len,int max){
//	   int[] arr = new int[len];
//	   for(int i=0;i<arr.length;i++){
//		   arr[i] = (int)(Math.random()*max);
//	   }
//     return arr;
//   }