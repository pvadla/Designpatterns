package lsp;


//LSP violation
//subclass should be completely substitutable with the super class
public class lsptest {
    public static void main(String[] args) {
        Rectangle rect = new Square(10,10);
        rect.setWidth(30);
        System.out.println(rect.getArea());
    }
}
