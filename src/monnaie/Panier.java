package monnaie;

import java.util.ArrayList;

public class Panier {
    private ArrayList<ObjetPanier> objetPaniers;
    private   static int numero_panier = 0;
    private int nombre = 0;

    /**
     * Un panier est vide à la création et possède un numéro unique.
     */
    public Panier(){
        objetPaniers = new ArrayList<>();
        numero_panier += 1;
    }

    /**
     * La méthode ajoute permet d’ajouter des objets dans le panier. Plus exactement, il ne doit être possible d’ajouter que des bouteilles et des
     *  couteaux dans le panier.
     * @param objetPanier
     */
    public void ajoute(ObjetPanier objetPanier){
        if (!(objetPaniers.contains(objetPanier))){
            objetPaniers.add(objetPanier);
            this.nombre++;
        }
    }

    /**
     * La méthode estVide retourne troue si le panier est vide
     * @return
     */
    public boolean estVide(){
        return objetPaniers.isEmpty();
    }

    /**
     * La méthode dernier permet d’accéder au dernier objet placé dans le panier, à condition que le panier ne soit pas vide.
     * @return
     */
    public ObjetPanier dernier(){
        if (this.estVide()){
            return null;
        }
        return objetPaniers.get(objetPaniers.size()-1);
    }

    /**
     * Cette fonction retourne le nombre d'élément présent dans le panier
     * @return
     */
    public int nombre(){
        return nombre;
    }

    public void enleve(ObjetPanier objetPanier){
        for (int i = 0; i<objetPaniers.size(); i++){
            if (objetPaniers.get(i).equals(objetPanier)){
                objetPaniers.remove(objetPaniers.get(i));
                nombre -= 1;
            }
        }
    }

    /**
     * La représentation textuelle d’un panier contient son numéro, son nombre d’éléments et la liste de ses éléments. Par exemple :
     * "panier1(0)[]" représente le panier numéro 1, vide, et "panier6(2)[bouteille canette(0o 1a 11c), bouteille
     * verre1L(0o 3a 0c)]" représente le panier numéro 6 avec 2 bouteilles.
     * @return
     */
    @Override
    public String toString(){

        String display = "panier" + numero_panier + "(" + nombre() + ")" + "[";
        for (int i = 0; i<objetPaniers.size(); i++){
            if (!(i == (objetPaniers.size()-1)))
            display += objetPaniers.get(i).toString() + ", ";
            else {
                display += objetPaniers.get(i).toString();
            }
        }
        display += "]";
        return  display;
    }

}
