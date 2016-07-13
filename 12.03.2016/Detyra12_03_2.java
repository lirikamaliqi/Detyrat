import javax.swing.*;
public class Detyra12_03_2
{
   public static void main(String[] args)
   { int viti=new Integer(JOptionPane.showInputDialog("Shkruaj vitin")).intValue();
      
      
       if ((viti % 4 == 0) && viti % 100 != 0){JOptionPane.showMessageDialog(null,"Viti "+viti+" eshte vit i brishte");}else
      if ((viti % 4 == 0) && (viti % 100 == 0) && (viti % 400 == 0))
      {JOptionPane.showMessageDialog(null,"Viti "+viti+" eshte vit i brishte");}
      else 
      {JOptionPane.showMessageDialog(null,"Viti "+viti+" nuk eshte vit i brishte");}
   }}