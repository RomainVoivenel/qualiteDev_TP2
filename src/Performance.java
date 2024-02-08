public class Performance {
    private String citation;
    private int perf;
    public Performance(String citation, int perf){
        this.citation = citation;
        this.perf = perf;
    }
    public String getCitation(){
        return this.citation;
    }
    public int getPerf(){
        return this.perf;
    }
}
