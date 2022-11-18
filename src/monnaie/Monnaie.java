package monnaie;
/*
• La classe monnaie.Monnaie doit-elle être déclarée finale. Pourquoi ?


Nous souhaitons que la classe Monnaie puisse évoluer facilement si l’on a besoin d’ajouter d’autres types de
pièces que des pièces d’or, d’argent et de cuivre. Modifiez votre classe Monnaie pour que l’on puisse
prendre en compte en un minimum de modifications du code de nouveaux types de pièces, par exemple les
pièces de coquillages cauris. Si vous vous débrouillez bien, ajouter un nouveau type de pièces comme
CAURIS devrait se réduire à ajouter la constante dans l'énumération Piece, le reste du code devrait
s'adapter automatiquement.
* */


import java.util.Objects;

public class Monnaie {
    /**
     * ZERO qui correspond à 0 pièce d’or, 0 pièce d’argent et 0 pièce de cuivre.
     */
    public static final Monnaie ZERO = new Monnaie();
    private final int nb_piece_or;
    private final int nb_piece_argent;
    private final int nb_piece_cuivre;

    /**
     * Constructeur sans paramème, créant une monnaie correspondant à 0 pièce d'or, 0 pièce d'argent et 0
     * pièce de cuivre
     */
    public Monnaie(){
        this(0,0,0);
    }

    /**
     * Ce constructeur permet d'initialiser le nombre de pièce de chaque type
     * @param nb_pieces_cuivre
     * @param nb_pieces_argent
     * @param nb_pieces_or
     */
    public Monnaie(int nb_pieces_or, int nb_pieces_argent, int nb_pieces_cuivre){
        this.nb_piece_or = nb_pieces_or;
        this.nb_piece_cuivre = nb_pieces_cuivre;
        this.nb_piece_argent = nb_pieces_argent;
    }

    /**
     *  Elle dispose en particulier de la méthode ajoute pour créer une
     * nouvelle monnaie en ajoutant un nombre strictement positif de pièces d’un seul type (or, argent ou
     * cuivre)
     * @param nb_pieces
     * @param piece
     * @return
     */
    public Monnaie ajoute(int nb_pieces, Piece piece) {
            if (piece == Piece.OR){
                return new Monnaie(this.nb_piece_or + nb_pieces,this.nb_piece_argent, this.nb_piece_cuivre);
            }if (piece == Piece.ARGENT){
                return new Monnaie(this.nb_piece_or ,this.nb_piece_argent + nb_pieces, this.nb_piece_cuivre);
            }
            return new Monnaie(this.nb_piece_or ,this.nb_piece_argent , this.nb_piece_cuivre + nb_pieces);

    }

    /**
     * * la méthode plus pour créer une nouvelle monnaie en additionnant les pièces de type (Or, argent ou cuivre)
     * contenu dans la monnaies
     * @param monnaie1
     * @return
     */
    public Monnaie plus(Monnaie monnaie1){
        return new Monnaie(nb_piece_or + monnaie1.nb_piece_or, nb_piece_argent + monnaie1.nb_piece_argent,nb_piece_cuivre + monnaie1.nb_piece_cuivre);

    }

    /**
     * La méthode get retourne le nombre de pièces
     * @param piece
     * @return
     */
    public int get(Piece piece){
        if (piece == Piece.ARGENT){
            return nb_piece_argent;
        }
        if (piece == Piece.OR){
            return nb_piece_or;
        }
        return nb_piece_cuivre;
    }

    public int getNb_piece_or() {
        return nb_piece_or;
    }

    public int getNb_piece_argent() {
        return nb_piece_argent;
    }

    public int getNb_piece_cuivre() {
        return nb_piece_cuivre;
    }


    @Override
    public String toString(){
        return nb_piece_or + "o " +  nb_piece_argent + "a "+ nb_piece_cuivre +"c";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Monnaie)) return false;
        Monnaie monnaie = (Monnaie) o;
        return nb_piece_or == monnaie.nb_piece_or &&
                nb_piece_argent == monnaie.nb_piece_argent &&
                nb_piece_cuivre == monnaie.nb_piece_cuivre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nb_piece_or, nb_piece_argent, nb_piece_cuivre);
    }
}
