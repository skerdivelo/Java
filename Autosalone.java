public class Autosalone {
    private Auto[] a;

    public Autosalone(){
        a = new Auto[10];
    }

    public void caricaVettore(){
        for(int i = 0; i < 10; i++){
            a[i] = new Auto("hjrwe", "Benz", "jnfdsa", 12, "234", 234);
        }
    }
}
