package com.translate.FixTrLate.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String message) {
        super(message);
        //sıkıntılı bir durumla karşılaştığımız zaman mesaj
        //yollayacağımız mesaj fonksiyonumuz
    }
}
