package defaultPackage;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

//        char resp = 's';
//
//        while(resp != 'n'){
//            System.out.print("Digite a temperatura em Celsius: ");
//            double C = sc.nextDouble();
//            double F = 9.0 * C / 5.0 + 32;
//            System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
//            System.out.print("Deseja repetir (s/n)?: ");
//            resp = sc.next().charAt(0);
//        }

        char resp;
       do {
            System.out.print("Digite a temperatura em Celsius: ");
            double C = sc.nextDouble();
            double F = 9.0 * C / 5.0 + 32;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
            System.out.print("Deseja repetir (s/n)?: ");
            resp = sc.next().charAt(0);
        }  while(resp != 'n');

        sc.close();
    }


//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        int sum = 0;
//
//        for(int i = 0; i < n; i++) {
//            int x = sc.nextInt();
//             sum += x;
//        }
//
//        System.out.println(sum);
//        sc.close();
//    }


//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int x = sc.nextInt();
//        int sum = 0;
//
//        while (x != 0) {
//            sum += x;
//            x = sc.nextInt();
//        }
//
//        System.out.println(sum);
//        sc.close();
//    }


//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int hora;
//        System.out.println("Quantas horas?");
//        hora = sc.nextInt();
//
//        if (hora < 12) {
//            System.out.println("Bom dia");
//        } else if (hora < 18) {
//            System.out.println("Boa tarde");
//        } else {
//            System.out.println("Boa noite");
//        }
//
//        sc.close();
//    }
//


//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int hora;
//        System.out.println("Quantas horas?");
//        hora = sc.nextInt();
//
//        if(hora < 12){
//            System.out.println("Bom dia");
//        }else{
//            System.out.println("Boa tarde");
//        }
//
//        sc.close();
//
//
//    }

//  public static void main(String[] args) {
//      Scanner sc = new Scanner(System.in);
//
//      String s1, s2, s3;
//      int x;
//
//      x = sc.nextInt();
//      sc.nextLine();
//      s1 = sc.nextLine();
//      s2 = sc.nextLine();
//      s3 = sc.nextLine();
//
//      System.out.println(x);
//      System.out.println(s1);
//      System.out.println(s2);
//      System.out.println(s3);
//  }

//      Locale.setDefault(Locale.US);
//      Scanner sc = new Scanner(System.in);
//
//      String x;
//      int y;
//      double z;
//
//      x = sc.next();
//      y = sc.nextInt();
//      z = sc.nextDouble();
//      System.out.println("Dados digitados: ");
//
//      System.out.println(x);
//      System.out.println(y);
//      System.out.println(z);

//      String nome;
//      nome = sc.next();
//      System.out.println("Você digitou: " + nome);
//      sc.close();


//      int age;
//      age = sc.nextInt();
//      System.out.println("Você digitou " + age);
//
//      sc.close();

//      double age;
//      age = sc.nextDouble();
//      System.out.printf("Você digitou: %.2f", age);
//      sc.close();

//      char x;
//      x = sc.next().charAt(0);
//      System.out.println("Você digitou: " + x);
//      sc.close();

//
//      String name;
//      int age;
//      double income;
//
//      name = sc.next();
//      age = sc.nextInt();
//      income = sc.nextDouble();
//
//      System.out.println("Dados digitados: ");
//      System.out.println(name);
//      System.out.println(age);
//      System.out.println(income);
//
//      sc.close();

//    public static void main(String[] args) {
//
//        int y = 32;
//        double x = 10.35784;
//
//        System.out.println(y);
//        System.out.printf("%.2f%n", x);
//        Locale.setDefault(Locale.US);
//        System.out.printf("%.4f%n", x);
//        System.out.println(x);
//        System.out.println("Hello World!");
//        System.out.print("Hi!");
//        System.out.println("Good morning!");
//
//        System.out.println("Result = " + y + " METROS");
//        System.out.printf("Result = %.2f metros%n", x);
//
//
//        String name = "Maria";
//        int age = 31;
//        double income = 4000.0;
//        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", name, age, income);
//
//    }


//    public static void main(String[] args) {
//        String product1 = "Computer";
//        String product2 = "Office desk";
//
//        byte age = 30;
//        int code = 5290;
//        char gender = 'F';
//
//        double price1 = 2100.0;
//        double price2 = 650.50;
//        double measure = 53.234567;
//
//        System.out.println("Products:");
//        System.out.printf("%s, which price is $ %.2f%n", product1, price1);
//        System.out.printf("%s, which price is $ %.2f%n", product2, price2);
//        System.out.println();
//        System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code,gender);
//        System.out.println();
//        System.out.printf("Measure with eight decimal places: %.8f%n", measure);
//        System.out.printf("Rounded (three decimal places): %.3f%n", measure);
//        Locale.setDefault(Locale.US);
//        System.out.printf("US decimal point: %.3f",measure);
//    }


//    public static void main(String[] args) {
//        int x, y;
//
//        x = 5;
//        y = 2 * x;
//
//        System.out.println(x);
//        System.out.println(y);


