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
        System.out.println("Задание 1:");
        float a = 2.11f;
        System.out.println("Значение переменной a c типом float равно "+a);
        long b = 9397678965549L;
        System.out.println("Значение переменной b c типом long равно "+b);
        double c = 45.666;
        System.out.println("Значение переменной c c типом double равно "+c);
        short d = 422;
        System.out.println("Значение переменной d c типом short равно "+d);
        int f = 5747897;
        System.out.println("Значение переменной f c типом int равно "+f);
        byte g = 117;
        System.out.println("Значение переменной g c типом byte равно "+g);
    }
    public static void task2 () {
        System.out.println("Задание 2:");
        float a = 27.12f;
        long b = 987678965549L;
        double c = 2.786;
        short d = 569;
        short e = -159;
        int f = 27897;
        byte g = 67;
        System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g);
    }
    public static void task3 () {
        System.out.println("Задание 3:");
        byte classLydmila = 23;
        byte classAnna = 27;
        byte classEkaterina = 30;
        short paper = 480;
        int students = classLydmila+classAnna+classEkaterina;
        System.out.println("В трех классах "+students+" учеников");
        int studentPaper = paper/students;
        System.out.println("На каждого ученика рассчитано "+studentPaper+" листов бумаги");
    }
    public static void task4 () {
        System.out.println("Задание 4:");
        byte bottle = 16;
        byte timeMinute = 2;
        int outputMinute = bottle/timeMinute;
        System.out.println("В одну минуту машина производит "+outputMinute+" бутылок");
        byte timeMinute2 = 20;
        byte hour = 60;
        byte day = 24;
        byte month = 31;
        int outputMinute2 = timeMinute2*outputMinute;
        System.out.println("За 20 минут машина производит "+outputMinute2+" бутылок");
        int outputDay = (day*hour)*outputMinute;
        System.out.println("За сутки машина производит "+outputDay+" бутылок");
        int outputThreeDays = ((day*3)*hour)*outputMinute;
        System.out.println("За трое суток машина производит "+outputThreeDays+" бутылок");
        int outputMont = ((month*day)*hour)*outputMinute;
        System.out.println("За месяц машина производит "+outputMont+" бутылок");
    }
    public static void task5() {
        System.out.println("Задание 5:");
        byte countPaint = 120;
        System.out.println("На ремонт школы нуно "+countPaint+" банок краски двух цветов");
        byte whiteOneClass = 2;
        byte brownOneClass = 4;
        System.out.println("На один класс уходит "+whiteOneClass+" банки белой красски и "+brownOneClass+" банки коричневой краски");
        int paintOneClass = whiteOneClass+brownOneClass;
        int countClass = countPaint/paintOneClass;
        int countWhite = countClass*whiteOneClass;
        int countBrown = countClass*brownOneClass;
        System.out.println("Для проведения всего ремонта в школе, где "+countClass+" классов, потребуется "+countWhite+" банок белой красски и "+countBrown+" банок коричневой краски");
    }
    public static void task6() {
        System.out.println("Задание 6:");
        byte bananaCount = 5;
        byte oneBananaWeight = 80;
        int bananaWeight = bananaCount*oneBananaWeight;
        short milkCountMl = 200;
        byte hundredMlWeight = 105;
        int milkWeight = (milkCountMl/100)*hundredMlWeight;
        byte iceCreamCount = 2;
        byte oneIceCreamWeight = 100;
        int iceCreamWeight = iceCreamCount*oneIceCreamWeight;
        byte egg = 4;
        byte oneEggWeight = 70;
        int eggWeight = egg*oneEggWeight;
        short kilogram = 1000;
        float breakfastWeightGram = bananaWeight+milkWeight+iceCreamWeight+eggWeight;
        System.out.println("Спортивный завтрак состоит из бананов, молока, мороженого и яиц");
        System.out.println("Вес спортивного завтрака в граммах - "+breakfastWeightGram);
        float breakfastWeightKilogram = breakfastWeightGram/kilogram;
        System.out.println("Вес спортивного завтрака в килограммах - "+breakfastWeightKilogram);
    }
    public static void task7() {
        System.out.println("Задание 7:");
        byte excessWeightKilogram = 7;
        short minLossGram = 250;
        short maxLossGram = 500;
        short kilogram = 1000;
        int dayMinLoss = (excessWeightKilogram*kilogram)/minLossGram;
        int dayMaxLoss = (excessWeightKilogram*kilogram)/maxLossGram;
        int midLossGram = (maxLossGram+minLossGram)/2;
        int dayMidLoss = (excessWeightKilogram*kilogram)/midLossGram;
        System.out.println("Спортсмену необходимо похудеть на "+excessWeightKilogram+" килограмм");
        System.out.println("Теряя кадый день по "+minLossGram+" грамм, спортсмен похудеет за "+dayMinLoss+" дней");
        System.out.println("Теряя кадый день по "+maxLossGram+" грамм, спортсмен похудеет за "+dayMaxLoss+" дней");
        System.out.println("Теряя кадый день по "+midLossGram+" грамм, спортсмен похудеет за "+dayMidLoss+" дней");
    }
    public static void task8() {
        System.out.println("Задание 8:");
        int mashaMonthPay = 67760;
        System.out.println("Старая зарплата Маши составляла "+mashaMonthPay+" рублей");
        int denisMonthPay = 83690;
        System.out.println("Старая зарплата Дениса составляла "+denisMonthPay+" рублей");
        int kristinaMonthPay = 76230;
        System.out.println("Старая зарплата Кристины составляла "+kristinaMonthPay+" рублей");
        int additionMashaPay = mashaMonthPay/10;
        int additionDenisPay = denisMonthPay/10;
        int additionKristinaPay = kristinaMonthPay/10;
        int newMashaPay = additionMashaPay+mashaMonthPay;
        int newDenisPay = additionDenisPay+denisMonthPay;
        int newKristinaPay = additionKristinaPay+kristinaMonthPay;
        byte year = 12;
        int oldYearMashaPay = mashaMonthPay*year;
        int oldYearDenisPay = denisMonthPay*year;
        int oldYearKristinaPay = kristinaMonthPay*year;
        int newYearMashaPay = newMashaPay*year;
        int newYearDenisPay = newDenisPay*year;
        int newYearKristinaPay = newKristinaPay*year;
        int differenceYearMashaPay = newYearMashaPay-oldYearMashaPay;
        int differenceYearDenisPay = newYearDenisPay-oldYearDenisPay;
        int differenceYearKristinaPay = newYearKristinaPay-oldYearKristinaPay;
        System.out.println("После повышения зарплаты на 10% Маша получает "+newMashaPay+" рублей. Годовой доход вырос на "+differenceYearMashaPay+" рублей");
        System.out.println("После повышения зарплаты на 10% Денис получает "+newDenisPay+" рублей. Годовой доход вырос на "+differenceYearDenisPay+" рублей");
        System.out.println("После повышения зарплаты на 10% Кристина получает "+newKristinaPay+" рублей. Годовой доход вырос на "+differenceYearKristinaPay+" рублей");
    }
}