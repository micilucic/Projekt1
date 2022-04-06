package at.campus02.nowa;

import at.campus02.nowa.figures.*;

import java.io.PrintStream;
import java.util.Scanner;

public class App {
    private final Scanner input;
    private final PrintStream output;
    private boolean exit = false;
    private int figureNr;
    private Figure figure;
    private int figureSize;

    // Konstruktor
    // input wird verwendet um Daten vom Benutzer einzulesen (verwendet scanner)
    // output wird verwendet um Text auf der Konsole auszugeben (verwendet sysout)
    public App(Scanner input, PrintStream output) {
        this.input = input;
        this.output = output;
    }

    //die Gameloop
    public void Run() {
        initialize();
        printState();

        while (!exit) {
            readUserInput();
            updateState();
            printState(); //Nur die Ausgabe
        }
    }

    private void initialize() {
        //TODO: Initialisierungen hier durchführen
        //Speieler und Karten anlegen !!! - man initialisiert Sachen, die nur einmal intialisert werden müssen

    }

    private void readUserInput() {
        //TODO: Alle Eingaben der Benutzer einlesen
        inputFigure();
        inputFigureSize();

    }

    private void updateState() {
        //TODO: Benutzereingaben verarbeiten


        //figureSize ist eigentlich dasselbe wie faktor_ !!!
        switch (figureNr) {
            case 1:
                figure = new FigureH(figureSize);
                break;
            case 2:
                figure = new FigureL(figureSize);
                break;
            case 3:
                figure = new FigureO(figureSize);
                break;
            case 4:
                figure = new FigureO2(figureSize);
                break;
            case 5:
                figure = new FigureI(figureSize);
                break;
            case 6:
                figure = new FigureMinus(figureSize);
                break;
            default:
                break;
        }
    }

    private void printState() {
        //TODO: Ausgabe des aktuellen Zustands
        if (figure != null) {
            output.println(figure);
        }
    }

    private void inputFigure() {
        // Hier sehen Sie ein Pattern für Benutzereingaben
        // Solange kein gültiger Wert eingegeben wurde, wird die Eingabe wiederholt
        do {
            output.println("Welche Grafik möchten Sie anzeigen (1-6)");
            figureNr = input.nextInt();
            if (figureNr < 1 || figureNr > 6) {
                output.println("Dies ist keine gültige Grafik!");
            } else {
             //   output.println("Bitte wählen Sie eine Größe (1-3)");
              //  figureSize = input.nextInt(); // hier musste man neue Variable anlegen, weil figureNr sonst überschrieben wäre
                break;
            }
        } while (true);
    }

    private void inputFigureSize() {
        // Hier sehen Sie ein Pattern für Benutzereingaben
        // Solange kein gültiger Wert eingegeben wurde, wird die Eingabe wiederholt
        do {
            output.println("Bitte wählen Sie eine Größe (1-3)");
            figureSize = input.nextInt();
            if (figureSize < 1 || figureSize > 4) {
                output.println("Dies ist keine gültige Grafik!");
            } else {
                break;
            }
        } while (true);
    }
}
