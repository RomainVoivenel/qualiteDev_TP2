public class Epreuve {
    private Style style;
    private Journee momentJournee;
    private int nbSpectateur;

    public Epreuve(Style style, Journee momentJournee, int nbSpectateur) {
        this.style = style;
        this.momentJournee = momentJournee;
        this.nbSpectateur = nbSpectateur;
    }

    public int scoreAuteur(Auteur auteur, Style style) {
        return auteur.qualiteStyle(style) * this.nbSpectateur;
    }

    public boolean combat(Auteur auteur1, Auteur auteur2) {
        if (this.scoreAuteur(auteur1, this.style) > this.scoreAuteur(auteur2, this.style)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Combat dans le style " + this.style + " durant " + this.momentJournee + " avec " + this.nbSpectateur;
    }
}
