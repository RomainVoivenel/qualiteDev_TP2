import java.util.*;
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

    public int getQualiteTragedie(Performance performance){
        return this.performance.get(performance).getPerf();
    }
    public String getCitationTragedie(){
        return this.performance.get("Tragédie").getCitation();
    }

    public int getQualiteComedie(Performance performance){
        return this.performance.get(performance).getPerf();
    }
    public String getCitationComedie(){
        return this.performance.get("Comédie").getCitation();
    }

    public int getQualiteDrame(Performance performance){
        return this.performance.get(performance).getPerf();
    }
    public String getCitationDrame(){
        return this.performance.get("Drame").getCitation();
    }

    public String pointFort(){
        int qualite = 0;
        String fortEn = "Tragédie";
        for (Map<String, Performance> performances : this.performance){
            if (performances.){

            }
        }
    }

    @Override
    public String toString(){
        String s1 = "L'honorable ";
        return s1.concat(this.nom);
    }
}