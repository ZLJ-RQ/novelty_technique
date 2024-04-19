package cn.tech.novelty.model.enums;

import cn.tech.novelty.discount.*;
import cn.tech.novelty.interfaces.IDictionary;

/**
 * @author zhanglj
 * @descrpition 优惠券策略枚举
 */
public enum DiscountEnum implements IDictionary {
    MAX_OUT(1, "满减优惠券"),
    IMMEDIATELY_REDUCE(2, "立减优惠券"),
    DISCOUNT(3, "折扣优惠券"),
    FIXED(4, "固定金额优惠券");

    private final int key;

    private final String label;

    DiscountEnum(int key, String label) {
        this.key = key;
        this.label = label;
    }

    @Override
    public int getKey() {
        return key;
    }

    @Override
    public String getLabel() {
        return label;
    }

    public ICouponDiscount getCouponDiscount() {
        return DiscountFactory.createDiscount(this);
    }
}
