public class Exercicio10 {
        int NaturaisDec(int n) {
            if(n == -1) {
                    return 0;
            }
            printf("%d ", n);
            NaturaisDec(n - 1);
            return n;
    }

    int NaturaisDecSig(int n) {
            if(n < 0) {
                    return NaturaisDec(n * -1);
            }
            return NaturaisDec(n);
        }

        private void printf(String d_, int n) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
