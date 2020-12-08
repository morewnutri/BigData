/*
        （2）通话套餐类 特征：通话时长、短信条数、每月资费 行为: 显示所有套餐信息

*/

public class callPackage extends abstractPackage implements callInterface {
    private int messages;
   /* private int quantity;
    private int expenses;*/
    consumerInfo code = new consumerInfo();

    public callPackage(){}

    public callPackage(int massages, int quantity, int expenses) {
        /*setQuantity(quantity);
        setExpenses(expenses);*/
        super(expenses,quantity);
        setMessages(massages);
    }

    public int getMessages() {
        return messages;
    }

    public void setMessages(int messages) {
        this.messages = messages;
    }

    /*
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

     */
    @Override
    public void show(){
        System.out.printf("本套餐含通话时长%d, 短信条数%d, 每月资费为%d",getQuantity(),getMessages(),getExpenses()); /*为使用%d，用printf*/
    }
/*
    @Override
    public void callPackage(int callTime,PhoneCard PhoneCard) {
        if (getQuantity() == 0){
            setQuantity(1);
        }
        code.countCallTime(callTime,getQuantity(),phoneCard);
    }*/
}


