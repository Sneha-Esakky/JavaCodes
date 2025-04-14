package patterns;

public class P4 {

	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		// Second line: a a a
		for (int i = 1; i <= 3; i++) {
			System.out.print("a ");
		}
		System.out.println();

		// Third line: 1 2
		for (int i = 1; i <= 2; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		// Fourth line: a
		System.out.println("a");
	}

}
