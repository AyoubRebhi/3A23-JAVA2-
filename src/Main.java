import java.util.TreeSet;
public class Main {
    public static void main(String[] args) {
        // Create instances of Employe and Departement
        Employe employe1 = new Employe(1, 3, "rebhi", "ayoub", "HR");
        Employe employe2 = new Employe(2, 2, "haguiga", "skander", "IT");

        Departement departement1 = new Departement(101, "HR", 5);
        Departement departement2 = new Departement(102, "IT", 8);

        // Test SocieteArrayList
        SocieteArrayList societeArrayList = new SocieteArrayList();
        societeArrayList.ajouterEmploye(employe1);
        societeArrayList.ajouterEmploye(employe2);
        societeArrayList.displayEmploye();

        System.out.println("Search for 'ayoub': " + societeArrayList.rechercherEmploye("ayoub"));

        societeArrayList.trierEmployeParId();
        societeArrayList.displayEmploye();

        // Test DepartementHashSet
        DepartementHashSet departementHashSet = new DepartementHashSet();
        departementHashSet.ajouterDepartement(departement1);
        departementHashSet.ajouterDepartement(departement2);
        departementHashSet.displayDepartement();

        System.out.println("Search for 'HR': " + departementHashSet.rechercherDepartement("HR"));

        TreeSet<Departement> sortedDepartements = departementHashSet.trierDepartementById();
        System.out.println("Sorted Departements: " + sortedDepartements);
    }
}
