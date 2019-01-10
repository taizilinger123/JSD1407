package oo.day04.vis;
import oo.day04.Hoo;

public class Joo {//同包
      void show(){
    	  Hoo o = new Hoo();
    	  o.a = 1;
    	  //o.b = 2;//编译错误
    	  //o.c = 3;//编译错误
    	  //o.d = 4;//编译错误
      }
}

class Koo extends Hoo{//演示protected
	void show(){
		a = 1;
		b = 2;
		//c = 3;//编译错误
		//d = 4;//编译错误
	}
}