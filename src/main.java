import monnaie.*;

public class main {
    public static void main(String[] args){
        Bouteille bouteille1 = new Bouteille("Coco Cola", new Monnaie().ajoute(10,Piece.OR));
        System.out.println(bouteille1);
        bouteille1.augmenteDe(Monnaie.ZERO.ajoute(15,Piece.OR));
        System.out.println(bouteille1);
        bouteille1.augmenteDe(Monnaie.ZERO.ajoute(14,Piece.ARGENT));
        System.out.println(bouteille1);
        bouteille1.augmenteDe(Monnaie.ZERO.ajoute(16,Piece.CUIVRE));
        System.out.println(bouteille1);
    }
}
