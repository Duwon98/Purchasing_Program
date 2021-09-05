package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PayByCreditCard implements PaymentStrategy {
    private List<Card> cards = new ArrayList<>();
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private int cardNumber;
    private String validDate;
    private int cvv;
    private boolean Valid = false;

    {
        cards.add(new Card(123,"05/28",111));
        cards.add(new Card(111,"11/11",111));

    }

    @Override
    public void PaymentProcess(double a) {
        try{
            while (!Valid){

                try{
                    System.out.println("Please enter the card number");
                    cardNumber = Integer.parseInt(READER.readLine());
                    System.out.println("PLease enter the valid date ex) xx/xx");
                    validDate = READER.readLine();
                    System.out.println("PLease enter the valid CVV");
                    cvv = Integer.parseInt(READER.readLine());

                }catch (NumberFormatException e){
                    System.out.println("Please input the write value");
                    continue;
                }

                for (Card i: cards
                     ) {
                    if(i.getCardNumber() == cardNumber){
                        if(i.getValidDate().equals(validDate)){
                            if(i.getCVV() == cvv){
                                Valid = true;
                                break;
                            }
                            }
                        }
                    }
                if (!Valid){
                    System.out.println("Please check your card detail");
                }
            }

        } catch (NumberFormatException | IOException e) {
            e.printStackTrace();
        }
        pay(a);

    }

    @Override
    public void pay(double a) {
        System.out.println(a + "$ is paid by Credit Card");

    }

}
