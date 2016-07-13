import javax.swing.*;


public class AccountController
{ 
   private BankReader reader;
   
   
   private BankAccount accountA;
   private BankWriter writerA;
   
   
   private BankAccount accountB;
   private BankWriter writerB;
   
  
   private BankAccount account;
   private BankWriter writer;


   public AccountController(BankReader r, BankAccount a1, BankWriter w1,
   BankAccount a2, BankWriter w2)
   { 
      reader = r;
      
      
      accountA = a1;
      writerA = w1;
      account = accountA;
      writer = writerA; 
      
      
      accountB = a2;
      writerB = w2;
      account = accountB;
      writer = writerB;
    
      
   }

   private void resetAccount(BankAccount new_account, BankWriter new_writer)
   { writer.showTransaction("Jo aktive"); 
      account = new_account; 
      writer = new_writer;
      writer.showTransaction("Aktive");
   }



   public void processTransactions1()
   {account = accountA;
      writer = writerA;
    char command = reader.readCommand("Komandat (D,T,M):");
      if ( command == 'M' ) 
      { }
      else { 
         if ( command == 'D' ) 
         { int amount = reader.readAmount();
            account.deposit(amount);
            writer.showTransaction("Depozim prej $", amount);
         }
         else if ( command == 'T' ) 
         { int amount = reader.readAmount();
            boolean ok = account.withdraw(amount);
            if ( ok )
            { writer.showTransaction("Terheqje prej $", amount); }
            else { writer.showTransaction("Terheqje e pa pranueshme", amount); }
         }
       else { writer.showTransaction("Gabim ne shtypjen e komandes"); }
       this.processTransactions1(); 
      }
   }
   
      public void processTransactions2()
   {account = accountB;
      writer = writerB; 
   char command = reader.readCommand("Komandat (D,T,M):");
      if ( command == 'M' ) 
      { }
      else { 
         if ( command == 'D' ) 
         { int amount = reader.readAmount();
            account.deposit(amount);
            writer.showTransaction("Depozim prej $", amount);
         }
         else if ( command == 'T' ) 
         { int amount = reader.readAmount();
            boolean ok = account.withdraw(amount);
            if ( ok )
            { writer.showTransaction("Terheqje prej $", amount); }
            else { writer.showTransaction("Terheqje e pa pranueshme", amount); }
         }
       else { writer.showTransaction("Gabim ne shtypjen e komandes"); }
       this.processTransactions2(); 
      }
   }
      public void processTransactions3()
   { char command = reader.readCommand("Komandat (A,B, D,T,M):");
      if ( command == 'M' ) 
      { }
      else { 
         if ( command == 'D' ) 
         { int amount = reader.readAmount();
            account.deposit(amount);
            writer.showTransaction("Depozim prej $", amount);
         }
         else if ( command == 'T' ) 
         { int amount = reader.readAmount();
            boolean ok = account.withdraw(amount);
            if ( ok )
            { writer.showTransaction("Terheqje prej $", amount); }
            else { writer.showTransaction("Terheqje e papranueshme", amount); }
         }
         else if ( command == 'A' ) 
         { resetAccount(accountA, writerA); }
         else if ( command == 'B' ) 
         { resetAccount(accountB, writerB); }
         else { writer.showTransaction("Gabim ne shtypjen e komandes"); }
         this.processTransactions3(); 
      }
   }

}