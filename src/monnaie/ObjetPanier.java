package monnaie;

import java.util.Objects;

public class ObjetPanier {
    protected String name;
    protected Monnaie prix;

    public ObjetPanier(String name, Monnaie prix){
        this.name = name;
        this.prix = prix;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ObjetPanier)) return false;
        ObjetPanier that = (ObjetPanier) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(prix, that.prix);
    }

    public void augmenteDe(Monnaie m){
        int nb_piece_or= prix.getNb_piece_or() + m.getNb_piece_or();
        int nb_piece_argent = prix.getNb_piece_argent() + m.getNb_piece_argent();
        int nb_piece_cuivre = prix.getNb_piece_cuivre() + m.getNb_piece_cuivre();
        this.prix = Monnaie.ZERO.ajoute(nb_piece_or,Piece.OR).ajoute(nb_piece_argent, Piece.ARGENT).ajoute(nb_piece_cuivre,Piece.CUIVRE);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, prix);
    }
}
