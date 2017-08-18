import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BallFactory {

    private int ballNum;
    private String ballLabel;

    List<Ball> ballOrderList = new ArrayList<>();
    TeamLogos tl = new TeamLogos();

    public BallFactory() {

    }

    public List<Ball> createOrder() {
        Map<Integer, String> ballOrder = new HashMap<>();
        ballOrder.put(250,
                "The Philadelphia 76'ers!!! \n" + tl.sixers);
        ballOrder.put(199, "Los Angeles Lakers!!!" + "\n" + tl.lakers);
        ballOrder.put(156, "New Jersey Nets!!!" + tl.nets);
        ballOrder.put(119, "Phoenix Suns!!!" + tl.suns);
        ballOrder.put(88, "Minnesota T -Wolves!!!" + tl.timberwolves);
        ballOrder.put(63, "New Orleans Pelicans!!!" + tl.hornets);
        ballOrder.put(43, "New York Knicks!!!" + tl.knicks);
        ballOrder.put(28, "Milwaukee Bucks!!!" + tl.bucks);
        ballOrder.put(17, "Denver Nuggets!!!" + tl.nuggets);
        ballOrder.put(17, "Pot Smoking Kings!!!" + tl.kings);
        ballOrder.put(11, "Orlando Magic!!!" + tl.magic);
        ballOrder.put(8, "Utah Jazz!!!" + tl.jazz);
        ballOrder.put(7, "Washington Wizards!!!" + tl.wizards);
        ballOrder.put(6, "Houston Rockets!!!" + tl.rockets);
        ballOrder.put(5, "Chiraq Bulls!!!" + tl.bulls);

        Set<Integer> orderKeys = ballOrder.keySet();
        for (Integer key : orderKeys) {
            createBalls(key, ballOrder.get(key));

        }
        return ballOrderList;
    }

    public void createBalls(int ballNum, String ballLabel) {
        for (int i = 0; i < ballNum; i++) {
            // create ball
            Ball ball = new Ball(ballLabel);
            ballOrderList.add(ball);
            // add ball to ball list
        }

    }
}