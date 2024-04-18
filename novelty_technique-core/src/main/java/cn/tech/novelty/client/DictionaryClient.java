package cn.tech.novelty.client;

import cn.tech.novelty.model.enums.YesOrNoEnum;
import cn.tech.novelty.utils.DictionaryUtils;
import lombok.extern.slf4j.Slf4j;

/**
 * @author zhanglj
 * @description 字典枚举客户端
 */
public class DictionaryClient {

    public static void main(String[] args) {
        int value=0;
        //获取枚举对象
        System.out.println(DictionaryUtils.getDictionaryByKey(YesOrNoEnum.class,value));
        //获取枚举Key
        System.out.println(DictionaryUtils.getDictionaryByKey(YesOrNoEnum.class,value).getKey());
        //获取枚举Label
        System.out.println(DictionaryUtils.getDictionaryByKey(YesOrNoEnum.class,value).getLabel());
        //判断俩个枚举值是否相等
        System.out.println(DictionaryUtils.getDictionaryByKey(YesOrNoEnum.class,value).equalsKey(value));
    }
}
