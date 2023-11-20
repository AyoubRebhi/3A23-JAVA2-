import java.util.HashSet;
import java.util.Comparator;
import java.util.TreeSet;

public class DepartementHashSet implements IDepartement<Departement> {

    private HashSet<Departement> departements;

    public DepartementHashSet() {
        departements = new HashSet<>();
    }

    @Override
    public void ajouterDepartement(Departement departement) {
        departements.add(departement);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for (Departement dep : departements) {
            if (dep.getNomDepartement().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {
        return departements.contains(departement);
    }

    @Override
    public void supprimerDepartement(Departement departement) {
        departements.remove(departement);
    }

    @Override
    public void displayDepartement() {
        System.out.println(departements);
    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
        Comparator<Departement> idComparator = Comparator.comparingInt(Departement::getId);

        TreeSet<Departement> sortedDepartements = new TreeSet<>(idComparator);

        sortedDepartements.addAll(departements);

        return sortedDepartements;
    }
}
