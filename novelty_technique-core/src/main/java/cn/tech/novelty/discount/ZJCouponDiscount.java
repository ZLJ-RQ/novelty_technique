package cn.tech.novelty.discount;

import java.math.BigDecimal;

/**
 * @author zhanglj
 * @desciption 立减优惠券
 */
public class ZJCouponDiscount implements ICouponDiscount<Double>{
    /**
     * 立减
     * 1. 使用商品价格减去优惠价格
     * 2. 最低支付金额1元
     */
    @Override
    public BigDecimal discountAmount(Double couponInfo, BigDecimal skuPrice) {
        BigDecimal discountAmount = skuPrice.subtract(new BigDecimal(couponInfo.toString()));
        if (discountAmount.compareTo(BigDecimal.ZERO)<1) {
            return BigDecimal.ONE;
        }
        return discountAmount;
    }
}
