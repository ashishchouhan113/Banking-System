import java.util.*;
public class Main 
{  
    public static void main(String args[]) 
    {  
        Scanner sc = new Scanner(System.in);  
        ArrayList<Bank> al = new ArrayList<Bank>();
        int choice;
        boolean check;
        String ac_no;
        do 
        {  
            System.out.println("\n-----Welcome to our banking system-----");  
            System.out.println(" 1. Open Account ");   
            System.out.println(" 2. Deposit Money ");
            System.out.println(" 3. Withdraw Money ");
            System.out.println(" 4. Check Balance ");
            System.out.println(" 5. Display all account details ");
            System.out.println(" 6. Exit ");
            System.out.println("Enter your choice: ");  
            choice = sc.nextInt();  
                switch (choice) 
                { 
                	case 1:
                		Bank bk = new Bank();
                		boolean flag = bk.openAccount();
                		if(flag)
                		{
                			al.add(bk);
                			System.out.println("Account has been opened successfully.");
                		}
                		else
                		{
                			System.out.println("Account can not be opened.");
                			System.out.println("Account can only be opened with the minimum deposit of 1000.");
                		}
                		break;    
                    case 2:  
                        System.out.print("Enter Account No : ");  
                        ac_no = sc.next();
                        check = false;
                        Iterator i = al.iterator();
                    	while(i.hasNext()) 
                    	{
                    		Bank b = (Bank)i.next();
                    		check = b.accno.equals(ac_no);  
                            if(check) 
                            {  
                                b.deposit();  
                                break;
                            } 
                        }  
                    	if(!check)
                        {
                        	System.out.println("This Account does not exist.");
                        }
                        break;  
                    case 3:  
                    	System.out.print("Enter Account No : ");  
                        ac_no = sc.next();
                        check = false;
                        Iterator it = al.iterator();
                    	while(it.hasNext()) 
                    	{
                    		Bank b = (Bank)it.next();
                    		check = b.accno.equals(ac_no);  
                            if(check) 
                            {  
                                b.withdrawal();
                                break;
                            }  
                        }  
                    	if(!check)
                        {
                        	System.out.println("This Account does not exist.");
                        }
                        break;
                    case 4:  
                    	System.out.print("Enter Account No : ");  
                        ac_no = sc.next(); 
                        check = false;
                        Iterator ite = al.iterator();
                    	while(ite.hasNext()) 
                    	{
                    		Bank b = (Bank)ite.next();
                    		check = b.accno.equals(ac_no);  
                            if(check) 
                            {  
                            	b.showAccount();
                            	break;
                            } 
                        }   
                    	if(!check)
                        {
                        	System.out.println("This Account does not exist.");
                        }
                        break;
                    case 5:  
                    	boolean temp = true;
                    	Iterator itr = al.iterator();
                    	while(itr.hasNext()) {
                    		temp = false;
                    		Bank b = (Bank)itr.next();
                    		b.showAccount();
                    	}
                    	if(temp)
                    	{
                    		System.out.println("No Account exist.");
                    	}
                        break; 
                    case 6:  
                        System.out.println("Thank you for using our banking system.");  
                        break;  
                }  
            }  
            while (choice != 6);  
        }  
    }  