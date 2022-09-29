public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        int applesCount = 5;
        System.out.println("Значение переменной applesCount с типом int равно " + applesCount );
        byte cherryCount = 90;
        System.out.println("Значение переменной cherryCount с типом byte равно " + cherryCount );
        short nutsCount = 4;
        System.out.println("Значение переменной nutsCount с типом short равно " + nutsCount );
        long chinesePeopleCount = 1_442_965_000;
        System.out.println("Значение переменной chinesePeopleCount с типом long равно " + chinesePeopleCount );
        float numberPi = 3.1415926535F;
        System.out.println("Значение переменной numberPi с типом float равно " + numberPi );
        double numberEuler = 2.71828;
        System.out.println("Значение переменной numberEuler с типом double равно " + numberEuler );

        // Задача 2
        System.out.println("Задача 2");
        char option1 = 569;
        long option2 = 987_678_965_549L;
        int option3 = 27897;
        short option4 = -159;
        double option5 = 2.786;
        char option6 = 569;
        float option7 = 27.12F;
        byte option8 = 67;
        boolean option9 = false;

        // Задача 3
        System.out.println("Задача 3");
        int pupilsInFirstClass = 23;
        int pupilsInSecondClass = 27;
        int pupilsInThirdClass = 30;
        int papersCount = 480;
        int papersPerPupil = papersCount / (pupilsInFirstClass + pupilsInSecondClass + pupilsInThirdClass);
        System.out.println("На каждого ученика рассчитано " + papersPerPupil + " листов бумаги");

        // Задача 4
        System.out.println("Задача 4");
        int bottles = 16;
        int minutes = 2;
        int productivityPerMinute = bottles / minutes;
        int twentyMinutes = 20;
        System.out.println("За " + twentyMinutes + " минут машины произвела бутылок " + productivityPerMinute * twentyMinutes + " штук ");
        int minutesInDay = 24 * 60;
        System.out.println("За " + minutesInDay + " минут машины произвела бутылок " + productivityPerMinute * minutesInDay + " штук ");
        int minutesInThreeDays = 3 * minutesInDay;
        System.out.println("За " + minutesInThreeDays + " минут машины произвела бутылок " + productivityPerMinute * minutesInThreeDays + " штук ");
        int minutesInMonth = 10 * minutesInThreeDays; // В одном месяце 30 дней
        System.out.println("За " + minutesInMonth + " минут машины произвела бутылок " + productivityPerMinute * minutesInMonth + " штук ");

        // Задача 5
        System.out.println("Задача 5");
        int totalCans = 120;
        int whiteCansPerClass = 2;
        int brownCansPerClass = 4;
        int totalClasses = totalCans / (whiteCansPerClass + brownCansPerClass);
        int totalWhiteCansPerClasses = totalClasses * whiteCansPerClass;
        int totalBrownCansPerClasses = totalClasses * brownCansPerClass;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhiteCansPerClasses + " банок белой краски и " + totalBrownCansPerClasses + " банок коричневой краски");

        // Задача 6
        System.out.println("Задача 6");
        int totalBananas = 5;
        int bananaWeight = 80;
        int totalBananasWeight = totalBananas * bananaWeight;
        int totalMilkVolum = 200;
        int milkWeight = 105;
        int milkVolume = 100;
        int totalMilkWeight = totalMilkVolum * milkWeight / milkVolume; // Из расчета 100 мл = 105 гр
        int iceCream = 2;
        int iceCreamWeight = 100;
        int totalIceCreamWeight = iceCreamWeight * iceCream;
        int totalEggs = 4;
        int eggWeight = 70;
        int totalEggsWeight = eggWeight * totalEggs;
        int breakfastWeight = totalBananasWeight + totalMilkWeight + totalIceCreamWeight + totalEggsWeight;
        System.out.println("Общий вес спорт-завтрака составляет " + breakfastWeight + " грамм");
        float gramsPerKilogram = 1000;
        System.out.println("При переводе в килограммы это будет " + breakfastWeight / gramsPerKilogram + " кг");

        // Задача 7
        System.out.println("Задача 7");
        int needToLoseWeight = 7;
        int grPerKg = 1000;
        int needToLoseWeightPerGr = needToLoseWeight * grPerKg;
        int dailyWeightLoss1 = 250;
        int totalDaysForWeightLoss1 = needToLoseWeightPerGr / dailyWeightLoss1;
        System.out.println("При ежедневном сбросе веса на " + dailyWeightLoss1 + " грамм потребуется " + totalDaysForWeightLoss1 + " дней, чтобы добиться результата похудения");
        int dailyWeightLoss2 = 500;
        int totalDaysForWeightLoss2 = needToLoseWeightPerGr / dailyWeightLoss2;
        System.out.println("При ежедневном сбросе веса на " + dailyWeightLoss2 + " грамм потребуется " + totalDaysForWeightLoss2 + " дней, чтобы добиться результата похудения");

        // Задача 8
        System.out.println("Задача 8");
        int monthlyIncomeForMasha = 67760, monthlyIncomeForDenis = 83690, monthlyIncomeForChristina = 73230;
        int monthsPerYear = 12;
        int annualIncomeForMasha = monthlyIncomeForMasha * monthsPerYear;
        int annualIncomeForDenis = monthlyIncomeForDenis * monthsPerYear;
        int annualIncomeForChristina = monthlyIncomeForChristina * monthsPerYear;
        int percent = 10;
        int increasedMonthlyIncomeForMasha = monthlyIncomeForMasha + ((monthlyIncomeForMasha/100)*percent);
        int increasedMonthlyIncomeForDenis = monthlyIncomeForDenis + ((monthlyIncomeForDenis/100)*percent);
        int increasedMonthlyIncomeForChristina = monthlyIncomeForChristina + ((monthlyIncomeForChristina/100)*percent);
        int increasedAnnualIncomeForMasha = increasedMonthlyIncomeForMasha * monthsPerYear;
        int increasedAnnualIncomeForDenis = increasedMonthlyIncomeForDenis * monthsPerYear;
        int increasedAnnualIncomeForChristina = increasedMonthlyIncomeForChristina * monthsPerYear;
        int differenceBetweenAnnualIncomesForMasha = increasedAnnualIncomeForMasha % annualIncomeForMasha;
        int differenceBetweenAnnualIncomesForDenis = increasedAnnualIncomeForDenis % annualIncomeForDenis;
        int differenceBetweenAnnualIncomesForChristina = increasedAnnualIncomeForChristina % annualIncomeForChristina;
        System.out.println("Маша теперь получает " + increasedMonthlyIncomeForMasha + " рублей. Годовой доход вырос на " + differenceBetweenAnnualIncomesForMasha + " рублей");
        System.out.println("Денис теперь получает " + increasedMonthlyIncomeForDenis + " рублей. Годовой доход вырос на " + differenceBetweenAnnualIncomesForDenis + " рублей");
        System.out.println("Кристина теперь получает " + increasedMonthlyIncomeForChristina + " рублей. Годовой доход вырос на " + differenceBetweenAnnualIncomesForChristina + " рублей");

    }
}