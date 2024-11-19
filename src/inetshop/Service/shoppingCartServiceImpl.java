package inetshop.Service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import skypro.hw11.shop.inetshop.model.ShoppingCart;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
//@Scope("session")
@SessionScope
public class shoppingCartServiceImpl implements shoppingCartSvc {
    private final shoppingCart shoppingCart=new shoppingCart();

    @Override
    public List<Integer> get() {
        return shoppingCart.getIds();
    }

    @PostConstruct
    public void init() {
        System.out.println("содан новый сервис");
    }
    @Override
    public void add(List<Integer> ids) {
        shoppingCart.setIds(ids);

    }
}

