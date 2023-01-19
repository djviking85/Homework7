public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
         // Продолжите работать с кодом,
        // который вы написали в предыдущем уроке
        // — в задачах с накоплениями.
        //  //С помощью цикла while посчитайте, сколько месяцев потребуется,
        //  чтобы накопить 2_459_000 рублей при условии, что первоначально мы имеем 0 рублей
        //  и готовы откладывать по 15тысяч рублей.
        //
        //Результат программы должен быть выведен в консоль с тем количеством месяцев,
        // которое необходимо для накопления данной суммы. Формат сообщения:
        // «Месяц …, сумма накоплений равна … рублей» .

        int money = 15000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            total = total + money;
            total = total + total / 100;
            System.out.println( "Месяц… " + i + " , сумма накоплений равна " + total + "… рублей");
        }
        System.out.println(i);
        System.out.println(total);
    }

    public static void task2 () {
        System.out.println("Задача 2");
         // Выведите в одну строку через пробел числа от 1 до 10 с помощью цикла while.
        //
        //На следующей строке выведите числа в обратном порядке от 10 до 1 с помощью цикла for.
        //
        //Для обоих циклов можно использовать как одну общую переменную, так и в каждом цикле свою.
        //
        //Не забудьте выполнить переход на новую строку между двумя циклами.
        var number = 1;
        while ( number < 10) {
            number = number + 1;
            System.out.print( " " + number+ " " );
        }
        System.out.println( " ");
        for (var i = 10; i >0; i = i-1) {
            System.out.print(" "+  i + " " );
        }
        System.out.println( " ");
    }
    public static void task3 () {
        System.out.println("Задача 3");
        // Пишем код для задачи 1
    }

    public static void task4 () {
        System.out.println("Задача 4");
        // Пишем код для задачи 2
    }
    public static void task5 () {
        System.out.println("Задача 5");
        // Пишем код для задачи 1
    }

    public static void task6 () {
        System.out.println("Задача 6");
        // Пишем код для задачи 2
    }
    public static void task7 () {
        System.out.println("Задача 7");
        // Пишем код для задачи 1
    }

    public static void task8 () {
        System.out.println("Задача 8");
        // Пишем код для задачи 2
    }
}