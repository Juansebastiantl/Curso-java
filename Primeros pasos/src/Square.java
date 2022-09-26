
public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Square.isSquare(198704523);
		System.out.println(Square.isSquare(198704523));
	}
	
   /* public static boolean isSquare(double n) { 
        double numero = n;
        double raiz;
        System.out.println(numero);
        raiz = Math.sqrt(numero);
        raiz = Math.round(raiz);
        System.out.println(raiz);
        raiz = raiz * raiz;
        System.out.println(raiz);
        if(raiz == numero){
          return true; // fix me!
        }
        else{
          return false;
        }
        
        

       }*/
 
	    public static boolean isSquare(int n) {      
	        return Math.sqrt(n) % 1 == 0;
	    }
	
}
