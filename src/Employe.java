import java.util.Comparator;

public class Employe implements Comparable<Employe> {
    private int id;



    private String nom;
    private String prenom;
    private String deptNom;
    private int grade;

    public Employe() {
    }

    public Employe(int id, String nom, String prenom, String deptNom, int grade) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.deptNom = deptNom;
        this.grade = grade;
    }
    public Employe(String nom){
        this.nom=nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDeptNom() {
        return deptNom;
    }

    public void setDeptNom(String deptNom) {
        this.deptNom = deptNom;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null) return false;
        if(obj instanceof Employe emp){
            return this.nom.equals(emp.nom) && this.id==emp.id;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", deptNom='" + deptNom + '\'' +
                ", grade=" + grade +
                '}';
    }

    @Override
    public int compareTo(Employe o) {
        return this.id-o.id;
    }
}
