package cn.tech.novelty.discount;

import java.math.BigDecimal;

/**
 * @author zhanglj
 * @desciption 优惠券通用接口
 */
public interface ICouponDiscount <T>{

    /**
     * 优惠券金额计算
     * @param couponInfo 券折扣信息；直减、满减、折扣、N元购
     * @param skuPrice   sku金额
     * @return           优惠后金额
     */
    BigDecimal discountAmount(T couponInfo,BigDecimal skuPrice);
}
