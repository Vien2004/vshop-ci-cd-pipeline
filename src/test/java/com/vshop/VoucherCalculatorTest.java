package com.vshop;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VoucherCalculatorTest {

    @Test
    public void testNegativeValue_PokaYoke() {
        VoucherCalculator calc = new VoucherCalculator();
        
        // Mô phỏng sự kiện 11/11: Giỏ 50k, ship 15k, voucher AI lỡ cấp 500k
        double cartTotal = 50000;
        double shippingFee = 15000;
        double voucherValue = 500000; 
        
        double finalPrice = calc.calculateFinalPrice(cartTotal, shippingFee, voucherValue);
        
        // POKA-YOKE GATE: Kỳ vọng giá trị phải trả về 0 (Nhưng code Dev đang trả về âm nên sẽ bị tóm)
        assertEquals(0, finalPrice, "FAIL FAST: Poka-Yoke thất bại! He thong dang tra ve gia tri am.");
    }
}
