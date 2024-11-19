package inetshop.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class myExcNeedTypeInt extends  RuntimeException{
    public myExcNeedTypeInt(String message) {
        super(message);
    }
}

