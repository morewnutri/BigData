/*     （4）用户消费信息类 特征：统计通话时长、统计上网流量、每月消费金额

   */


public class consumerInfo {
    private int callDuration;
    private int quantity;
    private int expenses;

    public consumerInfo(){}

    public consumerInfo(int callDuration, int quantity, int expenses) {
        setCallDuration(callDuration);
        setExpenses(expenses);
        setQuantity(quantity);
    }

    public int getCallDuration() {
        return callDuration;
    }

    public void setCallDuration(int callDuration) {
        this.callDuration = callDuration;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getExpenses() {
        return expenses;
    }

    public void setExpenses(int expenses) {
        this.expenses = expenses;
    }
}
