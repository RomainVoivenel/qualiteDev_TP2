import java.util.*;
import java.util.Map.Entry;
public class Auteur{
    private String nom;
    Map<Style, Performance> performance;


    public Auteur(String nom, int qualiteTragedie, String citationTragedie, int qualiteComedie, String citationComedie, int qualiteDrame, String citationDrame){
        this.nom = nom;
        this.performance = new HashMap<>();
        this.performance.put(Style.TRAGEDIE,new Performance(citationTragedie,qualiteTragedie));
        this.performance.put(Style.COMEDIE,new Performance(citationComedie,qualiteComedie));
        this.performance.put(Style.DRAME,new Performance(citationDrame,qualiteDrame));
    }

    public int getQualiteTragedie(){
        return this.performance.get(Style.TRAGEDIE).getPerf();
    }
    public String getCitationTragedie(){
        return this.performance.get(Style.TRAGEDIE).getCitation();
    }

    public int getQualiteComedie(){
        return this.performance.get(Style.COMEDIE).getPerf();
    }
    public String getCitationComedie(){
        return this.performance.get(Style.COMEDIE).getCitation();
    }

    public int getQualiteDrame(){
        return this.performance.get(Style.DRAME).getPerf();
    }
    public String getCitationDrame(){
        return this.performance.get(Style.DRAME).getCitation();
    }

    public Style pointFort(){
        int qualite = 0;
        Style fortEn = Style.TRAGEDIE;
        for (Entry<Style, Performance> performances : this.performance.entrySet()){
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