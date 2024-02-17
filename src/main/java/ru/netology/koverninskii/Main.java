package ru.netology.koverninskii;

/*Реализуйте ввод информации через консоль для одной транзакции.

В том же проекте, где вы выполняли задание после первого вебинара, создайте переменные для описания транзакции.
Используйте не менее трёх разных типов данных. Самостоятельно определите, какие параметры и типы вы будете использовать.(Type,Data,State,Amount,Fee)
Одним из параметров должна быть дата совершения транзакции.
Создайте объект Scanner для чтения информации.
Последовательно заполните данными ранее созданные переменные.
После ввода всей информации выведите её в консоль одной строкой.
*/

import java.util.Arrays;

import java.util.Scanner;
import java.util.Random;
import java.util.Date;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Хотите сделать перевод?");
        boolean firstAnswer = scanner.nextBoolean();
        if (firstAnswer==true)  {
            System.out.println("Продолжаем...");
        }
        else {
            System.out.println("Спасибо за внимание");
            return;
        }
        System.out.println("Введите сумму перевода: ");
        double transferAmount = scanner.nextDouble();
        double fee = 0.01;
        double transferFee = transferAmount * fee;
        System.out.println("Сумма перевода: " + transferAmount + " , комиссия за перевод: " + transferFee);
        String transferFullAmount = String.valueOf(transferAmount+transferFee);
        System.out.println("Общая сумма за перевод: " + (transferFullAmount) + " , Продолжаем?");
        boolean secondAnswer = scanner.nextBoolean();
        if (secondAnswer==true)  {
            System.out.println("Продолжаем...");
            TransferState newTransfer = TransferState.NEW;
            Date transferDate = new Date();
        }
        else {
            System.out.println("До свидания!");
            return;
        }
        long transferNum = (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;
        TransferState newTransfer = TransferState.CREATED;
        System.out.println("Перевод создан, КНП: " + transferNum);
        System.out.println("Для подтверждения перевода внесите деньги и подтвердите оплату");
        newTransfer = TransferState.PROCESSING;
        System.out.println("Внесите сумму необходимую для перевода(введите): ");
        String thirdAnswer = scanner.next();
        if (thirdAnswer.equals(transferFullAmount)){
            newTransfer = TransferState.PROCESSED;
            System.out.println("Перевод успешен. До новых встреч!");
            System.out.println("Данные перевода:");
            System.out.println("Статус: " + newTransfer.getStatus());
            System.out.println("КНП: " + transferNum);
            System.out.println("Общая сумма перевода: " + transferFullAmount);
        }
        else {
            newTransfer = TransferState.CANCELED;
            System.out.println("Перевод неуспешен. Попробуйте снова");
            System.out.println("Данные перевода:");
            System.out.println("Статус: " + newTransfer.getStatus());
        }






    }
}