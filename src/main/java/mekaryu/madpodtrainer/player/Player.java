package mekaryu.madpodtrainer.player;

import java.util.Scanner;

public class Player {
    static Scanner in = new Scanner(System.in);

    /*
     * Function called each turn
     */
    public static void drive() {
        int x = in.nextInt();
        int y = in.nextInt();
        int nextCheckpointX = in.nextInt(); // x position of the next check point
        int nextCheckpointY = in.nextInt(); // y position of the next check point
        int nextCheckpointDist = in.nextInt(); // distance to the next checkpoint
        int nextCheckpointAngle = in.nextInt(); // angle between your pod orientation and the direction of the next checkpoint
        int opponentX = in.nextInt();
        int opponentY = in.nextInt();

        boolean boost = false;
        int thrust = 100;

        if(nextCheckpointAngle > 50 || nextCheckpointAngle <-50){
            thrust = 0;
        }

        // You have to output the target position
        // followed by the power (0 <= thrust <= 100)
        // i.e.: "x y thrust"
        if(boost == false && nextCheckpointDist > 3000 && !(nextCheckpointAngle > 90 || nextCheckpointAngle <-90)){
            boost = true;
            System.err.println("Using Boost");
            System.out.println(nextCheckpointX + " " + nextCheckpointY + " BOOST");
        }
        else{
            System.out.println(nextCheckpointX + " " + nextCheckpointY + " " + thrust);
        }
        
    }
}
