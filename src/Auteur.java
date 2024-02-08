import java.util.*;
import java.util.Map.Entry;
public class Auteur{
    private String nom;
    Map<String, Performance> performance;


    public Auteur(String nom, int qualiteTragedie, String citationTragedie, int qualiteComedie, String citationComedie, int qualiteDrame, String citationDrame){
        this.nom = nom;
        this.performance = new HashMap<>();
        this.performance.put("Tragédie",new Performance(citationTragedie,qualiteTragedie));
        this.performance.put("Comédie",new Performance(citationComedie,qualiteComedie));
        this.performance.put("Drame",new Performance(citationDrame,qualiteDrame));
    }

    public int getQualiteTragedie(){
        return this.performance.get("Tragédie").getPerf();
    }
    public String getCitationTragedie(){
        return this.performance.get("Tragédie").getCitation();
    }

    public int getQualiteComedie(){
        return this.performance.get("Comédie").getPerf();
    }
    public String getCitationComedie(){
        return this.performance.get("Comédie").getCitation();
    }

    public int getQualiteDrame(){
        return this.performance.get("Drame").getPerf();
    }
    public String getCitationDrame(){
        return this.performance.get("Drame").getCitation();
    }

    public String pointFort(){
        int qualite = 0;
        String fortEn = "Tragédie";
        for (Entry<String, Performance> performances : this.performance.entrySet()){
            if (this.performance.get(performances.getKey()).getPerf() > qualite){
                fortEn = performances.getKey();
            }
        }
        return fortEn;
    }

    public int qualiteStyle(Style s){
        return this.performance.get(s).getPerf();
    }

    public String citationStyle(Style s){
        return this.performance.get(s).getCitation();
    }

    @Override
    public String toString(){
        String s1 = "L'honorable ";
        return s1.concat(this.nom);
    }
}