/*3. 按照要求设计并实现以下实体类和接口。
        3.1 第一步：设计和实现以下类
        （1）手机卡类 特征：卡类型、卡号、用户名、密码、账户余额、通话时长(分钟)、上网流量 行为：显示（卡号 + 用户名 + 当前余额）
*/

public class phoneCard {
    private String cardType;
    private String phoneNumber;
    private String name;
    private String password;
    private int accountBalance;
    private int callTime;
    private int internetTraffic;

    callPackage callPackage = new callPackage();
    internetService internetPackage = new internetService();
    /*为什么要创建对象*/

    public phoneCard(){}

    public phoneCard(String cardType, String phoneNumber, String name, String password, int accountBalance, int callTime, int internetTraffic) {
        setCardType(cardType);
        setPhoneNumber(phoneNumber);
        setName(name);
        setPassword(password);
        setAccountBalance(accountBalance);
        setCallTime(callTime);
        setInternetTraffic(internetTraffic);
    }

    public String getCardType() {
        return cardType;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public int getCallTime() {
        return callTime;
    }

    public int getInternetTraffic() {
        return internetTraffic;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCallTime(int callTime) {
        this.callTime = callTime;
    }

    public void setInternetTraffic(int internetTraffic) {
        this.internetTraffic = internetTraffic;
    }

    public void showAccountBalance(){
        System.out.println("card number:"+getPhoneNumber()+"name"+getName()+"balance"+getAccountBalance());
    }

    //  通话消费
    public void addCall(int a,phoneCard phoneCard){
        callPackage.callPackage(a,phoneCard);
    }
    //  流量消费
    public void addInternet(int a,phoneCard phoneCard){
        internetService.internetService(a,phoneCard);
    }
}
