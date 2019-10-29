public class Exercicio1 {
    int fat(int n) {
         if(n < 2) {
            return 1;
         }
         return n * fat(n - 1);
 } 
}
