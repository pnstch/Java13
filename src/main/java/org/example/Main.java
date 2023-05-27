package org.example;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner commandScanner = new Scanner(System.in);
        String command = "";

        while (!command.equals("0")) {

            if (command.equals("1")) {
                create();
            } else if (command.equals("2")) {
                getCar();
            }

            printMenu();
            command = commandScanner.nextLine();
        }
    }

    private static void create() {

        Car car = new Car();

        Scanner numberScanner = new Scanner(System.in);
        System.out.println("Введите номер автомобиля.");
        String number = numberScanner.nextLine();

        car.setNumber(number);

        car.setDate(new Date());

        CarDao carDao = new CarDao();
        carDao.create(car);
    }

    private static void getCar() {
        Scanner idScanner = new Scanner(System.in);
        System.out.println("Введите ID события проезда автомобиля: ");
        int id = idScanner.nextInt();

        CarDao carDao = new CarDao();

        System.out.println(carDao.getCar(id));
    }

    private static void printMenu() {
        System.out.println("Введите команду:");
        System.out.println("1) Добавить событие проезда автомобиля.");
        System.out.println("2) Получить данные о проезде автомобиля.");
        System.out.println("0) Выход.");
    }
}