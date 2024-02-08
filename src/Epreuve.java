public class Epreuve {
    private Auteur auteur1;
    private Auteur auteur2;
    private Style style;
    private Journee momentJournee;
    private int nbSpectateur;
    public Epreuve(Auteur auteur1, Auteur auteur2, Style style, Journee momentJournee){
        this.auteur1 = auteur1;
        this.auteur2 = auteur2;
        this.style = style;
        this.momentJournee = momentJournee;
    }
    public int scoreAuteur1(){
        return auteur1.qualiteStyle(style)*this.nbSpectateur;
    }
    public int scoreAuteur2(){
        return auteur2.qualiteStyle(style)*this.nbSpectateur;
    }
    public Auteur combat(Auteur auteur1, Auteur auteur2){
        if (this.scoreAuteur1()>this.scoreAuteur2()){
            return this.auteur1;
        }
        return this.auteur2;
    }
    @Override
    public String toString(){
        return "Combat entre " + this.auteur1 + " et " + this.auteur2 + " dans le style " + this.style + " durant " + this.momentJournee + " avec " + this.nbSpectateur + ". Le gagnant est " + this.combat(this.auteur1, this.auteur2);
    }
}
