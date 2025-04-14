package strings123;

public class S21 {

	public static void main(String[] args) {
String s="Java is a Programming language";
byte[] b=s.getBytes();
for (byte c : b) {
	System.out.print((char)c);
}
	}

}
