public class Main {
    public static void main(String[] args) {
        //HW 1 Exercise 1
        System.out.println("HW 1 Exercise 1");
        int total = 0;
        int savingAmount = 15000;
        int i = 1;
        while(total <= 2_459_000){
            total += savingAmount;
            i++;
            System.out.println("Месяц " + i +   ", сумма накоплений равна " + total + " рублей");
        }

        //HW 1 Exercise 2
        System.out.println();
        System.out.println("HW 1 Exercise 2");
        int n = 0;
        while(n < 10){
            n++;
            System.out.println(n);
        }

        System.out.println();
        for(int m = 10; m >= 1; m--){
            System.out.println(m);
        }

        //HW 1 Exercise 3
        System.out.println();
        System.out.println("HW 1 Exercise 3");
        double peopleBorn = 17.0/1000.0;
        double peopleDied = 8.0/1000.0;
        double population = 12_000_000;
        for(i = 0; i <= 10; i++){
            population = population + (population * (peopleBorn - peopleDied));
            System.out.println("Год " + i + ", численность населения составляет " + population);
        }

        //HW 2 Exercise 1
        System.out.println();
        System.out.println("HW 2 Exercise 1");
        double initialAmount = 15000.0;
        double total2 = 0;
        int month = 1;
        while(total2 <= 12_000_000){
            total2 += initialAmount;
            total2 += (total2 * 7.0/100.0);
            System.out.println("Month " + month + ", total = " + total2);
            month++;
        }
        //HW 2 Exercise 2
        System.out.println();
        System.out.println("HW 2 Exercise 2");
        //initialAmount = 15000.0;
        total2 = 0;
        month = 1;
        while(total2 <= 12_000_000){
            if(month % 6 == 0){
                System.out.println("Month " + month + ", total = " + total2);
            }
        total2 += initialAmount;
        total2 += (total2 * 7.0/100.0);
        month++;
        }

        //HW 2 Exercise 3
        System.out.println();
        System.out.println("HW 2 Exercise 3");
        //initialAmount = 15000.0;
        total2 = 0;
        month = 1;
        while(month <= 108){
            if(month % 6 == 0){
                if(month % 4 != 0) {
                    System.out.println("Month " + month + ", total = " + total2);
                }
            }

            total2 += initialAmount;
            total2 += (total2 * 7.0/100.0);
            month++;
        }

        //HW 2 Exercise 4
        System.out.println();
        System.out.println("HW 2 Exercise 4");
        int friday = 7;
        int day = 1;
        while(day <= 31 && friday <= 31){
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
            friday += 7;
            day++;
        }

        //HW 3 Exercise 1
        System.out.println();
        System.out.println("HW 3 Exercise 1");
        int startYear = 1817;
        int endYear = 2117;
        int result = startYear;
        while(result <= endYear){
            if(result % 79 == 0) {
                System.out.println(result);
            }
            result++;
        }

        //HW 3 Exercise 2
        System.out.println();
        System.out.println("HW 3 Exercise 2");
        int j = 1;
        int product;
        int multiplier = 2;
        while(j <= 10){
            product = multiplier * j;
            System.out.println(multiplier + "*" + j + "=" + product);
            j++;
        }
    }
}