import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AffectationHashMap {
    private Map<Employe,Departement> map;
    AffectationHashMap(){
        map=new HashMap<>();
    }
    public void ajouterEmployeDepartement(Employe e,Departement d){
        map.put(e,d);
    }
    public void afficheEmployesEtDepratements(){
        System.out.println(map);
    }
    public void supprimerEmploye(Employe e){
        map.remove(e);
    }
    public void supprimerEmployeEtDeparetments(Employe e,Departement d){
        map.remove(e,d);
    }
    public void afficherDeparetements(){
        System.out.println(map.values());
    }
    public void afficherEmploye(){
        System.out.println(map.keySet());
    }
    public boolean rechercherEmploye(Employe e){
        return map.containsKey(e);
    }
    public boolean rechercherDepartement(Departement d){
        return map.containsValue(d);
    }
    public TreeMap<Employe,Departement> trierMap(){
        TreeMap<Employe,Departement> tri=new TreeMap<>(map);
        return tri;
    }
}
