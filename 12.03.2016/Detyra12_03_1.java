import javax.swing.*;
public class Detyra12_03_1

{ 
   public static void main(String[] args )
   {  int i =new Integer(JOptionPane.showInputDialog("Shkruaj numrin e pikeve")).intValue();
      switch (i)
      { 
         case 100: case 99: case 98: case 97: case 96: case 95: case 94: case 93: case 92: case 91: case 90:
            {System.out.println("Nota A");
               break;}
         case 89: case 88: case 87: case 86: case 85: case 84: case 83: case 82: case 81: case 80: 
            {System.out.println("Nota B");
               break;}
         case 79: case 78: case 77: case 76: case 75: case 74: case 73: case 72: case 71: case 70:
            {System.out.println("Nota C");
               break;}
         case 69: case 68: case 67: case 66: case 65: case 64: case 63: case 62: case 61: case 60:
            {System.out.println("Nota D");
               break;}
         case 59: case 58: case 57: case 56: case 55: case 54: case 53: case 52: case 51: case 50:
            {System.out.println("Nota E");
               break;}
         
         default: 
            {System.out.println("Nuk keni kaluar");}
      }}}