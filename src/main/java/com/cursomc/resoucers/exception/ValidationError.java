package com.cursomc.resoucers.exception;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError {

    private List<FieldMessage> errors = new ArrayList<>();

    public ValidationError(Integer status, String msg, Long timeStamp) {
        super(status, msg, timeStamp);
    }

    public List<FieldMessage> getErrors() {
        return errors;
    }

    public void addErrors(String fieldName, String messagem ) {
        errors.add(new FieldMessage(fieldName, messagem));
    }
}
