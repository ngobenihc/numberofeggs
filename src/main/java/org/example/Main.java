package org.example;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        double lost5per = 0.05;
        String numberOfEggs;
        int eggsNumber;
        String eggCost;
        double costOfEggs;
        int totalEggsToSell;
        double totalPrice;
        double increaseProfit = 0.25;
        double profit;
        String output;

        numberOfEggs = JOptionPane.showInputDialog("enter the number of eggs you bought to sell ");
        eggCost = JOptionPane.showInputDialog("Enter the amount of ech egg ");

        eggsNumber = Integer.parseInt(numberOfEggs);
        costOfEggs = Double.parseDouble(eggCost);

        totalEggsToSell = eggsNumber -(int)(eggsNumber*lost5per);

        totalPrice = totalEggsToSell*costOfEggs;

        profit = totalPrice + (totalPrice*increaseProfit);

        output =" she bought "+eggsNumber + " number of eggs 5percent broke and had to sell "+totalEggsToSell+" eggs and made "+ totalPrice +" and 25per profit "+ profit;


        JOptionPane.showMessageDialog(null,output);

    }
}