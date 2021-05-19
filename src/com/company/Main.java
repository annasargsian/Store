package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Store store = new Store();
        System.out.println("Input count of workers");
        store.setCountOfWorkers(scanner.nextInt());
        System.out.println("Input name of store");
        store.setName(scanner.next());
        System.out.println("Input product number");
        store.setProductNumber(scanner.nextInt());
        System.out.println("Input phone number");
        store.setPhoneNumber(scanner.next());
        store.sellProduct(store.getProductNumber());

        System.out.println(store.getCountOfWorkers());
        System.out.println(store.getName());
        System.out.println(store.getPhoneNumber());
        System.out.println(store.getProductNumber());
    }
}
