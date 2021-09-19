package com.example.coffeeMachine;
import java.util.*;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int water = 400;
        int milk = 540;
        int coffeeBeans = 120;
        int cups = 9;
        int money = 550;
        boolean stop = false;
        while (!stop) {
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            String input = sc.nextLine();
            if(input.equals("buy")) {
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
                String choice = sc.nextLine();
                if (choice.equals("1")) {
                    if ( water >= 250 && coffeeBeans >= 16) {
                        water -= 250;
                        coffeeBeans -= 16;
                        cups -= 1;
                        money += 4;
                        System.out.println("I have enough resources, making you a coffee!");
                    } else {
                        if (water < 250) {
                            System.out.println("Sorry, not enough water!");
                        } else if (coffeeBeans < 16) {
                            System.out.println("Sorry, not enough coffee beans!");
                        }
                    }
                } else if (choice.equals("2")) {
                    if (water >= 350 && milk >= 75 && coffeeBeans >= 20) {
                        water -= 350;
                        milk -= 75;
                        coffeeBeans -= 20;
                        cups -= 1;
                        money += 7;
                        System.out.println("I have enough resources, making you a coffee!");
                    } else {
                        if (water < 350){
                            System.out.println("Sorry, not enough water!");
                        }else if(milk < 75){
                            System.out.println("Sorry, not enough milk!");
                        }else if(coffeeBeans < 20){
                            System.out.println("Sorry, not enough coffee beans!");
                        }
                    }
                } else if (choice.equals("3")) {
                    if (water >= 200 && milk >= 100 && coffeeBeans >= 12) {
                        water -= 200;
                        milk -= 100;
                        coffeeBeans -= 12;
                        cups -= 1;
                        money += 6;
                        System.out.println("I have enough resources, making you a coffee!");
                    } else {
                        if (water < 200){
                            System.out.println("Sorry, not enough water!");
                        }else if(milk < 100){
                            System.out.println("Sorry, not enough milk!");
                        }else if(coffeeBeans < 12){
                            System.out.println("Sorry, not enough coffee beans!");
                        }
                    }
                } else if (choice.equals("back")) {
                    continue;
                }
            } else if(input.equals("fill")) {
                System.out.println("Write how many ml of water you want to add: ");
                water += sc.nextInt();
                System.out.println("Write how many ml of milk you want to add: ");
                milk += sc.nextInt();
                System.out.println("Write how many grams of coffee beans you want to add: ");
                coffeeBeans += sc.nextInt();
                System.out.println("Write how many disposable cups of coffee you want to add: ");
                cups += sc.nextInt();
            } else if(input.equals("take")) {
                System.out.printf("I gave you $%d\n", money);
                money = 0;
            } else if (input.equals("remaining")) {
                System.out.printf("The coffee machine has:\n"
                        + "%d ml of water\n"
                        + "%d ml of milk\n"
                        + "%d g of coffee beans\n"
                        + "%d disposable cups\n"
                        + "$%d of money\n", water, milk, coffeeBeans, cups, money);
            } else if (input.equals("exit")) {
                stop = true;
            }
        }
    }
}
