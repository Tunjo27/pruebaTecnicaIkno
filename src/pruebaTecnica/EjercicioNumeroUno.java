package pruebaTecnica;

public class EjercicioNumeroUno {

	public static void main (String[] args) {
	
	//	
		int matriz[][] = new int[3][3];
		matriz[0][0] = 0;
		matriz[0][1] = 1;
		matriz[0][2] = 0;
		matriz[1][0] = 1;
		matriz[1][1] = 0;
		matriz[1][2] = 1;
		matriz[2][0] = 0;
		matriz[2][1] = 1;
		matriz[2][2] = 0;	
		
	for (int x=0; x < matriz.length; x++) {
		  for (int y=0; y < matriz[x].length; y++) {
		    System.out.println (matriz[x][y]);
		  }
		}
	}
	
}
