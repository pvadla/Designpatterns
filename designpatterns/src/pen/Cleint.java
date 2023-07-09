package pen;

public class Cleint {

    public static void main(String[] args) {
        WritingStrategy ws = new FastWriting();
        Pen p = new BallPen(ws);
        p.write();
        p.setWritingStrategy(new SlowWriting());
        p.write();

    }
}
