package com.app.festivesale.service;

import org.springframework.stereotype.Component;

@Component
public class CouponValidator {

    public static final boolean APPLICABLE_FOR_ALL_USER = true;

    public boolean isDiscountApplicable(String couponCode, String username) {
        return isUserEligible(username) && isFestiveCouponValid(couponCode);
    }

    private boolean isFestiveCouponValid(String couponCode) {
        return "FESTIVE".equals(couponCode);
    }

    private boolean isUserEligible(String username) {
        return APPLICABLE_FOR_ALL_USER;
    }

}
