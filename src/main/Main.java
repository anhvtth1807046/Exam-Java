package main;

import controller.StudentController;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("-------------MANAGER SCHOOL----------------");
            System.out.println("1.Add new student");
            System.out.println("2.Save");
            System.out.println("3.Display all students");
            System.out.println("4.Exit");
            System.out.println("---------------------------------");
            System.out.println("Please enter your choice from 1 to 5");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1.Add new student");
                    studentController.Add();
                    break;
                case 2:
                    System.out.println("2.Save");
                    studentController.Save();
                    break;
                case 3:
                    System.out.println("3.Display all students");
                    studentController.Display();
                    break;
                case 4:
                    System.out.println("4.Exit");
                default:
                    System.out.println("Lựa chọn sai, vui lòng nhập số trong khoảng từ 1 đến 3.");
                    break;
            }
        }
    }
}
