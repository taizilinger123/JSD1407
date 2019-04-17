package se.day04;

public class TestTypeDemo {
   public static void main(String[] args) {
	  TypeDemo<String> t = new TypeDemo<String>("");
	  String s = t.getX();
	  
	  TypeDemo<Integer> tt = new TypeDemo<Integer>(11);
	  int i = tt.getX();
   }
}
