class Calculator {
    int a;


    public int add(int a , int b){
        return a + b;
    }

    public int subtract(int a , int b){
        return a - b;
    }
}

public class Class {
    public static void main(String args[]){
        int num1 = 4;
        int num2 = 5;

        // int result = num1 + num2;

        

        Calculator calc = new Calculator();
        int result = calc.add(num1, num2);
        System.out.println(result);
    }
    
}

// Object oriented Programming 
