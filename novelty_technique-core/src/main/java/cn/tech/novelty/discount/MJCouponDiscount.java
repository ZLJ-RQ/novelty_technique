package cn.tech.novelty.discount;

import java.math.BigDecimal;
import java.util.Map;

/**
 * @author zhanglj
 * @desciption 满减优惠券
 */
public class MJCouponDiscount implements ICouponDiscount<Map<String,String>>{
    /**
     * 满减计算
     * 1. 判断满足x元后-n元，否则不减
     * 2. 最低支付金额1元
     */
    @Override
    public BigDecimal discountAmount(Map<String, String> couponInfo, BigDecimal skuPrice) {
        //满减金额
        String x = couponInfo.get("x");
        //优惠金额
        String n = couponInfo.get("n");
        //小于商品金额条件的,直接返回商品原价
        if (skuPrice.compareTo(new BigDecimal(x))<0) {
            return skuPrice;
        }
        //减去优惠金额判断
        BigDecimal discountAmount=skuPrice.subtract(new BigDecimal(n));
        if (discountAmount.compareTo(BigDecimal.ZERO)<1) {
            return BigDecimal.ONE;
        }
        return discountAmount;
    }
}
