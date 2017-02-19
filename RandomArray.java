import java.util.Random;

class RandomArray {

	public static int[] array(int max) {
		Random r = new Random();
		int n = r.nextInt(max);
		
		int[] prova = new int[n];

		for (int i=0; i<n; i++) {
			prova[i] = r.nextInt(100);
		}

		return prova; 
	}

	public static void main(String[] args) {
		int[] a = array(100);


		
	}

}