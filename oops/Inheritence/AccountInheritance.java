class Account {
    private String accountNo;
    private String name;
    private String address;
    private String phone;
    private String dob;

    protected long balance;

    public Account(String accountNo, String name, String address, String phone, String dob){
        this.accountNo = accountNo;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.dob = dob;
    }

    public String getAccountNo() { return this.accountNo; }
    public String getName() { return this.name; }
    public String getPhone() {return this.phone; }
    public String getAddress() {return this.address; }
    public String getDob(){ return this.dob; }

    public long getBalance(){ return this.balance; }

    public void setAddress(String address){
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
}


class SavingsAccount extends Account {
    SavingsAccount(String accountNo, String name, String address, String phone, String dob){
        super(accountNo, name, address, phone, dob);
    }
    public void deposit(long amount){
        balance += amount;
    }
    public void withdraw(long amnt){
        if(amnt >= balance) {
            balance-=amnt;
        }
    }
}

class LoanAccount extends Account{
    LoanAccount(String accountNo, String name, String address, String phone, String dob){
        super(accountNo, name, address, phone, dob);
    }
    public void payEMI(long amount){
        balance-=amount;
    }
    public void repay(long amount){
        if(balance == amount) balance = 0;
    }
}



public class AccountInheritance {
    public static void main(String[] args){
        SavingsAccount s1 = new SavingsAccount("#1001", "Sachin", "Chikmagalur", "8899009900", "14-04-1996");
        LoanAccount l1 = new LoanAccount("#1001", "Sachin", "Chikmagalur", "8899009900", "14-04-1996");
    }
}
