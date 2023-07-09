package pen;

abstract class Pen {

    private double price;
    private String name;
    private String type;
    private WritingStrategy writingStrategy;

    public Pen(WritingStrategy ws){
        this.writingStrategy = ws;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public WritingStrategy getWritingStrategy() {
        return writingStrategy;
    }

    public void setWritingStrategy(WritingStrategy writingStrategy) {
        this.writingStrategy = writingStrategy;
    }

    public void write(){
        writingStrategy.write();
    }

}
