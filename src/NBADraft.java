
public class NBADraft {

	public static void main(String[] args) throws InterruptedException {
		BallFactory b1 = new BallFactory();
		b1.createOrder();
		NBADraft NBA = new NBADraft();
		System.out.println("\t\t******** Welcome to the 2018 NBA Lottery Selection ********");
		System.out.println();
		Thread.sleep(2000);
		System.out.println("Please welcome NBA Commissioner Adam Silver to the ping pong hopper");
		Thread.sleep(2000);
		System.out.println();
		System.out.println("GM's, please be advised that all lottery prospects from U of M are either taking money from boosters,");
		System.out.print("or enjoy calling time-outs they don't have.");
		Thread.sleep(5000);
		NBA.winner();
	}

	public void winner() throws InterruptedException {
		Hopper h1 = new Hopper();
		h1.addBall();
		h1.drawBall();
		Ball winner = h1.getDrawnBall();
		System.out.println();
		System.out.println();
		System.out.println("And the first pick of this years draft goes to: ");
		System.out.print("\uD83C\uDFC0\t");
		Thread.sleep(300);
		System.out.print("\uD83C\uDFC0\t");
		Thread.sleep(300);
		System.out.print("\uD83C\uDFC0\t");
		Thread.sleep(300);
		System.out.print("\uD83C\uDFC0\t");
		Thread.sleep(300);
		System.out.print("\uD83C\uDFC0\t");
		Thread.sleep(300);
		System.out.print("\uD83C\uDFC0\t");
		Thread.sleep(300);
		System.out.print("\uD83C\uDFC0\t");
		Thread.sleep(300);
		System.out.print("\uD83C\uDFC0\t");
		Thread.sleep(300);
		System.out.print("\uD83C\uDFC0\t");
		Thread.sleep(300);
		System.out.print("\uD83C\uDFC0\t");
		Thread.sleep(300);
		System.out.print("\uD83C\uDFC0\t");
		Thread.sleep(300);
		System.out.print("\uD83C\uDFC0\t");
		Thread.sleep(300);
		System.out.print("\uD83C\uDFC0\t");
		Thread.sleep(300);
		System.out.print("\uD83C\uDFC0\t");
		Thread.sleep(300);
		System.out.print("\uD83C\uDFC0\t");
		Thread.sleep(300);
		System.out.print("\uD83C\uDFC0\t");
		Thread.sleep(300);
		System.out.print("\uD83C\uDFC0\t");
		Thread.sleep(300);
		System.out.print("\uD83C\uDFC0\t");
		Thread.sleep(300);
		System.out.println();
		System.out.println();
		System.out.println("The " + winner);
		
	}

}
