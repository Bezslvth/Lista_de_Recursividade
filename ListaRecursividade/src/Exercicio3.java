
import static java.lang.Math.abs;
import static java.lang.Math.log10;
import static java.lang.Math.pow;
public class Exercicio3 {
    int inverter(int n) {
	if((n / 10) == 0) {
            return n;
	}
	return (int) (inverter(n / 10) + (n % 10) * pow(10, abs(log10(n))));
}
    int inverterSig(int n) {
	if(n < 0) {
        	return -1 * inverter(n * -1);
	}
	return inverter(n);
    }  
}
