class Calculator {
    public int add (int a , int b){
        return a + b;
    }

    public int add(int a , int b , int c){
        return a + b + c;
    }

    public double add(double a , int b ){
        return a + b;
    }

    public int add(int... numbers){
        int sum = 0;
        for(int n : numbers){
            sum += n;
        }

        return sum;
    }
}

public class Home {
    public static void main(String args[]){
        Calculator obj = new Calculator();
        int result = obj.add(3,4);
        int result2 = obj.add(3,4,5,6,7,8,9,10);
        System.out.println(result);
        System.out.println(result2);
    }
}
