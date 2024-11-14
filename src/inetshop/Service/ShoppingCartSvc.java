package inetshop.Service;

import java.util.List;

public interface ShoppingCartSvc {
    List<Integer> get();
    void add (List<Integer> ids);

}

