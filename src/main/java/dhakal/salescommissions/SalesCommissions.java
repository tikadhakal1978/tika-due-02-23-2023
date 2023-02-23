/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package dhakal.salescommissions;

/**
 *
 * @author tikad
 */
import java.util.Scanner;
public class SalesCommissions {

    public static void main(String[] args) {
        int[]salaryCounters = new int [9];
        double commissionRate = 0.09;
        int baseSalary =200;
        Scanner input = new Scanner (System.in);
        
        System.out.print("Enter number of salepeople:");
        
        int numSalespeople = input.nextInt();
        for (int i = 0; i < numSalespeople; i++)
        {  System.out.printf("Enter gross sales for saleperson %d: $",i +1);
          int grossSales = input.nextInt();
          double commission = commissionRate*grossSales;
          int salary = baseSalary + (int)commission;
          if (salary >= 1000){
              
              salaryCounters [8]++;
              
          }
          else{
              salaryCounters [(salary -200 )/ 100]++;
              
          }
       
    }

System.out.println("Salary Range\tNumber of Salespeople");

for (int i =0; i<9; i++){
    String salaryRange = " ";
    if (i == 0){
        
        salaryRange= "$200-$299";
    }
    else if (i == 1){
        salaryRange= "$300-$399";
    }
    else if (i == 2){
        salaryRange= "$400-$499";
    }
 else if (i == 3){
        salaryRange= "$500-$599";
    }

 else if (i == 4){
        salaryRange= "$600-$699";
    }
 else if (i == 5){
        salaryRange= "$700-$799";
    }
 else if (i == 6){
        salaryRange= "$800-$899";
    }
 else if (i == 7){
        salaryRange= "$900-$999";
    }

 else if (i == 8){
        salaryRange= "$1000 and over";
    }
System.out.printf("%-15s\t%d\n",salaryRange, salaryCounters [i]);
}

}

        }
