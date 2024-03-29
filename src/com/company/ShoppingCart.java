package com.company;

import javax.xml.transform.ErrorListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    boolean finishedShopping = false;
    List<Item> shoppingCart;

    public ShoppingCart() {
        shoppingCart = new ArrayList<>();
        ShoppingList();
        Payment();



    }

    void ShoppingList(){
        while(!finishedShopping){
            System.out.println("Please select the item \n 1 - Mother board \n 2 - CPU \n 3 - HDD \n 4 - Memory");
            try{
                int n = Integer.parseInt(READER.readLine());
                switch (n){
                    case(1):
                        System.out.println("Please select the demand amount");
                        int count = Integer.parseInt(READER.readLine());
                        shoppingCart.add(new MotherBoard(count));
                        break;

                    case(2):
                        System.out.println("Please select the demand amount");
                        int count2 = Integer.parseInt(READER.readLine());
                        shoppingCart.add(new CPU(count2));
                        break;

                    case(3):
                        System.out.println("Please select the demand amount");
                        int count3 = Integer.parseInt(READER.readLine());
                        shoppingCart.add(new HDD(count3));
                        break;

                    case(4):
                        System.out.println("Please select the demand amount");
                        int count4 = Integer.parseInt(READER.readLine());
                        shoppingCart.add(new Memory(count4));
                        break;

                    default:
                        System.out.println("Please input the right value!!!!!!!");
                        continue;
                }
//                Ask if they want to continue shopping
                if(!ContinueShopping()){
                    finishedShopping = true;
                    break;
                }else{
                    continue;
                }

            } catch (NumberFormatException | IOException e){
                System.out.println("Please input the right value");
            }
        }

    }

    boolean ContinueShopping() throws IOException {
            System.out.println("Do you wish to continue shopping? Y/N");
            String selection = READER.readLine();
            switch (selection) {
                case ("Y"):
                    return true;
                case ("N"):
                    return false;

                default:
                    System.out.println("Please select the right value");
                    ContinueShopping();

            }
            return false;
    }

    void Payment(){
        System.out.println("Please select the payment \n1 - Paypal\n2 - Credit Card");
        double totalPrice = 0;
        try{
            int method = Integer.parseInt(READER.readLine());
            for (Item i:shoppingCart
                 ) {
                totalPrice += i.getPrice();
            }

            switch (method){
                case(1):
                    new PayByPalPal().PaymentProcess(totalPrice);

                case(2):
                    new PayByCreditCard().PaymentProcess(totalPrice);
            }
        } catch (NumberFormatException | IOException e ) {
            System.out.println("Please input the right number");
        }

    }



}
