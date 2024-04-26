# Study
学习新颖的技术,思想,架构等。。。。。
##1 枚举字典工具类
抽象枚举字典接口
通过反射获取枚举类,实现多个枚举类通用的getEnumByKey方法
涉及:DictionaryClient IDictionary YesOrNoEnum DictionaryUtils
##2 策略模式
策略模式三要素:抽象策略类,策略接口,策略控制类
涉及:cn/tech/novelty/discount
## 3 策略枚举+工厂模式
传入type获得策略枚举,通过工厂模式创建策略对象
涉及:DiscountFactory DiscountEnum
## 场景解决
# 1.十亿用户数据中查询用户名是否存在
数量少的时候可以通过DB Or Redis进行判断
但数据量大的时候使用布隆过滤器+DB双重判断
布隆过滤器对存在有一定的误判率,但是不存在一定不存在,所以如果存在,则去DB判断,这样可以减少大量的请求走到DB