public class TestClass{
    
    public void metodo1(int num, double numDouble){
        int x, y;
        x = 5*3;
        y = 10*2;

        if(x > y){
            x=10;
        }
        
    }

    public void metodCall() {
        double numDouble = 5.0;
        int numero = 10;
        metodo1(numero, numDouble);
    }

}