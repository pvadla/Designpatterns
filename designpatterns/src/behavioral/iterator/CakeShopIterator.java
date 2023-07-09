package behavioral.iterator;

import java.util.Iterator;

public interface CakeShopIterator extends Iterator<String> {

    boolean hasNext();

    String next();

}
