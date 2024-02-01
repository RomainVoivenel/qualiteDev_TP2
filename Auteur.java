public class Auteur{
    private String nom;
    private int qualiteTragedie;
    private String citationTragedie;
    private int qualiteComedie;
    private String citationComedie;
    private int qualiteDrame;
    private String citationDrame;

    public Auteur(String nom, int qualiteTragedie, String citationTragedie, int qualiteComedie, String citationComedie, int qualiteDrame, String citationDrame){
        this.nom = nom;
        this.qualiteTragedie = qualiteTragedie;
        this.citationTragedie = citationTragedie;
        this.qualiteComedie = qualiteComedie;
        this.citationComedie = citationComedie;
        this.qualiteDrame = qualiteDrame;
        this.citationDrame = citationDrame;

    }
    public int getQualiteTragedie(){
        return this.qualiteTragedie;
    }
}