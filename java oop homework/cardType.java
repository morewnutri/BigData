/*
        3.2 第二步：设计和实现以下枚举类 手机卡的类型总共有 3 种：大卡、小卡、微型卡

*/

public enum cardType {
    A("大卡"),B("小卡"),C("微型卡");

    private final String size;

    private cardType(String size){
        this.size = size;
    }

    public String getSize() {
        return size;
    }

}
