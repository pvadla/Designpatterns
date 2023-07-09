package behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CakeShop implements Iterable<String>{

    private List<String> cakeType;

    public CakeShop() {
        this.cakeType = new ArrayList<>();
    }


    public void addCake(String cake){
        this.cakeType.add(cake);
    }

    @Override
    public CakeShopIterator iterator() {
        return new CakeShopIteratorImpl(cakeType);
    }
}
