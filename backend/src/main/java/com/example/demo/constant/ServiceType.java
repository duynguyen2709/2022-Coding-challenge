package com.example.demo.constant;

import java.util.Arrays;
import java.util.List;

public enum ServiceType {
    TPE("1,22"),
    ZAS("2"),
    WALLET("3,4"),
    BC("5,6,7"),
    Visa_Direct("8"),
    IBFT("9"),
    Withdraw("10"),
    MTE("11"),
    RPE("12,13"),
    Evoucher("14,15"),
    Direct_Discount("16,17"),
    Trans_Refund("18"),
    Bank_Linking("20,21"),
    User_Demographic("23,24"),
    UN_KNOW("0");

    private final String code;

    ServiceType(String code) {
        this.code = code;
    }

    public String[] codeAsList() {
        return code.split(",");
    }

    public String getCode() {
        return code;
    }

    public static ServiceType fromCode(String code) {
        if (code == null) {
            return null;
        }

        for (ServiceType type : values()) {
            List<String> sourceId = Arrays.asList(type.code.split("\\s*,\\s*"));

            if (sourceId.contains(code)) {
                return type;
            }
        }
        return UN_KNOW;
    }
}
