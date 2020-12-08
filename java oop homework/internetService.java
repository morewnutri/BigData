     /*
        （3）上网套餐类 特征：上网流量、每月资费 行为：显示所有套餐信息

     */

public class internetService extends abstractPackage implements internetInterface {
    private int quantity;
    private int expenses;

    consumerInfo code = new consumerInfo();

    public internetService(){}

    public internetService(int quantity, int expenses) {
        super(quantity,expenses);
    }

   /* public int getQuantity() {
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
        System.out.printf("本套餐包含流量%d，每月资费%d",getQuantity(),getExpenses());
    }

    @Override
    public void internetService(int internetTraffic, PhoneCard PhoneCard) {
        if(getExpenses() == 0){
            setExpenses(1);
        }
        code.countInternetTraffic(internetTraffic,getExpenses(),PhoneCard);
    }
}
