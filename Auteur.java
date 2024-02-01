import java.util.Map;
import java.util.HashMap;
public class Auteur{
    private String nom;
    Map<String, Integer> performance;


    public Auteur(String nom, int qualiteTragedie, String citationTragedie, int qualiteComedie, String citationComedie, int qualiteDrame, String citationDrame){
        this.nom = nom;
        this.performance = new HashMap<>();
        this.performance.put(citationTragedie,qualiteTragedie);
        this.performance.put(citationComedie,qualiteComedie);
        this.performance.put(citationDrame,qualiteDrame);

    }

    public int getQualiteTragedie(String citationTragedie){
        return this.performance.get(citationTragedie);
    }
    public String getCitationTragedie(){
        Set<String> keys = performance.keySet();
        keys[0];
    }

    public int getQualiteComedie(String citationComedie){
        return this.performance.get(citationComedie);
    }
    public String getCitationComedie(){
        Set<String> keys = performance.keySet();
        keys[1];
    }

    public int getQualiteDrame(String citationDrame){
        return this.performance.get(citationDrame);
    }
    public String getCitationDrame(){
        Set<String> keys = performance.keySet();
        keys[2];
    }

    public String getMeilleurStyle(){
        int res = getQualiteTragedie(getCitationTragedie());
        if (getQualiteComedie(getCitationComedie()) > res){
            res = getQualiteComedie(getCitationComedie());
        }
        if (getQualiteDrame(getCitationDrame()) > res) {
            res = getQualiteDrame(getCitationDrame());
        }
    }

    @Override
    public String toString(){
        String s1 = "L'honorable ";
        return s1.concat(this.nom);
    }
}