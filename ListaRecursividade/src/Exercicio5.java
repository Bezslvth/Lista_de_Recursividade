public class Exercicio5 {
    int soma1N(int n) {
	if(n == 1) {
		return 1;
	}
	return n + soma1N(n - 1);
    }
}
