package Clases;
import javax.swing.JOptionPane;

public class Lienzo {
    private int size;
    private char[][] lienzo;

    public Lienzo() {
        size = 10;
        lienzo = new char[size][size];
    }

    public void Clean() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                lienzo[i][j] = ' ';
            }
        }
    }

    public void setPen(int x, int y, char c) {
        if (x < 0 || y >= size) return;
        int pos = size - 1;
        lienzo[pos - y][x] = c;
    }

    public void paint() {
        StringBuilder lienzoteXto = new StringBuilder();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                lienzoteXto.append(lienzo[i][j]).append(" ");
                System.out.print(lienzo[i][j]);
            }
            lienzoteXto.append("\n");
            System.out.println("");
        }
        JOptionPane.showMessageDialog(null, lienzoteXto.toString(), "Dibujo", JOptionPane.INFORMATION_MESSAGE);
    }
}