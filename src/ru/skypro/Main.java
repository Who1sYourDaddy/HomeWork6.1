package ru.skypro;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        System.out.println("     TaskOne - just check code");
        int[] massiveOne = new int[3];
        massiveOne[0] = 1;
        massiveOne[1] = 2;
        massiveOne[2] = 3;

        // System.out.println(massiveOne); - при запросе такой команды выводит "[I@eed1f14". Немного не ясно, я ведь присвоил этой переменной массив и задал значения индексам.
        float[] massiveTwo = new float[]{1.57f, 7.654f, 9.986f};

        double[] massiveThree = new double[4];
        massiveThree [0] = 0.323;
        massiveThree [1] = 3.32154;
        massiveThree [2] = 1.1234;
        massiveThree [3] = -7.5432;
        System.out.println("     TaskTwo");

        System.out.println( massiveOne[0] + "," + massiveOne[1] + "," + massiveOne[2]);
        System.out.println( massiveTwo[0] + "," + massiveTwo[1] + "," + massiveTwo[2]);
        System.out.print(massiveThree[0] + "," + massiveThree[1] + "," + massiveThree[2] + "," + massiveThree[3]);
        System.out.println("");
        // Объясните пожалуйста,как вывести следующее сообщение с новой строки после System.out.print() не используя дополнитлеьно System.out.println("") ?

        System.out.println("     TaskThree");
        System.out.println( massiveOne[2] + "," + massiveOne[1] + "," + massiveOne[0]);
        System.out.println( massiveTwo[2] + "," + massiveTwo[1] + "," + massiveTwo[0]);
        System.out.println(massiveThree[3] + "," + massiveThree[2] + "," + massiveThree[1] + "," + massiveThree[0]);

        System.out.println("     TaskFour");

        for (int i = 0; i < massiveOne.length; i++)
        {
            if (i != massiveOne.length -1 ) {
                   System.out.print(massiveOne[i] + ", ");
            }else{
            System.out.println(massiveOne[i]);
            }
        }
        // возможно я тупой, но решить это задание я не могу, когнитивные способности отваливаются.
        // 1) задал цикл для диапазона i=0 до любого последнего значения в ячейке массива massiveOne.length - я так понимаю, это правильно.
        // 2) но какую операцию потом делать - не понимаю. Добавил я +1 к каждому i или убавил...Или поделил с остатком или без...Не знаю что делать
        // 3) я перерисовал остальную часть решения с разбора дз, но это решение не работает. И его логика мне тоже не ясна, прошу по возможности пояснить.
    }

}
