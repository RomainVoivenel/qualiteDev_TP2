import java.util.Map;
import java.util.HashMap;

public class Auteur{
    private String nom;
    Map<String, Integer> perfTragedie;
    Map<String, Integer> perfComedie;
    Map<String, Integer> perfDrame;

    public Auteur(String nom, int qualiteTragedie, String citationTragedie, int qualiteComedie, String citationComedie, int qualiteDrame, String citationDrame){
        this.nom = nom;
        this.perfTragedie = new HashMap<>();
        this.perfComedie = new HashMap<>();
        this.perfDrame = new HashMap<>();
        this.perfTragedie.put(citationTragedie,qualiteTragedie);
        this.perfComedie.put(citationComedie,qualiteComedie);
        this.perfDrame.put(citationDrame,qualiteDrame);

    }
    public int getQualiteTragedie(String citationTragedie){
        return this.perfTragedie.get(citationTragedie);
    }
    @Override
    public String toString(){
        String s1 = "L'honorable ";
        return s1.concat(this.nom);
    }
}