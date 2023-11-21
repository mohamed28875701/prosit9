import java.util.TreeSet;

public class Main {
    public static void main(String[] args){
        Departement d1=new Departement(1,"finance",13);
        Departement d2=new Departement(2,"info",13);
        Departement d3=new Departement(3,"rh",13);
        DepartementHashSet dset=new DepartementHashSet();
        Employe e1=new Employe(1,"ee","erer","finance",1);
        Employe e2=new Employe(2,"ee","erer","info",2);
        Employe e3=new Employe(3,"ee","erer","rh",3);
        AffectationHashMap map=new AffectationHashMap();
        map.ajouterEmployeDepartement(e1,d1);
        map.ajouterEmployeDepartement(e2,d2);
        map.ajouterEmployeDepartement(e3,d3);
        map.afficheEmployesEtDepratements();
        map.supprimerEmployeEtDeparetments(e1,d1);
        System.out.println(map.rechercherEmploye(e1));
        System.out.println(map.rechercherDepartement(d2));

    }
}
