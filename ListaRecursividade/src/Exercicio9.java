public class Exercicio9 {
    private int x;
    int returnNat(int n) {      
          if(n == -1) {
                  return 0;
          }
          int retNaturais = 1 + x (n - 1);
          printf("%d ", n);
        return n;
  }

  int returnNatSig(int n) {
          if(n < 0) {
                  return returnNat(n * -1);
          }
          return returnNat(n);
      }  

      private void printf(String d_, int n) {
          throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      }

      private int x(int i) {
          throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      }
  }