//        double b, B, h, area;
//        b = 6.0;
//        B = 8.0;
//        h = 5.0;
//        area = (b + B) / 2.0 * h;
//        System.out.println(area);
//    }
//
//
//Casting
//        double a;
//        int b ;
//        a = 5.0;
//        b = (int) a;
//
//        System.out.println(b);

//}

//---------------------------------------------------------------------------------------------------------------------- EXERCISES
//public static void main(String[] args) {
//    Locale.setDefault(Locale.US);
//    Scanner sc = new Scanner(System.in);
//
//    double width = sc.nextDouble();
//    double length = sc.nextDouble();
//    double squareMeter = sc.nextDouble();
//
//    double area = width * length;
//
//    double price = area * squareMeter;
//
//    System.out.printf("AREA:  %.2f%n", area);
//    System.out.printf("PRECO %.2f%n", price);
//
//    sc.close();
//}

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int number = sc.nextInt();
//
//        if(number < 0){
//            System.out.println("NEGATIVO" );
//        }else {
//            System.out.println("POSITIVO");
//        }
//
//        sc.close();
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int number = sc.nextInt();
//
//        if(number / 2 == 0){
//            System.out.println("PAR" );
//        }else {
//            System.out.println("IMPAR");
//        }
//
//        sc.close();
//    }



//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int A, B;
//
//         A = sc.nextInt();
//         B = sc.nextInt();
//
//        if(A % B == 0 || B % A == 0){
//            System.out.println("Sao Multiplos" );
//        }else {
//            System.out.println("Nao sao Multiplo");
//        }
//
//        sc.close();
//    }



//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        int startHour = sc.nextInt();
//        int endHour = sc.nextInt();
//
//        int period;
//        if (startHour < endHour) {
//            period = endHour - startHour;
//        }
//        else {
//            period = 24 - startHour + endHour;
//        }
//
//        System.out.println("O JOGO DUROU " + period + " HORA(S)");
//
//        sc.close();
//    }
//}



//    public static void main(String[] args){
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        double width = sc.nextDouble();
//        double length = sc.nextDouble();
//        double squareMeter = sc.nextDouble();
//
//        double area = width * length;
//
//        double price = area * squareMeter;
//
//        System.out.printf("AREA:  %.2f%n", area);
//        System.out.printf("PRECO %.2f%n" , price);
//
//        sc.close();
//    }

//    public static void main(String[] args) {
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        int firstNumber = sc.nextInt();
//        int secondNumber = sc.nextInt();
//        int sum = firstNumber + secondNumber;
//
//        System.out.printf("SOMA: %d", sum);
//
//        sc.close();
//
//    }

//    public static void main(String[] args) {
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        double valueRadius = sc.nextDouble();
//        double pi = 3.14159;
//        double calc = pi * Math.pow(valueRadius, 2.0);
//
//        System.out.printf("A: %.4f", calc);
//        sc.close();
//    }
//    public static void main(String[] args) {
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        int A, B, C, D, difference;
//
//
//        A = sc.nextInt();
//        B = sc.nextInt();
//        C = sc.nextInt();
//        D = sc.nextInt();
//
//        difference = A * B - C * D;
//
//        System.out.println("DIFERENCA = " + difference);
//        sc.close();
//    }


//    public static void main(String[] args) {
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        int employeesNumber, numberHoursWorked;
//        double amountReceivedPerHour, salary;
//
//        employeesNumber = sc.nextInt();
//        numberHoursWorked = sc.nextInt();
//        amountReceivedPerHour = sc.nextDouble();
//
//        salary = numberHoursWorked * amountReceivedPerHour;
//
//        System.out.println("NUMBER = " + employeesNumber);
//        System.out.printf("SALARY = U$ %.2f", salary);
//
//        sc.close();
//    }


//    public static void main(String[] args) {
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        int codeFirstPiece, quantityFirstPiece,
//            codeSecondPiece, quantitySecondPiece;
//        double priceFirstPiece, priceSecondPiece, total;
//
//        codeFirstPiece = sc.nextInt();
//        quantityFirstPiece = sc.nextInt();
//        priceFirstPiece = sc.nextDouble();
//
//        codeSecondPiece = sc.nextInt();
//        quantitySecondPiece = sc.nextInt();
//        priceSecondPiece = sc.nextDouble();
//
//
//        total = (priceFirstPiece * quantityFirstPiece) + (priceSecondPiece * quantitySecondPiece);
//
//        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
//        sc.close();
//    }


//    public static void main(String[] args) {
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        double A, B, C, rectangle, triangle, circle, trapezium, square;
//
//        A = sc.nextDouble();
//        B = sc.nextDouble();
//        C = sc.nextDouble();
//
//        triangle = A * C / 2.0;
//        circle = 3.14159 * C * C;
//        trapezium = (A + B) / 2.0 * C;
//        square = B * B;
//        rectangle = A * B;
//
//        System.out.printf(
//                "TRIANGULO: %.3f%n" +
//                "CIRCULO: %.3f%n" +
//                "TRAPEZIO: %.3f%n" +
//                "QUADRADO:%.3f%n" +
//                "RETANGULO %.3f%n ", triangle, circle, trapezium, square, rectangle );
//
//        sc.close();
//    }

}



