package com.vshop;

public class VoucherCalculator {
    public double calculateFinalPrice(double cartTotal, double shippingFee, double voucherValue) {
        // Lỗi 11/11 đã được vá bằng rào chắn Poka-Yoke
        // Đảm bảo giá cuối cùng không bao giờ nhỏ hơn 0
        double finalPrice = cartTotal + shippingFee - voucherValue;
        return Math.max(0, finalPrice);
    }
}
