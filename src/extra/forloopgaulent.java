package extra;

public class forloopgaulent {
	public static void main(String[] args) {

		for (int i = 0; i < 101; i++) {
			System.out.println(i);

		}

		for (int i = 100; i > 0; i--) {
			System.out.println(i);

		}

		for (int i = 0; i < 101; i = i + 2) {
			System.out.println(i);

		}

		for (int i = 1; i < 101; i = i + 2) {
			System.out.println(i);

		}

		for (int i = 0; i < 501; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " is Even");
			} else {
				System.out.println(i + " is Odd");
			}

		}

		for (int i = 0; i < 777; i = i + 7) {
			System.out.println(i);

		}

		for (int i = 2006; i < 2018; i++) {
			int B = i - 2006;
			System.out.println("In " + i + ",i was " + B + " years old");
		}

		for (int i1 = 0; i1 < 3; i1++) {
			for (int j = 0; j < 3; j++) {

				System.out.println(i1 + " " + j);
			}

		}
		for (int u = 0; u < 3; u++) {
			for (int y = 1; y < 4; y++) {

				System.out.print(y + u * 3 + " ");

			}
			System.out.println();
		}

		
		for (int u = 0; u < 10; u++) {
			for (int y = 1; y < 11; y++) {

				System.out.print(y + u * 10 + " ");

		
			
			
			
			
			}
			System.out.println();
		}
		
		for (int w = 1; w < 7; w++) {
			for (int q = 0; q < w; q++) {

				System.out.print(" * ");

			}
			System.out.println();
		}
		
		
		
		
		
	
		
		
		
		
		
		
	}

}