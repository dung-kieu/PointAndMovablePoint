public class main {
    public static void main(String[] args) {
        Point newPoint = new Point(1.1f,1.2f);
        MovablePoint movablePoint = new MovablePoint(1.1f,1.2f,0.1f,0.2f);
        System.out.println(movablePoint.move());
    }
}
