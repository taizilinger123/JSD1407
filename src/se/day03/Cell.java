package se.day03;
/**
 * 作为集合元素进行测试的类
 * @author sige
 *
 */
public class Cell implements Comparable<Cell>{
	public int x;
	public int y;
	public Cell(int x, int y){
        this.x = x;
        this.y = y;
	}

	public String toString() {
		return "(" + x + ","+ y + ")";
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + x;
//		result = prime * result + y;
//		return result;
//	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Cell other = (Cell) obj;
//		if (x != other.x)
//			return false;
//		if (y != other.y)
//			return false;
//		return true;
//	}
	

	public boolean equals(Object obj) {
		if (this == obj){
			return true;
		}
		if (obj == null){
			return false;
		}
		if (obj instanceof Cell){
		   Cell c = (Cell) obj;
		   return this.x==c.x&&this.y==c.y;
		}

		return false;
	}
    /*
     * 比较大小的方法
     * 返回值不关注具体的值，只关注取值范围
     * 返回值<0:当前对象比给定的对象小
     * 返回值=0：两个对象相等
     * 返回值>0:当前对象比给定的对象大
     */
	public int compareTo(Cell o) {
        /*
         * 比较规则如下：
         * y值大的就大
         */
		return this.y - o.y;
	}
	
	
	
}
