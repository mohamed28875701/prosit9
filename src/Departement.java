public class Departement implements Comparable<Departement> {
    private int id;
    private String name;
    private int nbEmp;

    public Departement(int id, String name, int nbEmp) {
        this.id = id;
        this.name = name;
        this.nbEmp = nbEmp;
    }

    public Departement() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNbEmp() {
        return nbEmp;
    }

    public void setNbEmp(int nbEmp) {
        this.nbEmp = nbEmp;
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nbEmp=" + nbEmp +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null) return false;
        if(obj instanceof Departement d){
            return d.id==this.id && d.name.equals(this.name);
        }
        return false;
    }

    @Override
    public int compareTo(Departement o) {
        return this.id-o.id;
    }
}
