import java.util.Random;

import static java.lang.Thread.sleep;

public class Main {

    static void mulTable(int a, int b) {
        for (int q = a; q <= b; q++) {
            for (int c = a; c <= b; c++) {
                System.out.printf("%7d",c * q);
            }
            System.out.println(" ");
        }
    }

    static void printFibbonacci(final int n) {
        int a1 = 0;
        int a2 = 1;
        int a3;

        for (int q = 1; q <= n ; q++){
            a3 = a1 + a2;
            if (q > n - 1) {
                System.out.println("Fibonacci" + q + " : " + a3);
            }
            a1 = a2;
            a2 = a3;
        }

//        System.out.println(" ");

    }

    static long factorial(final int n) {
        long result = 1;
        for (int q = 1; q <= n; q++) {
            result = q * result;
        }
        return result;
    }

    static int add(int a1, int a2) {
        return a1 + a2;
    }

    static String generatePassword(int passwordLength, String randomString){
        Random randomizer = new Random();
        String resultPassword = "";
        for (int i = 0; i < passwordLength; i++) {
            int randomIndex = randomizer.nextInt(randomString.length());
            char randomChar = randomString.charAt(randomIndex);
            resultPassword = resultPassword + randomChar;
        }
        return resultPassword;
    }


    public static void main(String[] args){
//        mulTable(1, 100);
//        printFibbonacci(9);
//        int f = factorial(9);
//        double b = Math.sin(Math.PI);
//        System.out.println(f);
//        int f = add(7,3);
//        System.out.println(f);
//        System.out.println(
//               factorial(
//                        add(10, 10)
//                )
//        );
//        String pass = generatePassword(500, "Мы рождены с тобой, под одной звездой, под одной звездой на небе!");
//        System.out.println(pass);
//        String wooo = "Мы жили долго и счастливо";
//        System.out.println(wooo.length());
//        System.out.println(wooo.substring(6, 12));
//
        int [] war = new int[10];
        war[0]=10;
        war[2]=20;
        war[4]=30;
        war[5]=40;
        war[6]=70;
        war[8]=75;
        war[9]=90;
        war[1]=99;

        for(int i = 0; i< war.length; i++)

        System.out.println(war[i]);



//        int [] kit = {1,4,234,456,};
//        int d = kit.length;
//        System.out.println(d);

//        String One = "Ты рожден";
//        String Two = "Ты рожден";
//        String Four = "Ты рождены";
//        System.out.println(One + Two + " : " + One.equals(Two));
//        System.out.println(One + Two + " : " + One.equals(Four));


//        System.out.println("result: " + "Мы Рождены С Тобой" .toUpperCase());

//        String word = " Мы рождены с тобой";
//        String result = word.toLowerCase();
//        System.out.println("Result: " + result);


//        String line = "Hi. My name is Serg";
//        if  (line.endsWith("Vladimir")) {
//            System.out.println("string <<" + line + ">> is ends with 'Vladimir' ");
//        } else {
//            System.out.println("string <<" + line + ">> is no ends with 'Vladimir' ");
//        }
//        boolean b2 = line.endsWith("Sergei");
//        System.out.println(" Corporate " + line + " ends with 'Vladimir' " + b1);
//        System.out.println(" Corporate " + Corporateline + " ends with 'Sergei' "+ b2);

//        String sentence1 = "   Hjjf oh jrgh    ";
////        String sentence2 = " sdfushd  dwfih     fdg   ";
//        System.out.println(sentence1);
//        System.out.println(" sdfushd  dwfih     fdg   ".trim());


//        Random qwerty = new Random();
//        String pass = "";
//        for (int i = 0; i < 10; i++) {
//            int copy = wooo.length();
//            int q = qwerty.nextInt(copy);
//            char wq = wooo.charAt(q);
//            pass = pass + wq;
//        }
//        System.out.println(pass);



//        String word = "Румамбо харум мамбо ру";
//        word = word.concat("Hev,f");
//        System.out.println(word);
//
//        System.out.println("azaza " + "lalka " + "yaaaz");
//        System.out.println("azaza ".concat("lalka ").concat("yaaaz"));

//        String word = "Лайк Дотан";
//        System.out.println(word.);


//        int number = 2018;
//        int o = 2222;
//        int m = 2017;
//        int w = 1;
//
//        System.out.println("начало нового мира в " + Math.max(Math.max(number,w), Math.max(o,m))  + " году");
//        System.out.println("конец света в " + Math.min(m,number) + " году");


//        int a = (int) (Math.random() * 3);
//        System.out.println(a);

//        Random rnd = new Random();
//        System.out.println(rnd.nextInt());



//        double a = Math.random()+3;
//        System.out.println(a);

//        int n0 = 1;
//        int n1 = 1;
//        int n2;
//        System.out.print(n0+" "+n1+" ");
//        for(int i = 3; i <= 11; i++){
//            n2=n0+n1;
//            System.out.print(n2+" ");
//            n0=n1;
//            n1=n2;
//        }
//        System.out.println();

//     int a = 1;
//        int b = 3;
//        while (a <= 5) {
//            System.out.println(a + ": цикл выполняется!");
//            if (a == b) break;
//            a++;
//        }
//        for (int i = 0; ; i++) {
//            System.out.println("i = " + i);
//            for (int j = 0; j < 10; j++) {
//                System.out.println("    j = " + j);
//            }
//            if (i == 5) break;
//        }

//        System.out.println("Введите любое целое число: ");
//        Scanner sc = new Scanner(System.in);
//        int q = sc.nextInt();
//        int sum = 0;
//        for (int a = 1; a <= q; a++){
//            sum = sum + a;
//            System.out.println(sum);
//        }


//        int a = 1;
//        while (a <= 10){
//            System.out.println("3*" + a + "=" + 3*a);
//            a++;
//        }

//        for (int a = 1; a <= 10; a++){
//            System.out.println("3*" + a + "=" + 3*a);
//        }

//        for (char alphavit = 'a'; alphavit<='z'; alphavit++) {
//            System.out.print(alphavit + " ");
//            sleep(1000);
//        }

//        for (int i = -3; i < 3; i++) {
//            if (i >= 0) {
//                System.out.println(" " + i);
//            } else {
//                System.out.println(i);
//            }
//        }

//        char alphavit = 'a';
//        while (alphavit <= 'z'){
//            System.out.print(alphavit + " ");
//            alphavit++;
//        }

//
//        int i = 10;
//        do{
//            System.out.println(i);
//
//        }

//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 10;
//        } while (i >= 10);
//        System.out.println("Введите город на английском");
//        Scanner word = new Scanner(System.in);
//        String city = word.nextLine();
//
//        switch (city.toLowerCase()) {
//            case "rostov":
//                System.out.println("Вы выбрали Ростов");
//                break;
//            case "moscow":
//                System.out.println("Вы выбрали Москву");
//                break;
//            case "st-petersburg":
//                System.out.println("Вы выбрали Санкт-Петербург");
//                break;
//            default:
//                System.out.println("Вы написали что-то непонятное");
//
//        }

//        System.out.println("Введите число 1:");
//        Scanner text = new Scanner(System.in);
//        int number = text.nextInt();
//
////        System.out.print("Вы ввели число ");
//        if (number==1){
//            System.out.println("Вы ввели число 1");
////        }else {
////            System.out.println("не равное 1");
//        }


//        Locale.setDefault(Locale.US);

//        System.out.print("Введите 4 любых целых числа: ");
//        Scanner text = new Scanner(System.in);
//        double number1 = text.nextDouble();
//
////        if (number>5){
////            System.out.println("Ты плохой человек");
////        }else{
////            System.out.println("Ты поистене великий человек");
////        }
//        System.out.println("Ты ввел числа " + number1);
//
//        int n = 2;
//        int k = 2;
//        int a = 2 * n++; //теперь значение a равно 4, а n равно 3
//        int b = 2 * ++k; //теперь значение b равно 6, а k равно 3
//
//        String number1 = " (значение a равно 4, а n равно 3)";
//        String number2 = " (значение b равно 6, а k равно 3)";
//
//
//        System.out.println("a = " + a + number1);
//        System.out.println("k = " + n);
//        System.out.println("b = " + b + number2);
//        System.out.println("k = " + k);


//        int a = 15;
//        int b = 26;
//        int c = 495;
//        double d = 435.23;
//
//        a++;
//        b--;
//        c--;
//        d++;
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(d);
//        System.out.println(c);
//
//        d += 0.23;
//
//        System.out.println(
////                ((int)(d*100))/((double)100)
////                ((int)(d*100))/100.0
////                ((int)(d*100))/100d
//
//        );
//
//
//
////        double sum = (d + c + b - a);
////        System.out.println(sum);
////        double sum1 = b - d;
////        System.out.println(sum1);
////        double e = sum -  356;
////        System.out.println(e);
////        e = sum*b;
////        System.out.println(e);
////        double qwerty = (sum*sum1/d)+6659;
////        System.out.println(qwerty);

//
//        System.out.println("Введите выберете любую цифру от 0 до 9: ");
//
//        Scanner text = new Scanner(System.in);
//
//        int number = text.nextInt();
//
//        System.out.print("Выехал из дома на ");
//
//        if (number == 0) {
//            System.out.println("работу");
//        } else if (number % 2 == 0) {
//            System.out.println("бутылке");
//        } else {
//            System.out.println("отдых");
//        }
    }
}
