package com.lp.builder;

public class Buildertest {

    public static void main(String[] args) {
        PhoneBuilder builder = PhoneBuilder.getInatance();
        builder.produceIPhone(5);
        builder.produceSamsung(3);
        for (Phone phone : builder.getPhoneList()) {
            phone.boot();
        }
    }

}
