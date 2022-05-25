package novo;

public class Ordenacaosort {

	
		public static void main(String[] args) {
		
	//criar um array de sete elementos
			int[] array = new int [7];
			
			int[] numerosinhos = {3,5,9,4,7,6,8};
			
			
			
			for (int j = 0; j < numerosinhos.length; j++) {
				
				int menor = j;
			
			
			for (int i = j; i < numerosinhos.length; i++) {
				if(numerosinhos[menor] > numerosinhos[i])
					menor = i;
			}
			
			
			int aux = numerosinhos[j];
			numerosinhos[j] = numerosinhos[menor];
			numerosinhos[menor] = aux;
			
			}
			
			imprimiraporradoarry(numerosinhos);
		}

		private static void imprimiraporradoarry(int[ ] numerosinhos) {
			for (int i : numerosinhos) {
				System.out.println(i);
			}
			
		}

	

	}


