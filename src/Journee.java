public enum Journee {
    MATIN("Matin"),
    APMIDI("Après-midi"),
    SOIREE("Soirée");
    private String momentJournee;
    private Journee(String momentJournee){
        this.momentJournee = momentJournee;
    }
}
