package inetshop.ExcHandlers;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import skypro.hw11.shop.inetshop.Exceptions.MyExcNeedTypeInt;

@ControllerAdvice
public class typeNeType {
    @ExceptionHandler(NumberFormatException.class)
    public void handlerNumberNeNumber(NumberFormatException e){
        System.out.println("Нужны циферки");
        throw new MyExcNeedTypeInt("Допустимы только циферки");
    }
}

