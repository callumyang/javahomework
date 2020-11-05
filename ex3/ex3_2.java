class Account {
    private int id = 0;
    private double balance = 0.0;
    private double annualInterestRate = 0.0;
    private java.util.Date dateCreated;
    public Account(){
        dateCreated =  new java.util.Date();
    }
    public Account(int id,double balance){
        this.id = id;
        this.balance = balance;
        dateCreated =  new java.util.Date();
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }
    public java.util.Date getDateCreated(){
        return dateCreated;
    }
    public double getMonthlyInterestRate(){
        return annualInterestRate / 12;
    }
    public void withDraw(double money) throws Exception{
        if(money > balance){
            throw new Exception("余额不足");
        }
        else{
            balance -= money;
        }
    }
    public void deposit(double money){
        balance += money;
    }
}
public class ex3_2{
    public static void main(String[] args) throws Exception{
        Account account = new Account(1122,20000);
        account.setAnnualInterestRate(0.045);
        account.withDraw(2500);
        account.deposit(3000);
        System.out.printf("余额为：%f\n月利息为：%f\n开户日期为：%s\n",account.getBalance(),account.getBalance()*account.getMonthlyInterestRate(),account.getDateCreated());
    }
}
