import java.util.ArrayList;
import java.util.List;

public class TournoiJournee {
    private List<Auteur> participants;
    private List<Epreuve> epreuves;

    public TournoiJournee() {
        this.participants = new ArrayList<>();
        this.epreuves = new ArrayList<>();
    }

    public void ajoutParticipant(Auteur auteur) {
        this.participants.add(auteur);
    }

    public void ajoutEpreuve(Style style, Journee momentJournee, int nbSpectateur) {
        this.epreuves.add(new Epreuve(style, momentJournee, nbSpectateur));
    }

    public int totalScore(Auteur auteur) {
        int score = 0;
        for (int i = 0; i < this.epreuves.size(); ++i) {
            score += epreuves.get(i).scoreAuteur(auteur);
        }
        return score;
    }

    public Auteur gagnantTournoi() {
        return new Auteur(null, 0, null, 0, null, 0, null);
    }

}
