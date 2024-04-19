package cn.tech.novelty.discount;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zhanglj
 * @desciption 优惠券策略客户端
 */
public class DiscountClient {
    public static void main(String[] args) {
        // 直减；100-10，商品100元
        DiscountContext<Double> zjContext = new DiscountContext<Double>(new ZJCouponDiscount());
        BigDecimal zjDiscountAmount = zjContext.discountAmount(10D, new BigDecimal(100));
        System.out.println("测试结果：直减优惠后金额"+ zjDiscountAmount);
        // 满100减10，商品100元
        DiscountContext<Map<String,String>> mjContext = new DiscountContext<Map<String,String>>(new MJCouponDiscount());
        Map<String,String> mapReq = new HashMap<String, String>();
        mapReq.put("x","100");
        mapReq.put("n","10");
        BigDecimal mjDiscountAmount = mjContext.discountAmount(mapReq, new BigDecimal(100));
        System.out.println("测试结果：满减优惠后金额"+ mjDiscountAmount);
        // 折扣9折，商品100元
        DiscountContext<Double> zkContext = new DiscountContext<Double>(new ZKCouponDiscount());
        BigDecimal zkDiscountAmount = zkContext.discountAmount(0.9D, new BigDecimal(100));
        System.out.println("测试结果：折扣9折后金额"+ zkDiscountAmount);
        // n元购；100-10，商品100元
        DiscountContext<Double> nContext = new DiscountContext<Double>(new NYGCouponDiscount());
        BigDecimal nDiscountAmount = nContext.discountAmount(90D, new BigDecimal(100));
        System.out.println("测试结果：n元购优惠后金额"+ nDiscountAmount);
    }
}
