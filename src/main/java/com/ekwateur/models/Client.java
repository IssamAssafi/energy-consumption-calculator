package com.ekwateur.models;

import com.ekwateur.utils.ClientValidator;

public class Client {
    private String ref;

    public Client(String ref) {
        if(!ClientValidator.isValidClientReference(ref))
            throw new IllegalArgumentException("Invalid client reference format");
        this.ref = ref;
    }

    public String getRef() {
        return ref;
    }
}
