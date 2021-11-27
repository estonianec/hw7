package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task4();
//        task4second();
//        task4third();
//        task5BeforeSpoiler();
//        task5AfterSpoiler();
//        task6();
//        task7();
        task8();
    }

    public static void task1() {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivonov";
        String fullName = lastName + ' ' + firstName + ' ' + middleName;
        System.out.println("ФИО сотрудника — " + fullName);

    }

    public static void task2() {
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println("Данные ФИО сотрудника для административного отдела — " + fullName.toUpperCase());
    }

    public static void task3() {
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println("Данные ФИО сотрудника для административного отдела — " + fullName.replace(' ', ';'));
    }
    public static void task4() {
        String fullName = "Иванов Семён Семёнович";
        System.out.println("Данные ФИО сотрудника — " + fullName.replace('ё', 'е'));
    }

    public static void task4second() {
        String fullName = "Иванов Семён Семёнович";
        char[] fullNameArray = fullName.toCharArray();
        System.out.print("Данные ФИО сотрудника — ");
        for (int i = 0; i < fullNameArray.length; i++) {
            if (fullNameArray[i] == 'ё') {
                fullNameArray[i] = 'е';
            }
            System.out.print(fullNameArray[i]);
        }

    }

    public static void task4third() {
        String fullName = "Иванов Семён Семёнович";
        String[] fullNameArray = fullName.split(" ");
        System.out.print("Данные ФИО сотрудника — ");
        for (int i = 0; i < fullNameArray.length; i++) {
            if (fullNameArray[i].contains("ё")) {
                fullNameArray[i] = fullNameArray[i].replace("ё", "е");
            }
            System.out.print(fullNameArray[i]);
            if (i < fullNameArray.length - 1) {
                System.out.print(" ");
            }
        }
    }

    public static void task5BeforeSpoiler() {
//        Изначально проще конечно было сделать через метод split(), но в условии задачи требование делать через substring(), поэтому, не открывая подсказку, решил сделать так:
        String fullName = "Ivanov Ivan Ivanovich";
        int counterLastName = 0;
        String lastName;
        char[] fullNameArray = fullName.toCharArray();
        for (; counterLastName < fullNameArray.length; counterLastName++) {
            if (fullNameArray[counterLastName] == ' ') {
                break;
            }
        }
        lastName = fullName.substring(0, counterLastName); // почему эту строку не получается поместить в условие в цикле между строками 79-80? Выдает ошибку, что переменная не инициализирована.
        counterLastName += 1;
        int counterFirstName = counterLastName;
        for (; counterFirstName < fullNameArray.length; counterFirstName++) {
            if (fullNameArray[counterFirstName] == ' ') {
                break;
            }
        }
        String firstName = fullName.substring(counterLastName, counterFirstName);
        counterFirstName += 1;
        int counterMiddleName = counterFirstName;
        for (; counterMiddleName < fullNameArray.length; counterMiddleName++) {
            if (fullNameArray[counterMiddleName] == ' ') {
                break;
            }
        }
        String middleName = fullName.substring(counterFirstName, counterMiddleName);


        System.out.println("Имя сотрудника — " + firstName);
        System.out.println("Фамилия сотрудника — " + lastName);
        System.out.println("Отчество сотрудника — " + middleName);
    }

    public static void task5AfterSpoiler() {
        String fullName = "Ivanov Ivan Ivanovich";
        String lastName = fullName.substring(0, fullName.indexOf(' '));
        String firstName = fullName.substring(fullName.indexOf(' ') + 1, fullName.lastIndexOf(' '));
        String middleName = fullName.substring(fullName.lastIndexOf(' ') + 1, fullName.length());
        System.out.println("Имя сотрудника — " + firstName);
        System.out.println("Фамилия сотрудника — " + lastName);
        System.out.println("Отчество сотрудника — " + middleName);
    }

    public static void task6() {
        String fullName = "ivanov ivan ivanovich";
        char[] fullNameArray = fullName.toCharArray();
        fullNameArray[0] = Character.toUpperCase(fullNameArray[0]); // Пришлось обратиться к подсказке, потому как Character мы вообще не изучали. Я до сих пор не понимаю, что это.
        for (int i = 0; i < fullNameArray.length; i++) {
            if (fullNameArray[i] == ' ') {
                fullNameArray[i + 1] = Character.toUpperCase(fullNameArray[i + 1]);
            }
        }
        System.out.print("Верное написание Ф.И.О. сотрудника с заглавных букв — "); // наткнулся на интересный эффект, если записать массив fullNameArray в этот sout выдаст его адрес в памяти (на сколько я понял). Почему так происходит?
        System.out.print(fullNameArray);
    }

    public static void task7() {
        String first = "135";
        String second = "246";
        StringBuilder sb = new StringBuilder();
        char[] firstArray = first.toCharArray();
        char[] secondArray = second.toCharArray();
        for (int i = 0; i < firstArray.length; i++) {
            sb.append(firstArray[i]);
            sb.append(secondArray[i]);
        }
        String result = sb.toString();
        System.out.println("Данные строки — " + result);
    }

    public static void task8() {
        String alp = "aabccddefgghiijjkk";
        char[] alpArray = alp.toCharArray();
        for (int i = 0; i < alpArray.length - 1; i++) {
            if (alpArray[i] == alpArray[i + 1]) {
                System.out.print(alpArray[i]);
            }
        }
    }
}

