import javax.swing.*;
public class Dekodimi
{ 
   public static void main(String[] args)
   { int[] kodi = new int[27]; // kjo �sht� tabela e p�rkthimit
   // kodi[0] e mban kodin p�r ' ',
   // kodi[1] e mban kodin p�r 'a',
   // kodi[2] e mban kodin p�r 'b', etj.
      int k = new Integer(JOptionPane.showInputDialog
         ("Shkruaje am�n (num�r i plot�): ")).intValue();
      kodi[0] = k;
      for ( int i = 1; i != kodi.length; i = i+1 )
      { kodi[i] = (int)((kodi[i-1] * 1.3) + 1); } //tjeter sistem i kodimit
      String pergjigjja = "";
      boolean duke_perpunuar = true;
      while ( duke_perpunuar )
      { String hyrja = JOptionPane.showInputDialog
            ("Shkruaje nj� num�r t� plot� p�r ta dekoduar" +
            "(ose asgj�, p�r t� p�rfunduar): ");
         if ( hyrja.equals("") )
         { duke_perpunuar = false; }
         else { char c = dekodo(kodi, new Integer(hyrja).intValue());
            pergjigjja = pergjigjja + c;
         }
      }
      System.out.println(pergjigjja);
   }
/** dekodo e p�rkthen nj� kod (num�r i plot�) n� karakter
* @param kodi - vargu q� i mban kodet p�r ' ', 'a', 'b', ..., 'z'
* @param i - numri i plot� q� do t� dekodohet
* @return (kthen) karakterin p�rkat�s, ose '*' n�se numri nuk dekodohet */
   private static char dekodo(int[] kodi, int i)
   { char c = '*';
      boolean u_gjet = false;
      int indeksi = 0;
      while ( !u_gjet && indeksi != kodi.length )
      { 
         if ( kodi[indeksi] == i )
         { u_gjet = true;
            if ( indeksi == 0 )
            { c = ' '; }
            else { c = (char)(indeksi + 'a' - 1); }
         }
         else { indeksi = indeksi + 1; }
      }
      return c;
   }
}