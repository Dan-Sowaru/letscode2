package br.com.letscode;

import java.sql.SQLOutput;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        var date = LocalDateTime.now();
//
//        DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd-MM-yy");
//        System.out.printf("%td %tB %ty %tH:%tM:%tS %n", date, date, date, date,date, date);
//

//        Scanner input = new Scanner(System.in);
//        int primeiro;
//        int segundo;
//        System.out.println("digite o primeiro número");
//        primeiro = input.nextInt();
//        System.out.println("digite o segundo número");
//        segundo = input.nextInt();
//        System.out.printf("os numeros são %d e %d %n", primeiro, segundo);
//        System.out.printf("a soma de %d e %d são "+ (primeiro+segundo), primeiro, segundo);


//        int b = args.length;
//
////        int b = (int) Math.random() * 10;
//
//        if (b < 3) {
//            System.out.println("baixo" + b);
//        } else if (b > 6) {
//            System.out.println("alto" + b);
//        } else {
//            System.out.println("mediano");
//        }
//
//        if (b % 2 == 0) {
//            System.out.println("par" + b);
//        }

//        int argsLength = args.length;
//        int primeiro;
//        int segundo;
//        Scanner input = new Scanner(System.in);
//
//        if (argsLength == 0) {
//            System.out.println("digite o primeiro número");
//            primeiro = input.nextInt();
//            System.out.println("digite o segundo número");
//            segundo = input.nextInt();
//            System.out.printf("a soma de %d e %d são " + (primeiro + segundo), primeiro, segundo);
//
//        } else if (argsLength == 1) {
//            primeiro = Integer.parseInt(args[0]);
//            System.out.println("digite o segundo número");
//            segundo = input.nextInt();
//            System.out.printf("a soma de %d e %d são " + (primeiro + segundo), primeiro, segundo);
//
//        } else if (argsLength == 2) {
//            System.out.printf("a soma de %d e %d são " + (args[0] + args[1]), args[0], args[1]);
//
//        } else {
//            System.err.print("deu ruim");
//        }
//

//        final double fatorDeConversaoParaLibras = 2.20462;
//        double x = 100;
//
//        System.out.printf("\"100kg são %f lb\"", (x * fatorDeConversaoParaLibras));


//    Usando ENUMS pra facilitar

//        int b = new Random().nextInt(7);
//
//        agenda(DayOfWeek.of(b));
//
//        private static void agenda(DayOfWeek dia) {
//            switch (dia) {
//                case WEDNESDAY:
//                case MONDAY:
//                case FRIDAY:
//                    System.out.println("aula");
//                    break;
//                case THURSDAY:
//                case TUESDAY:
//                    System.out.println("estudar");
//                default:
//                    System.out.println("nada");
//            }
//        }

//

//        Scanner input = new Scanner(System.in);
//        double num1, num2, result;
//        String operation;
//
//        System.out.println("type a number");
//        num1 = input.nextDouble();
//        System.out.println("Type operation");
//        operation = input.next();
//        System.out.println("now another number, bull");
//        num2 = input.nextDouble();
//
//        switch (operation) {
//            case "+":
//                System.out.println(num1 + num2);
//                break;
//            case "-":
//                System.out.println(num1 - num2);
//                break;
//            case "*":
//                System.out.println(num1 * num2);
//                break;
//            case "/":
//                System.out.println(num1 / num2);
//                break;
//            default:
//                System.err.print("eat shit, type accordingly, it gave bugs!!");
//                return; // return só pra sair da função.
//        }
//
//        input.close();
//        Realizar uma operação matemática,
//        que deve ser passada via System.in
//                ( opções: + - / * ) entre
//        dois números que também devem ser
//        solicitados via System.in
//        Scanner entrada = new Scanner(System.in);
//        string texto = "n";
//        while (!texto.equalsIgnoreCase("S")) {
//            System.out.println("deseja sair? (s/n)");
//            entrada.next();
//        }
//        entrada.close();


        ////////////////////exercicio
//
//        Calcule a média aritmética de n valores a serem digitados.
//
//        Seu programa deve pedir para que o usuário digite uma nota de 0 a 10.
//
//        Se o valor digitado for -1, seu programa deve
//        efetuar o cálculo da média e imprimir na tela, com a quantidade de notas
//        digitadas
//
//        Se for maior que 10, deve devolver uma mensagem
//        avisando que a nota está inválida e não adicionar na soma.


//        Scanner input = new Scanner(System.in);
//
//        double number = 0, count = 0;
//
//        while (number != ) {
//            System.out.println("type a number");
//
//            if (number <= 10) {
//                number += input.nextDouble();
//                System.out.println("type another, nigga");
//                count++;
//            } else {
//                System.out.println("wrong number, my man!");
//            }
//
//        }
//
//        number /= count;
//        System.out.printf("results are %f", number);


//        Calcular a média de notas de uma turma com n alunos. O valor n deve
//        ser solicitado via System.in. Deve-se criar um vetor
//        para armazenar a nota de todos os alunos. Ao final o
//        programa deve imprimir a nota média e também a quantidade de
//        alunos. Obs.: Utilize um for para obter as notas de cada aluno
//        e um foreach para fazer o cálculo da média







//        Receber uma quantidade de turmas e a
//        quantidade de alunos por turma e armazenar
//        em uma matriz. Com esses dados você deve
//        imprimir a média de cada uma das turmas e
//        em seguida a média de todas as turmas.

        Scanner input = new Scanner(System.in);
        int classes, students;

        double[][] classesArray;

        System.out.println("Type how many classes");
        classes = input.nextInt();
        System.out.println("Type how many students");
        students = input.nextInt();

        classesArray = new double[classes][students];

        for (int i = 0; i < classes; i++) {
            System.out.printf("Enter the grades of class %d", i+1 );
            for (int j = 0; j < students; j++) {
                System.out.printf("Enter the grade of student %d of class %d", j+1, i+1);
                

            }
        }


    }

    private static void calculeStudentsAverage(int numberStudents) {
        double grade;
        double average = 0;
        System.out.println("How much students?");
        Scanner input = new Scanner(System.in);
        numberStudents = input.nextInt();

        double[] studentGrades = new double[n];

        for (int i = 0; i < studentGrades.length; i++) {
            System.out.printf("Type the grade for the %d student", i+1);
            grade = input.nextDouble();
            studentGrades[i] = grade;
        }

        for (double entry : studentGrades) {
            average += entry;
        }

        average /= n;
        System.out.printf(" Média da turma : %f", average);

        input.close();
    }

}
