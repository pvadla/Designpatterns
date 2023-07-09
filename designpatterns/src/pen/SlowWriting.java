package pen;

public class SlowWriting implements WritingStrategy{
    @Override
    public void write() {
        System.out.println("Slow writing");
    }
}
