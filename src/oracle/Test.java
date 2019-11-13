package oracle;

public class Test {
	public static void main(String[] args) {
         System.out.println(test(1, 5));

	}
	
	public static String test(int page,int pagesize){
		   int start = (page-1)*pagesize + 1;
		   int end = page*pagesize;
		   String sql = "SELECT * FROM (SELECT ROWNUM rw,e.* FROM (SELECT empno,ename,sal FROM emp ORDER BY empno)e ) WHERE rw BETWEEN "+start+" AND "+end;
           return sql;
	}

}
