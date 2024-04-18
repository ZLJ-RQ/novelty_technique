package cn.tech.novelty.utils;

import cn.tech.novelty.interfaces.IDictionary;
import lombok.SneakyThrows;

import java.lang.reflect.Method;

/**
 * @author zhanglj
 * @description 枚举字典工具类
 */
public class DictionaryUtils {

    /**
     * 查询指定key的枚举字典项目
     *
     * @param enumClass 枚举字典类
     * @param key       枚举字典值
     * @param <D>       [泛型] 当前类型
     * @return 指定的枚举字典
     */
    @SneakyThrows
    public static <D extends IDictionary> D getDictionaryByKey(Class<D> enumClass, int key) {
        Method getKey = enumClass.getMethod("getKey");
        D[] enumConstants = enumClass.getEnumConstants();
        for (D enumConstant : enumConstants) {
            int exitValue = (int) getKey.invoke(enumConstant);
            if (exitValue == key) {
                return enumConstant;
            }
        }
        return null;
    }
}
