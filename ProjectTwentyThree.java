import java.util.Random;

public class ProjectTwentyThree {
	public static void main(String args[]){
		Random roller = new Random();
		int numberInput;
		
		for (int attack=0;attack<=20;attack++){
			numberInput = roller.nextInt(17);
			System.out.println(numberInput + " ");
		}
	}
}
