/*
        3.3 第三步：实体类的优化 将通话套餐类和上网套餐类中相同的特征和行为提取出来组成抽象套餐类。

*/


public abstract class abstractPackage {
    private int quantity;
    private int expenses;

    public abstractPackage() {}

    public abstractPackage(int quantity, int expenses) {
        setQuantity(quantity);
        setExpenses(expenses);
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

    public abstract void show();
}
