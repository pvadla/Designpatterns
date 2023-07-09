package behavioral.iterator;

public class CakeShopMain {

    public static void main(String[] args) {

        CakeShop cs = new CakeShop();
        cs.addCake("Vanilla");
        cs.addCake("Strawberry");
        cs.addCake("chocolate");

        CakeShopIterator ci = cs.iterator();

        while(ci.hasNext()){
            System.out.println(ci.next());
        }
    }
}
