import java.util.TreeSet;

public class Main {
    public static void main(String[] args){
        Departement d1=new Departement(1,"hh",13);
        Departement d2=new Departement(2,"hh",13);
        Departement d3=new Departement(3,"hh",13);
        DepartementHashSet dset=new DepartementHashSet();
        dset.ajouterDepartement(d1);
        dset.ajouterDepartement(d2);
        dset.ajouterDepartement(d3);
        dset.displayDepartement();
        dset.supprimerDepartement(d2);
        dset.displayDepartement();

    }
}
