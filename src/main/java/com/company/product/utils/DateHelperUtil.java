package com.company.product.utils;

import java.util.Date;

public class DateHelperUtil {
    public static Long convertToEpoch(Date date) {
        if (date != null) {
            return date.getTime();
        }
        return null;
    }
}
