package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.HashMap;
import java.util.Map;

public class PayByPalPal implements PaymentStrategy{
    private static final Map<String, String> DATA_BASE = new HashMap<>();
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private String email;
    private String password;
    private boolean signedIn = false;

    static{
        DATA_BASE.put("duwon98@naver.com","123123123");
        DATA_BASE.put("bruceha9898@gmail.com","989898");
    }

    @Override
    public void PaymentProcess(double a) {
        try{
            while (!signedIn){
                System.out.println("Please enter the email");
                email = READER.readLine();
                System.out.println("PLease enter the password");
                password = READER.readLine();

                if (DATA_BASE.get(email) != null){
                    if(DATA_BASE.get(email).equals(password)){
                        signedIn = true;
                    }else{
                        System.out.println("Please check your password");
                    }
                }else{
                    System.out.println("Please check your email or password");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        pay(a);

    }

    @Override
    public void pay(double a) {
        System.out.println(a + "$ is paid by paypal");
    }
}
