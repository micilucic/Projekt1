package at.campus02.nowa.figures;

public class FigureO2 extends Figure {
    public FigureO2(int faktor) {
     this.faktor_ = faktor;
     // wir brauchen faktor_ nicht immer initialisieren, nur einmal und dann mit this. darauf zugreifen

        symbol[0][0] = ' ';
        symbol[1][0] = 'X';
        symbol[2][0] = ' ';

        symbol[0][1] = 'X';
        symbol[1][1] = ' ';
        symbol[2][1] = 'X';

        symbol[0][2] = ' ';
        symbol[1][2] = 'X';
        symbol[2][2] = ' ';
    }
}
