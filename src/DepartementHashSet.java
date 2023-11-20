import java.util.HashSet;
import java.util.TreeSet;

public class DepartementHashSet implements IDepartement<Departement>{
    private HashSet<Departement> set;
    DepartementHashSet(){
        set=new HashSet<>();
    }
    @Override
    public void ajouterDepartement(Departement departement) {
        set.add(departement);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for(Departement d:set){
            return d.getName().equals(nom);
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {
        return set.contains(departement);
    }

    @Override
    public void supprimerDepartement(Departement departement) {
        set.remove(departement);
    }

    @Override
    public void displayDepartement() {
        for(Departement d:set)
            System.out.println(d);
    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
        TreeSet<Departement> set1=new TreeSet<>(set);
        return  set1;
    }
}
