package com.ekwateur.utils;

public class ClientValidator {
    public static boolean isValidClientReference(String clientReference){
        if(clientReference == null)
            return false;
        return clientReference.matches("EKW\\d{9}");
    }
}
