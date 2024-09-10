package Clases;

public class Main {
    public static void main(String[] args) {
      Lienzo lienzo = new Lienzo();
      for(int i = 0; i < 5; i++){
          lienzo.setPen(i,i,'X');
      }
      lienzo.paint();
    }
}