public class Exercicio8 {
   int multip_Rec(int n1, int n2) {
	if(n1 == 0 || n2 == 0) {
		return 0;
	}
	if(n2 == 1) {
		return n1;
	}
	return n1 + multip_Rec(n1, n2 - 1);
    } 
}
