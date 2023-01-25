package u04_IterationAndArrays;

public class s03_DoubleForLoops {
    public static void main(String[] args){

        /*
        Final Candadites
        -Tactics game
        -Checkers
        -Tetris
        -Othello
        -Blokus
        -Terraria-like game (2d minecraft)
        -Connect 4
        -Grid based exploration game
        -

        Save for later
        -Conway's game of life

        Conway's game of life
        Minesweeper
        Grid based battle game animated
        Connect 4
        Battleship
        Snake
        Monopoly
        Checkers
        A game with a grid and a map with walls simulating
        a house with jewels on the grid, control a little character to get
        the jewels with a .. redspace? Robbery game
        Tetris
        Shoots and Ladders
        Pokemon
        Graphing calculator
        Sudoku Solver
        Scrabble - Check against dictionary
        Smash the gopher on a grid - Whack-a-mole
        Papa's pizzaria
        Candy crush
        Duck Hunt
        Dots and Boxes
        2d Minecraft (Terraria-like)
        Fireboy and Watergirl
        Run
        Crossy Road



         */

        String[] desserts = {"ice cream","cookies","brownies","doughnuts","popsicles"};
        String[] fruits = {"strawberry", "cherry", "grape", "prune", "lemon"};

        for(int i=0; i<desserts.length; i++){
            for(int j=0; j<fruits.length; j++){
                System.out.println(fruits[j]+" "+desserts[i]);
            }
        }

        System.out.println("------------");

        for(int i=0; i<fruits.length; i++){
            for(int j=0; j<desserts.length; j++){
                System.out.println(fruits[i]+" "+desserts[j]);
            }
        }




    }
}
