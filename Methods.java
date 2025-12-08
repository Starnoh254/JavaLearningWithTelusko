class Computer {
    public void playMusic(){
        System.out.println("Music is playing...");
    }

    public String getMeAPen(int cost){

        if(cost > 0){
            return "Pen";
        }
        return "You didn't provide cash";
    }
}


public class Methods {
    public static void main (String args[]){
        Computer obj = new Computer();
        obj.playMusic();
        String result = obj.getMeAPen(0);
        System.out.println(result);
    }
}
