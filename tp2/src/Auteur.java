import java.util.*;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
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
        this.performance.entrySet().get(0).getKey();
    }

    public int getQualiteComedie(String citationComedie){
        return this.performance.get(citationComedie);
    }
    public String getCitationComedie(){
        this.performance.entrySet().get(1).getKey();
    }

    public int getQualiteDrame(String citationDrame){
        return this.performance.get(citationDrame);
    }
    public String getCitationDrame(){
        this.performance.entrySet().get(2).getKey();
    }

    public String pointFort(){
        int qualite = 0;
        String fortEn = Style.TRAGEDIE;
        
        for (Entry<String, Integer> perf : this.performance.entrySet()){
            if (perf.getValue() >= fortEn){
                if 
            }
        }
    }

    @Override
    public String toString(){
        String s1 = "L'honorable ";
        return s1.concat(this.nom);
    }
}