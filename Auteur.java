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
    public String getCitationTragedie(){
        return this.perfTragedie.keySet()[0];
    }

    public int getQualiteComedie(String citationComedie){
        return this.perfComedie.get(citationComedie);
    }
    public String getCitationComedie(){
        return this.perfComedie.keySet()[0];
    }

    public int getQualiteDrame(String citationDrame){
        return this.perfDrame.get(citationDrame);
    }
    public String getCitationDrame(){
        return this.perfDrame.keySet()[0];
    }

    @Override
    public String toString(){
        String s1 = "L'honorable ";
        return s1.concat(this.nom);
    }
}