package inetshop.Service;

import java.util.List;

public interface shoppingCartSvc {
    List<Integer> get();
    void add (List<Integer> ids);

}

