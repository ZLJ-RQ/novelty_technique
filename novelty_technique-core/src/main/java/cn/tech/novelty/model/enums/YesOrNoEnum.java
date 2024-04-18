package cn.tech.novelty.model.enums;

import cn.tech.novelty.interfaces.IDictionary;

/**
 * @author zhanglj
 * @description YesOrNoEnum
 */
public enum YesOrNoEnum implements IDictionary {
    YES(1, "是"),
    NO(0, "否");

    private final int key;

    private final String label;


    YesOrNoEnum(int key, String label) {
        this.key = key;
        this.label = label;
    }

    @Override
    public int getKey() {
        return this.key;
    }

    @Override
    public String getLabel() {
        return this.label;
    }
}
