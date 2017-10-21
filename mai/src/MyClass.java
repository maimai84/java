public class MyClass {

    public void printMsg (){
        System.out.println( "Thank you for teaching me Java ");

    }

    public  void guessMyNumber(int n){
   int random=(int) Math.floor(Math.random()*(10+1));
    if (n>10){
        System.out.println(" inter n betwen 0 and 10");
    }
    else if(n==random){
        System.out.println("you win") ;
    }
    System.out.println("game over");

    }

}
