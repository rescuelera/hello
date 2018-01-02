public class Point {

    int x;
    int y;

    public static double distance(Point p1, Point p2)
    {
        int deltaX = p1.x - p2.x;
        int deltaY = p1.y - p2.y;

        return Math.sqrt(deltaX*deltaX+deltaY*deltaY);
    }

}

//Point point1;
//Point point2;
//Point.distance(point1,point2)