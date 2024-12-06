public class PrimeNumberChecker extends Number{
    public PrimeNumberChecker(int userInput){
        super(userInput);
    }
    public boolean IsPrime(){
        int number = getValue();
        if(number <= 1)
        {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(number);i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
