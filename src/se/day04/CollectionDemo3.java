package se.day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 所有的集合都支持泛型
 * 而集合中的泛型用来定义集合的元素类型
 * @author sige
 *
 */
public class CollectionDemo3 {
    public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
//        用泛型就没有黄色的叹号报错了
		for(String o:c){
			System.out.println(o);
		}
		/*
		 * 迭代器同样支持泛型，而迭代器声明的泛型
		 * 应当与其遍历的集合的泛型类型一致。
		 */
		Iterator<String> it = c.iterator();
		while(it.hasNext()){
			String str = it.next();
			System.out.println(str);
		}
		
	}
}
