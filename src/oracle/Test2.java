package oracle;

import java.util.UUID;

public class Test2 {
	public static void main(String[] args) {
       String uuid = UUID.randomUUID().toString();
       System.out.println(uuid.replaceAll("-", ""));
	}
}
