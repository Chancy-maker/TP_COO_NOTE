package monnaie;

import java.util.Objects;

public class Bouteille extends ObjetPanier{


    public Bouteille(String name, Monnaie prix){
        super(name, prix);
    }

    public String getName() {
        return name;
    }

    public Monnaie getPrix() {
        return prix;
    }

    @Override
    public String toString(){
        return"bouteille "+  name + "(" + prix.toString() + ")";
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Bouteille)) return false;
        return name.equals(((Bouteille)o).name) &&
                prix.equals(((Bouteille)o).prix);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, prix);
    }

}
