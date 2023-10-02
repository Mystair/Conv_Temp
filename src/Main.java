import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double num, result;
        String unit1, unit2;
        Scanner in = new Scanner(System.in);

        System.out.println("Informe o valor da temperatura para conversão: ");
        num=in.nextDouble();
        System.out.println("Informe a unidade de temperatura: (K, F ou C) ");
        unit1=in.next();
        System.out.println("Informe a unidade de temperatura que gostaria de converter para: ");
        unit2=in.next();

        if(unit1.equals("C")){
            switch(unit2){
                case "F":
                    result= num * 1.8 + 32;
                    System.out.println(num+ "ºC convertido em Fahrenheit é igual à " +result+"ºF");
                    break;
                case "K":
                    result= num + 273.15;
                    System.out.println(num+ "ºC convertido em Kelvin é igual à " +result+"ºK");
                    break;
            }
        }else if(unit1.equals("F")){
                switch (unit2){
                    case "C":
                        result= (num-32)/1.8;
                        System.out.println(num+ "ºF convertido em Celsius é igual à " +result+"ºC");
                        break;
                    case "K":
                        result= (num+459.67)*((double) 5 /9);
                        System.out.println(num+ "ºF convertido em Kelvin é igual à " +result+"ºK");
                }
            }else{
            switch (unit2){
                case "C":
                    result= num-273.15;
                    System.out.println(num+ "ºK convertido em Celsius é igual à " +result+"ºC");
                    break;
                case "F":
                    result= (num*1.8)-459.67;
                    System.out.println(num+ "ºK convertido em Fahrenheit é igual à " +result+"ºF");
            }
        }
        System.exit(0);
    }
}