import java.util.Scanner;

public class Main {

	private static Scanner in;
	private static int uTC;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		int BJT = in.nextInt();
		if(BJT/10%10 > 5){
			BJT = BJT*10;
			if(BJT/100 < 8){
				BJT += 2400;
				uTC = BJT-800;
				BJT = BJT/10;
				System.out.println(uTC);
			}
			else{
				uTC = BJT-800;
				BJT = BJT/10;
				System.out.println(uTC);
			}
		}
		
	}

}