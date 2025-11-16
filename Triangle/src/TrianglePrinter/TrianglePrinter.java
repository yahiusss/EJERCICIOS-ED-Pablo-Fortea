package TrianglePrinter;

public class TrianglePrinter {

	public static void main(String[] args) {
		 int N = 5; // tamaño del lado del triángulo
	        printTriangle(N);
	    }

	    public static void printTriangle(int n) {
	        // altura = n
	        for (int i = 1; i <= n; i++) {
	            // espacios anteriores
	            for (int s = 0; s < n - i; s++) {
	                System.out.print(" ");
	            }
	            // asteriscos con separación
	            for (int j = 0; j < i; j++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	    }
	}
