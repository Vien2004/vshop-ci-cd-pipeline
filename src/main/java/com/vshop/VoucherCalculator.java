package com.vshop;

public class VoucherCalculator {
    public double calculateFinalPrice(double cartTotal, double shippingFee, double voucherValue) {
        // Lỗi 11/11: Thuật toán sơ sài, không chặn giá trị âm
        double finalPrice = cartTotal + shippingFee - voucherValue;
        return finalPrice;
    }
}
