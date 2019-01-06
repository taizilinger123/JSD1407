package oo.day03;
//T类与J类的测试类
public class TJTest {
	public static void main(String[] args) {
      T t = new T(1,2);
      printWall(t);
	}
	//打墙+打T型
	public static void printWall(T t){
		Cell[] cells = t.cells;//获取t型的cells并存储在cells引用中
		for(int i=0;i<20;i++){
			for(int j=0;j<10;j++){
				if(i==cells[0].row && j==cells[0].col
				   ||
				   i==cells[1].row && j==cells[1].col
				   ||
				   i==cells[2].row && j==cells[2].col
				   ||
				   i==cells[3].row && j==cells[3].col){
					System.out.print("* ");
				}else{
					System.out.print("- ");
				}
			}
			System.out.println();
		}
	}
}
