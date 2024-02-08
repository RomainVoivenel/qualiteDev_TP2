public class Epreuve {
    private Style style;
    private Journee momentJournee;
    private int nbSpectateur;
    public Epreuve(Style style, Journee momentJournee){
        this.style = style;
        this.momentJournee = momentJournee;
    }
    public int scoreAuteur(Auteur auteur){
        return auteur.qualiteStyle(style)*this.nbSpectateur;
    }

    public Auteur combat(Auteur auteur1, Auteur auteur2){
        if (this.scoreAuteur(auteur1)>this.scoreAuteur(auteur2)){
            return auteur1;
        }
        return auteur2;
    }
    @Override
    public String toString(){
        return "Combat dans le style " + this.style + " durant " + this.momentJournee + " avec " + this.nbSpectateur;
    }
}
