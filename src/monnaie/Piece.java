package monnaie;

public enum Piece {
    OR("pieces_or"),
    ARGENT("pieces_argent"),
    CUIVRE("pieces_cuivre");


    public static final String TOUTES = "[OR, ARGENT, CUIVRE]";
    public static final int  NOMBRE = 3;
    private String name;


    private Piece( String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Piece{" +
                ", name='" + name + '\'' +
                '}';
    }
}
