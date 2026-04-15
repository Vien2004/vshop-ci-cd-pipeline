package com.vshop;

public class VoucherCalculator {
    public double calculateFinalPrice(double cartTotal, double shippingFee, double voucherValue) {
        // Lỗi 11/11 đã được vá bằng Poka-Yoke
        double finalPrice = cartTotal + shippingFee - voucherValue;
        return Math.max(0, finalPrice);
    }
}
