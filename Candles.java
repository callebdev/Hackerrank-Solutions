
public class Candles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("WELCOME");
		int [] ar = {7, 6, 7, 7};
		
		int candles = 0; 
		int max = 0;
		
		for (int i = 0; i<ar.length; i++){
			
			if(ar[i]>max){
				max = ar[i]; 
			}	
			
		}
		
		for (int i = 0; i<ar.length; i++ ){
			
			if (ar[i] == max){
				candles ++;
			}
			
		}
	
		System.out.println(candles);
		
		
		
	}

}
