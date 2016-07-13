import javax.swing.*;
public class AccountManager
{  
   public static void main(String[] args)
   { BankReader reader = new BankReader();
   
      BankAccount accountA = new BankAccount(0);
      
      BankWriter writerA= new BankWriter("Klienti A", accountA,400);
   
      BankAccount accountB = new BankAccount(0);
   
      BankWriter writerB= new BankWriter("Klienti b", accountB,1000);
         
      AccountController controller = new AccountController(reader, accountA,  writerA, accountB,  writerB);
   
   
   
      String a = JOptionPane.showInputDialog("Choose the account (A,B,BT):");
      a=a.trim().toUpperCase();
      if(a.equals("A"))
      {writerA.frame();controller.processTransactions1();}
      else if(a.equals("B"))
       {writerB.frame();controller.processTransactions2();}
       else if(a.equals("BT"))
       {writerA.frame();writerB.frame();controller.processTransactions3();}
       else {JOptionPane.showMessageDialog(null,"Error"); 
}
}}