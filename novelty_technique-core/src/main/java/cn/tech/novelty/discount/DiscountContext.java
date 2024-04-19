package cn.tech.novelty.discount;

import java.math.BigDecimal;

/**
 * @author zhanglj
 * @desciption 策略模式控制类
 */
public class DiscountContext<T> {

    private ICouponDiscount<T> couponDiscount;

    public DiscountContext(ICouponDiscount<T> couponDiscount) {
        this.couponDiscount = couponDiscount;
    }

    public BigDecimal discountAmount(T couponInfo, BigDecimal skuPrice){
       return couponDiscount.discountAmount(couponInfo,skuPrice);
    }

}
