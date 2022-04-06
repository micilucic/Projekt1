package at.campus02.nowa.figures;

public class FigureH extends Figure {
    public FigureH(int faktor) { // ----> DAS IST KONSTRUKTOR
        int faktor_;

        // wir brauchen faktor_ nicht immer initialisieren, nur einmal und dann mit this. darauf zugreifen

        this.faktor_ = faktor;

        symbol[0][0] = 'X';
        symbol[1][0] = ' ';
        symbol[2][0] = 'X';

        symbol[0][1] = 'X';
        symbol[1][1] = 'X';
        symbol[2][1] = 'X';

        symbol[0][2] = 'X';
        symbol[1][2] = ' ';
        symbol[2][2] = 'X';
    }
}
