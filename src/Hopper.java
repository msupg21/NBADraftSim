import java.util.Collections;
import java.util.List;

public class Hopper {
	private List<Ball> totalBallOrd;
	private Ball drawnBall; 

	public Hopper() {

	}

	public Ball getDrawnBall() {
		return drawnBall;
	}

	public Hopper(List<Ball> ballOrder) {
		super();
		this.totalBallOrd = ballOrder;
	}

	public void addBall() {
		BallFactory b1 = new BallFactory();
		totalBallOrd = b1.createOrder();
		shuffle(totalBallOrd);

	}

	public void shuffle(List<Ball> ball) {
		Collections.shuffle(ball);
		drawBall();
	}

	public Ball drawBall() {
		drawnBall = totalBallOrd.get(0);
		return drawnBall;

	}

}
