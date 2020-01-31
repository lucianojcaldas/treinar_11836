package operadores;

public class comandodedecisao {
	public static void main(String[] args) {
		int num = 1;
		if (num == 1) {
			System.out.println("numero um");
		} else {
			if (num == 2) {
				System.out.println("numero dois");
			} else {
				if (num == 3) {
					System.out.println("numeo tres");
				} else {
					System.out.println("numero invalido...");
				}
			}
		}
		
	}
}