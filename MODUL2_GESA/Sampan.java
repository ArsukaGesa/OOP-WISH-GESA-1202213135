public class Sampan extends TransportasiAir {
    protected int layar;

    public Sampan(int jumlahKursi, int biaya, int layar){
        super(jumlahKursi, biaya);
        this.layar = layar;
    }

    @Override
    public void informasi(){
        System.out.println("Transportasi air jenis sampan dengan kursi berjumlah " + jumlahKursi + " ditetapkan dengan biaya sebesar Rp " + biaya);
    }

    @Override
    public void berlayar(){
        System.out.println("Transportasi air jenis sampan sedang berlayar menggunakan " + layar + " layar.");
    }

    @Override
    public void berlabuh(){
        System.out.println("Transportasi air jenis sampan berlabuh di pantai Parangtritis tanpa menggunakan jangkar");
    }

    public void berlabuh(int jangkar){
        System.out.println("Transportasi air jenis sampan berlabuh di pantai Parangtritis menggunakan " + jangkar + " jangkar.");
    }

}
