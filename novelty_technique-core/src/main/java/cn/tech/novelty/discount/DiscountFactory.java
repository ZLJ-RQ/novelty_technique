package cn.tech.novelty.discount;

import cn.tech.novelty.model.enums.DiscountEnum;

/**
 * @author 若倾
 * @description 优惠券工厂
 */
public class DiscountFactory {
    public static ICouponDiscount createDiscount(DiscountEnum discountEnum) {
        switch (discountEnum) {
            case MAX_OUT:
                return new MJCouponDiscount();
            case IMMEDIATELY_REDUCE:
                return new ZJCouponDiscount();
            case DISCOUNT:
                return new ZKCouponDiscount();
            case FIXED:
                return new NYGCouponDiscount();
            default:
                throw new IllegalArgumentException("Unsupported discount type: " + discountEnum);
        }
    }
}