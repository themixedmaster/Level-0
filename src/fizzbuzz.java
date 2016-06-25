
public class fizzbuzz {

	public static void main(String[] args) {
		int num = 1;
		for(int i = 1; num < 31; num++){
			if( num % 3 == 0 && num % 5 == 0){
				System.out.println("FIZZ BUZZ");	
			}else if( num % 3 == 0){
				System.out.println("FIZZ");
			}else if( num % 5 == 0){
				System.out.println("BUZZ");
			}else{
				System.out.println(num);
			}
		}
	}
	
}
