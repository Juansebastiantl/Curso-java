import java.text.DecimalFormat;

public class Ejemplo_tasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double [][] tasas = new double[6][6];
		double interes = 0.1;
		
		for (int i=0; i<6; i++) {
			
			tasas [i][0] = 10000;
			System.out.print(tasas [i][0] + " ");
			//System.out.print(i + ("0" + " ") );
			
		}
		System.out.println(" " );

		for (int j=1; j<5; j++) {
			
			for (int i=0; i<6; i++) {
				tasas [i][j] = (tasas [i][j-1] + ((tasas [i][j-1])*interes));
				DecimalFormat df = new DecimalFormat("#.0");
				System.out.print(df.format(tasas[i][j]) + " " );
				interes = interes + 0.01;
			}
			
			interes = 0.1;
			
			System.out.println(" " );
			
		}
		
	}

}
