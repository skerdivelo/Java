public class Auto {
    private String targa;
    private String marca;
    private String modello;
    private int cilindrata;
    private String annoAcquisto;
    private int numeroPosti;

    public Auto(String targa, String marca, String modello, int cilindrata, String annoAcquisto, int numeroPosti){
        this.targa = targa;
        this.marca = marca;
        this.modello = modello;
        this.cilindrata = cilindrata;
        this.annoAcquisto = annoAcquisto;
        this.numeroPosti = numeroPosti;
    }
    
    //get
    public String getTarga(){return targa;}
    public String getMarca(){return marca;}
    public String getModello(){return modello;}
    public int getCilindrata(){return cilindrata;}
    public String getAnnoAcquisto(){return annoAcquisto;}
    public int getNumeroPosti(){return numeroPosti;}

    //set
    public void setTarga(String targa) {
        this.targa = targa;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModello(String modello) {
        this.modello = modello;
    }
    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }
    public void setAnnoAcquisto(String annoAcquisto) {
        this.annoAcquisto = annoAcquisto;
    }
    public void setNumeroPosti(int numeroPosti) {
        this.numeroPosti = numeroPosti;
    }
    public void caricaVettore(Auto[] auto, int dimensione){
        for(int i = 0; i < dimensione; i++){
            auto[i] = new Auto(targa, marca, modello, 200, annoAcquisto, 4);
        }
    }
}
