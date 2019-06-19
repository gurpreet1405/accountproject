/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounttester1;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class AccountTester1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        double bal;
        String user;
       
        account.Account account1[];
        account1 = new account.Account[500];
        
        System.out.println("Enter the Amount : ");
        
        Scanner obj=new Scanner(System.in);
        bal=obj.nextDouble();
        
         System.out.println("Enter The User Name : ");
         user=obj.nextLine();
        
        account.Account acc;
        acc = new account.Account(bal,user);
        account1[0]=acc;
             
        if(bal>50.00){
            System.out.println("Account is Created!! Congratulation");
            System.out.println("The Last balance Statement is : "+acc.getBalance());  
            System.out.println("The InterestRate per month is "+acc.getInterestRate());
            System.out.println("After Applying The Result The New Balance  Will be -- ");
            System.out.println("The New Final Balance is : "+acc.finalbalance());
        }
        else{
            System.out.println("Account will not be created !! Amount is too Low!!");
        }
    }
}

        // TODO code application logic here
    
    

