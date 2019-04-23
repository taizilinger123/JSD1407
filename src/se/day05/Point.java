package se.day05;
/**
 * 重写equals方法时应当同时重写hashCode方法
 * 重写规则如下：
 * 若两个对象equals方法比较结果为true,那么hashCode
 * 返回的数字必须相同
 * 但反之则不是必须的，但是也应当尽量避免，即:两个对象
 * 若equals方法比较结果为false,他们的hashCode方法
 * 返回值应尽量不同，否则影响HashMap性能.
 * hashCode方法在当前对象内容没有发生改变的前提下多次调用应当
 * 返回相同的数字
 * @author sige
 *
 */
public class Point {
   private int x;
   private int y;
   
   public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
   }
   
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
	
   
   
   
   
}
