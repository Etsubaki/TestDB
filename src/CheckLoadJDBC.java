import java.lang.reflect.InvocationTargetException;

public class CheckLoadJDBC {

	public static void main(String[] args) throws 
	InstantiationException,IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
	 // TODO 自動生成されたメソッド・スタブ
	String msg = "";
	 try {
	 Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
	 msg = "ドライバのロードに成功しました";
	 } catch (ClassNotFoundException e){
	 msg = "ドライバのロードに失敗しました";
	 }
	 System.out.println(msg);
	 }

}
