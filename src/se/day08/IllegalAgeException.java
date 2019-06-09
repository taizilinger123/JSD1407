package se.day08;
/**
 * 自定义异常
 * 表示年龄不符合人类范围
 * @author sige
 *
 */
public class IllegalAgeException extends Exception{
   private static final long serialVersionUID = 1L;

public IllegalAgeException() {
	super();
	// TODO Auto-generated constructor stub
}

public IllegalAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
	super(message, cause, enableSuppression, writableStackTrace);
	// TODO Auto-generated constructor stub
}

public IllegalAgeException(String message, Throwable cause) {
	super(message, cause);
	// TODO Auto-generated constructor stub
}

public IllegalAgeException(String message) {
	super(message);
	// TODO Auto-generated constructor stub
}

public IllegalAgeException(Throwable cause) {
	super(cause);
	// TODO Auto-generated constructor stub
}
  
}
