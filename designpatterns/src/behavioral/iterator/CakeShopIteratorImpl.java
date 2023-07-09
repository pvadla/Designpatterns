package behavioral.iterator;

import java.util.List;

public class CakeShopIteratorImpl implements CakeShopIterator{

    List<String> cakeType;
    int position;

    public CakeShopIteratorImpl(List<String> cakeType) {
        this.cakeType = cakeType;
    }



    @Override
    public boolean hasNext() {
        while(position < cakeType.size()){
            return true;
        }
        return false;
    }

    @Override
    public String next() {
        String cake = cakeType.get(position);
        position++;
        return cake;

    }
}
