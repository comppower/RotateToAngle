import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("enter start angle");
		double angle=keyboard.nextDouble();
		System.out.println("enter target");
		double target = keyboard.nextDouble();
		TurnControl turn = new TurnControl(angle);
		while (true)
		{
			System.out.println("enter current angle");
			angle = keyboard.nextDouble();
			System.out.println(turn.turnAngle(angle, target));
		}
	}

}
