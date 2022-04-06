package at.campus02.nowa.figures;

import java.util.Arrays;

// Unsere Basisklasse !!!
public abstract class Figure {
    protected char[][] symbol = new char[3][3];
    protected int faktor_;

    @Override
    public String toString() {


        // Mit den anderen zwei Schleifen printen wir rundherum um die Zahl, die wir im Faktor mitgeben
        StringBuilder sb = new StringBuilder();
        for (int row = 0; row < 3; row++) {
            for (int i = 0; i < faktor_; i++) {
                for (int col = 0; col < 3; col++) {
                    for (int j = 0; j < faktor_; j++) {
                        sb.append(symbol[col][row]);

                    }

                }
                sb.append('\n');
            }
        }
        return sb.toString();
    }
}