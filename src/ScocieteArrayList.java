import java.util.*;

public class ScocieteArrayList implements IGestion<Employe>{
    ArrayList<Employe> list;
    ScocieteArrayList(){
        list=new ArrayList<>();
    }
    @Override
    public void ajouterEmploye(Employe employe) {
        list.add(employe);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for(int i =0;i!=list.size();i++){
            if(list.get(i).getNom().equals(nom))
                return true;
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe employe) {
        return list.contains(employe);
    }

    @Override
    public void supprimerEmploye(Employe employe) {
        list.remove(employe);
    }

    @Override
    public void displayEmploye() {
        System.out.println(list);
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort((List) list);
    }

    @Override
    public void trierEmployeParNomDepartementEtGrade() {

        Collections.sort((List) list, new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                return o1.getDeptNom().compareTo(o2.getDeptNom())+ o1.getGrade()-o2.getGrade();
            }
        });
    }
}
