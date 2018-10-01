package model;

//class akan jadi object
public class Mobil {

    //attribute
    private int roda;
    private int kecepatan;
    private int percepatan;
    private String merek;

    public Mobil() {

    }

    //constructor
    public Mobil(int roda, int kecepatan, int percepatan, String merek) {
        this.roda = roda;
        this.kecepatan = kecepatan;
        this.percepatan = percepatan;
        this.merek = merek;
    }

    public int getRoda() {
        return roda;
    }

    public void setRoda(int roda) {
        this.roda = roda;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    public int getPercepatan() {
        return percepatan;
    }

    public void setPercepatan(int percepatan) {
        this.percepatan = percepatan;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        String prefix = "Indonesia";
        String kode = "01";
        this.merek = prefix + kode + merek;
    }

    public void jalan() {

    }

    public String methodString() {
        String nama = "Abdi";
        return nama;
    }
}

/*
tipe data

byte, 0 - 125
short, -255 - 255
int,
long,
double,
float
char = 'a'
String = "mobil saya"
boolean = true or false

*/


