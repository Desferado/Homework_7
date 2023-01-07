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
        public static void task1() {
            System.out.println("Задание №1");
            int salary = 15000;
            int deposite = 0;
            int month = 0;
            while (deposite < 2459000) {
                //deposite = deposite + deposite/100;
                deposite = deposite + salary;
                month++;
                System.out.println("Месяц " + month + " Сумма накоплений равна " + deposite + " рублей.");
            }
            System.out.println("Для накопления 2459000 рублей потребуется  " + month + " месяцев(месяца)." + " Или " +
                    (month/12) + " лет (года) и " + (month%12) + " месяцев (месяца).");
            System.out.println();
        }
        public static void task2() {
            System.out.println("Задание №2");
            int number = 0;
            while (number <= 10) {
                System.out.print(number++ + " ");

            }
            System.out.println();
            for (number = number-1; number >= 0; number--) {
                System.out.print(number + " ");
            }
            System.out.println();
            System.out.println();
        }
        public static void task3() {
            System.out.println("Задание №3");
            int numberCitizens = 12_000_000;
            int year = 2023;
            while (year < 2033) {
                year++;
                numberCitizens = numberCitizens + (numberCitizens*17/1000) - (numberCitizens*8/1000);
                System.out.println("Год " + year + " численность населения составляет " + numberCitizens);
            }
            System.out.println();
        }
        public static void task4() {
            System.out.println("Задание №4");
            int deposite = 15000;
            while (deposite <= 12_000_000) {
                deposite = deposite + deposite*7/100;
                System.out.println("Сумма накоплений равна " + deposite + " рублей.");
            }
            System.out.println();
        }
        public static void task5() {
            System.out.println("Задание №5");
            int deposite = 15000;
            int month = 0;
            while (deposite <= 12_000_000) {
                month++;
                deposite = deposite + deposite*7/100;
                if (month % 6 == 0) {
                    System.out.println("Сумма накоплений за " + month + " месяц равна " + deposite + " рублей.");
                }
            }
            System.out.println("Для накопления 12 000 000 потребуется " + month + " месяцев. Или " +
                    (month/12) + " лет и " + (month%12) + " месяца.");
            System.out.println();
        }
        public static void task6() {
            System.out.println("Задание №6");
            int deposite = 15000;
            int month = 0;
            while (month < 108) {
                month++;
                deposite = deposite + deposite*7/100;
                if (month % 6 == 0) {
                    System.out.println("Сумма накоплений за " + month + " месяц равна " + deposite + " рублей.");
                }
            }
            System.out.println("За 9 лет сумма накоплениий составит " + deposite);
            System.out.println();
        }
        public static void task7() {
            System.out.println("Задание №7");
            int dateFriday = (int) (Math.random()*7);
            while (dateFriday <= 31) {
                System.out.println("Сегодня пятница, " + dateFriday + "-е число. Необходимо подготовить отчет.");
                dateFriday = dateFriday + 7;
            }
            System.out.println();
        }
        public static void  task8() {
            System.out.println("Задание №8");
            for (int i = 0; i <= 2123; i = i + 79) {
                if (i >= 1823) {
                    System.out.println(i);
                }
            }
        }
}