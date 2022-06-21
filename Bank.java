import java.util.*;  
public class Bank 
{  
    String accno;  
    String name;  
    String address;  
    float balance;  
    Scanner sc = new Scanner(System.in);  
    boolean openAccount() 
    {  
        System.out.print("Enter Account No: ");  
        accno = sc.next();   
        System.out.print("Enter Name: ");  
        name = sc.next();  
        System.out.print("Enter Address: ");  
        address = sc.next();  
        System.out.print("Enter Balance: ");  
        balance = sc.nextFloat(); 
        if(balance < 1000)
        	return false;
        return true;
    }   
    void deposit() 
    {  
        float amt;  
        System.out.println("Enter the amount you want to deposit: ");  
        amt = sc.nextLong();  
        balance = balance + amt; 
        System.out.println(amt + " has been deposited successfully in your account.");  
        System.out.println("Updated balance in your account: " + balance);  
    }   
    void withdrawal() 
    {  
        float amt;  
        System.out.println("Enter the amount you want to withdraw: ");  
        amt = sc.nextLong();  
        if (balance - amt > 1000) 
        {  
            balance = balance - amt;  
            System.out.println(amt + " has been withdrawn successfully from your account.");  
            System.out.println("Balance after withdrawal: " + balance);  
        } else 
        {  
            System.out.println("Your need to maintain a minimum balance of 1000. ");
            System.out.println("Transaction failed...!!");  
        }  
    }  
    void showAccount() 
    {  
        System.out.println("Name of account holder: " + name);  
        System.out.println("Account No: " + accno);  
        System.out.println("Address: " + address);  
        System.out.println("Balance: " + balance);  
    }  
}  