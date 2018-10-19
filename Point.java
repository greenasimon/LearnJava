public class Point{
    private int x;
    private int y;
    public Point(int a, int b){
        x = a;
        y = b;
    }
    public int getX(){ return x; }
    public int getY(){ return y; }
    public double FindDistance(Point otherPt){
        int dx = x - otherPt.getX();
        int dy = x - otherPt.getY();
        return Math.sqrt(dx*dx + dy*dy );
    }

    public static void main(String[] args){
        Point P1 = new Point(5,8);
        Point P2 = new Point(9,15);
        System.out.println(P1.FindDistance(P2));
    }
}