package model;

import java.math.BigDecimal;
import java.util.Scanner;

import main.ATM;

public class Keypad {
   private final Scanner sc = new Scanner(System.in);
   private final ATM atm = null;

   public String takeInput() {

      String enteredPIN = "";

      do {
         enteredPIN = sc.nextLine().trim();
      } while (enteredPIN.isBlank());

      return enteredPIN;
   }

   public String TakeTransactionInput() {
      String inpuString = "";
      do{
         inpuString = sc.next();
      }while(inpuString.isBlank());
      return inpuString;
   }

   public BigDecimal takeAmountInput() {
      while (true) {
         String input = sc.nextLine().trim();

         if (input.isEmpty()) {
            continue;
         }

         try {
            return new BigDecimal(input);
         } catch (NumberFormatException e) {
            atm.getScreen().DisplayInvalidAmountEnterMessage();
         }
      }
   }

}
