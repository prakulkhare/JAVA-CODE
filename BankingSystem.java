import java.util.*;
class BankAccount{
    String AccountHolderName;
    int AccountNumber;
    double Balance;
    Scanner obj = new Scanner(System.in);
    BankAccount(String AccountHolderName,int AccountNumber,double Balance){
        this.AccountHolderName = AccountHolderName;
        this.AccountNumber = AccountNumber;
        this.Balance =  Balance;
    }
    void DepositMoney(){
        System.out.println("Account Holder's Name : "+AccountHolderName);
        System.out.println("Account Number : "+AccountNumber);
        System.out.println("Balance : "+Balance);
        System.out.println("Enter the amount to deposit: ");
        int Deposit = obj.nextInt(); 
        Balance += Deposit;
        System.out.println("Updated Balance: "+Balance);
    }
    void WithdrawMoney(){
        System.out.println("Account Number :"+ AccountNumber);
        System.out.println("Enter the amount to withdraw:");
        int Withdraw = obj.nextInt();
        if(Balance > Withdraw){
            System.out.println("Money Withdrawn Successfully...");
        }
        else{
            System.out.println("Money Withdraw failed");
            return;
        }
        Balance -= Withdraw;
        System.out.println("Updated Balance: "+Balance);         
    }
    void Balance(){
        System.out.println("Account Holder's Name : "+AccountHolderName);
        System.out.println("Account Number : "+AccountNumber);
        System.out.println("Balance : "+Balance);
    }
}
public class pq8{
        public static void main(String[] args){
            BankAccount acc = new BankAccount("John Wick",55555,50000);
            acc.DepositMoney();
            acc.WithdrawMoney();
            acc.Balance();
        }
    }import java.util.*;
class BankAccount{
    String AccountHolderName;
    int AccountNumber;
    double Balance;
    Scanner obj = new Scanner(System.in);
    BankAccount(String AccountHolderName,int AccountNumber,double Balance){
        this.AccountHolderName = AccountHolderName;
        this.AccountNumber = AccountNumber;
        this.Balance =  Balance;
    }
    void DepositMoney(){
        System.out.println("Account Holder's Name : "+AccountHolderName);
        System.out.println("Account Number : "+AccountNumber);
        System.out.println("Balance : "+Balance);
        System.out.println("Enter the amount to deposit: ");
        int Deposit = obj.nextInt(); 
        Balance += Deposit;
        System.out.println("Updated Balance: "+Balance);
    }
    void WithdrawMoney(){
        System.out.println("Account Number :"+ AccountNumber);
        System.out.println("Enter the amount to withdraw:");
        int Withdraw = obj.nextInt();
        if(Balance > Withdraw){
            System.out.println("Money Withdrawn Successfully...");
        }
        else{
            System.out.println("Money Withdraw failed");
            return;
        }
        Balance -= Withdraw;
        System.out.println("Updated Balance: "+Balance);         
    }
    void Balance(){
        System.out.println("Account Holder's Name : "+AccountHolderName);
        System.out.println("Account Number : "+AccountNumber);
        System.out.println("Balance : "+Balance);
    }
}
public class pq8{
        public static void main(String[] args){
            BankAccount acc = new BankAccount("John Wick",55555,50000);
            acc.DepositMoney();
            acc.WithdrawMoney();
            acc.Balance();
        }
    }
