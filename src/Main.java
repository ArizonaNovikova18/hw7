public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int beginning = 0;
        int month = 15000;
        int time = 1;
        while (beginning <= 2_459_000) {
            System.out.println("Месяц " + time + " сумма накоплений равна " + beginning + " рублей");
            beginning = beginning + month;
            time++;
        }

        System.out.println();
        System.out.println("Задание 2");
        int start = 1;
        while (start <= 10) {
            System.out.print(start + " ");
            start = start + 1;
        }
        System.out.println();

        for (int s = 10; s >= 1; s--) {
            System.out.print(s + " ");
        }


        System.out.println();
        System.out.println("Задание 3");
        int total = 12_000_000;
        int birthRate = 17;
        int mortalityRate = 8;
        int cyrrentYear = 2024;
        for (int year = cyrrentYear + 1; year <= cyrrentYear + 10; year++) {
            total += (birthRate - mortalityRate) * total / 1000;
            System.out.println("год " + year + " численность населения " + total);
        }
        System.out.println();
        System.out.println("Задание 4");
        double percent = 7 / 1000D;
        int deposit = 15000;
        int sum = 0;
        sum = deposit;
        month = 0;
        while (sum < 12_000_000) {
            month++;
            sum += sum * percent;
            System.out.println("Месяц " + month + " сумма накоплений равна " + sum + " рублей");
        }

        System.out.println();
        System.out.println("Задание 5");
        sum = deposit;
        month = 0;
        while (sum < 12_000_000) {
            month++;
            sum += sum * percent;
            if (month % 6 == 0) ;
            {
                System.out.println("Месяц " + month + " сумма накоплений равна " + sum + " рублей");
            }

        }
        System.out.println();
        System.out.println("Задание 6");
        sum = deposit;
        month = 0;
        int months = 9 * 12;
        while (month < months) {
            month++;
            sum += sum * percent;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма накоплений равна " + sum + " рублей");
            }
        }

        System.out.println();
        System.out.println("Задание 7");
        int firstFriday = 2;
        for (int friday = firstFriday; friday <= 31; friday += 7) {
            System.out.println("Сегодня пятница," + friday + "-е число. Необходимо подготовить отчет");
        }

        System.out.println();
        System.out.println("Задание 8");
        start = 0;
        int interval = 79;
        int yearNow = 2024;
        int yearLast = yearNow - 200;
        int yearWill = yearNow + 100;
        for (int year = yearLast; year <= yearWill; year++) {
            if (year % interval == 0) {
                System.out.println(year);
            }
        }
    }
}

