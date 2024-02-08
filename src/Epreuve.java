public class Epreuve {
    private Auteur auteur1;
    private Auteur auteur2;
    private Style style;
    private Journee momentJournee;
    public Epreuve(Auteur auteur1, Auteur auteur2, Style style, Journee momentJournee){
        this.auteur1 = auteur1;
        this.auteur2 = auteur2;
        this.style = style;
        this.momentJournee = momentJournee;
    }
    public int scoreAuteur1(){
        return 0;
    }
    public int scoreAuteur2(){
        return 0;
    }
    public Auteur gagnant(){
        return this.auteur1;
    }
}
