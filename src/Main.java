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
        // В стране Y население равно 12 миллионов человек.
        //
        //Рождаемость составляет 17 человек на 1000,
        // смертность— 8 человек.
        // Рассчитайте, какая численность населения будет через 10 лет,
        // если показатели рождаемости и смертности постоянны.
        //
        //В консоль выведите результат операции на каждый год в
        // формате: «Год …, численность населения составляет …».
        var born = 17;
        var capacity = 12_000_000;
        var death = 8;
        var sredniiPrirost = ((born-death)*capacity) / 1000;
        System.out.println( "средний прирост в год составит " + sredniiPrirost + " Человечишек ");

        var year = 1;
        for (year =1; year <=10; year = year +1 ) {
            capacity = sredniiPrirost + capacity;
            System.out.println(" Год " + year+ " и численность населения составит " + capacity);


        }

    }

    public static void task4 () {
        System.out.println("Задача 4");
        // Василий решил положить деньги на накопительный счет, где каждый месяц
        // к сумме его вклада добавляется еще 7%. Первоначальная сумма вклада— 15 тысяч рублей.
        //
        //Вычислите и выведите в консоль, сколько месяцев
        // Василию нужно будет копить, чтобы собрать сумму в 12 миллионов рублей при условии,
        // что процент банка от накоплений неменяется, а всегда равен 7%.
        //
        //Выведите в консоль результат программы с указанием суммы накоплений по каждому месяцу.
        double  startMoney = 15000;
        var vklad = 0.07;
        var moneyVklad = (vklad*startMoney)+startMoney;
        var mounth = 1;
        System.out.println( moneyVklad);
        for (startMoney = 15000; startMoney < 12_000_000; mounth ++) {
            startMoney = startMoney+startMoney*vklad;

            System.out.println(" за месяц " + mounth+ " он накопил " + startMoney);
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        // Видоизмените программу таким образом, чтобы в консоль выводились
        // не все месяцы подряд, а только каждый шестой.
        // Должны быть видны накопления за 6, 12, 18, 24-й иследующие месяцы.
        double  startMoney = 15000;
        var vklad = 0.07;
        var moneyVklad = (vklad*startMoney)+startMoney;
        var mounth = 1;
        System.out.println( moneyVklad);
        for (startMoney = 15000; startMoney < 12_000_000; mounth ++) {
            startMoney = startMoney+startMoney*vklad;
            if ( mounth % 6 == 0) {

            System.out.println(" за месяц " + mounth + " он накопил " + startMoney);}}
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