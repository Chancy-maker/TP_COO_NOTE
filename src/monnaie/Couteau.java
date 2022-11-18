package monnaie;

import java.util.Objects;

public class Couteau extends ObjetPanier{


    private boolean taille;

    public Couteau(String name, Monnaie prix, boolean taille){
        super(name, prix);
        this.taille = taille;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Couteau)) return false;
        if (!super.equals(o)) return false;
        Couteau couteau = (Couteau) o;
        return taille == couteau.taille;
    }

    @Override
    public String toString(){
        if (taille == true){
            return "petit couteau " + name + "(" + prix.toString() + ")";
        }return "couteau " + name + "(" + prix.toString() + ")";
    }



    @Override
    public int hashCode() {
        return Objects.hash(taille);
    }
}
