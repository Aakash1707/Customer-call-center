package com.callcenter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CallCenter center = new CallCenter();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Call Center Menu ===");
            System.out.println("1. Receive New Call");
            System.out.println("2. Handle Next Call");
            System.out.println("3. Show Pending Calls");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter Caller Name: ");
                    String name = sc.nextLine();
                    System.out.print("Priority (1=VIP, 2=Regular): ");
                    int priority = sc.nextInt();
                    center.receiveCall(name, priority);
                    break;
                case 2:
                    center.handleNextCall();
                    break;
                case 3:
                    center.showPendingCalls();
                    break;
                case 4:
                    System.out.println("👋 Exiting system...");
                    break;
                default:
                    System.out.println("❌ Invalid choice.");
            }
        } while (choice != 4);

        sc.close();
    }
}
