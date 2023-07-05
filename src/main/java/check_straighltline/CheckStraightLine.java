package check_straighltline;

/**
 * @author Dm.Petrov
 * DATE: 05.07.2023
 */
public class CheckStraightLine {
    public boolean checkStraightLine(int[][] coordinates) {
        int length = coordinates.length;
        if (length == 2)
            return true;
        int deltaX = coordinates[1][0] - coordinates[0][0];
        int deltaY = coordinates[1][1] - coordinates[0][1];
        for (int i = 2; i < length; i++) {
            int currentDeltaX = coordinates[i][0] - coordinates[i - 1][0];
            int currentDeltaY = coordinates[i][1] - coordinates[i - 1][1];
            if (deltaX * currentDeltaY != deltaY * currentDeltaX)
                return false;
        }
        return true;
    }
}
