package com.company;

import java.util.Scanner;

public class Store {
    private int countOfWorkers;
    private String name;
    private String phoneNumber;
    private int productNumber;
    Scanner scanner = new Scanner(System.in);

    public void sellProduct(int productNumber){
        if(productNumber > 0) {
            productNumber = productNumber - 1;
        }
        System.out.println(productNumber);
    }

    public int getCountOfWorkers() {
        return countOfWorkers;
    }

    public void setCountOfWorkers(int countOfWorkers) {
        if ( countOfWorkers >= 2 && countOfWorkers <= 50){
            this.countOfWorkers = countOfWorkers;
        } else {
            System.out.println("countOfWorkers must be in range 2 - 50");
            setCountOfWorkers(scanner.nextInt());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() >= 3) {
            this.name = name;
        } else {
            System.out.println("name must have at least 3 characters");
            setName(scanner.next());
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        int countDigits = 0;
        for (int i = 0; i < phoneNumber.length(); i++) {
            char result = phoneNumber.charAt(i);
            int ascii = (int) result;
            if (ascii >= 48 && ascii <= 57) {
                countDigits++;
            }
        }
        if (countDigits == 8) {
            this.phoneNumber = phoneNumber;
        } else {
            System.out.println("phoneNumber must have 8 digits");
            setPhoneNumber(scanner.next());
        }
    }

    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }
}
