package cn.tech.novelty.interfaces;

/**
 * @author zhanglj
 * @description 枚举字典通用接口
 */
public interface IDictionary {

    /**
     * 获取枚举的Key
     *
     * @return int
     */
    int getKey();

    /**
     * 获取枚举的标签
     *
     * @return {@link String} 标签
     */
    String getLabel();

    /**
     * 判断key是否相等
     *
     * @param key 被判断的key
     * @return boolean 对比结果
     */
    default boolean equalsKey(int key) {
        return this.getKey() == key;
    }
}
