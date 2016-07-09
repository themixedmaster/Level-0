
public class Sequence {
	public static void main(String[] args) {
		int back2 = 1;
		int back1 = 1;
		System.out.println(back2);
		System.out.println(back1);
		for(int i = 1; i < 100; i++){
			int num = back2 + back1;
			System.out.println(num);
			back2 = back1;
			back1 = num;
		}
	}
}
