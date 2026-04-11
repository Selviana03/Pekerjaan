import java.util.*;

// 1. Interface Pekerja
interface Pekerja {
    void bekerja();
}

// 2. Class Implementasi
class Programmer implements Pekerja {
    @Override
    public void bekerja() {
        System.out.println("Programmer sedang menulis kode dan memperbaiki bug.");
    }
}

class Dokter implements Pekerja {
    @Override
    public void bekerja() {
        System.out.println("Dokter sedang memeriksa pasien.");
    }
}

class Guru implements Pekerja {
    @Override
    public void bekerja() {
        System.out.println("Guru sedang mengajar di kelas.");
    }
}

// 4. Simulasi Pewarisan Jamak untuk "Tablet"
interface Komputer { void prosesData(); }
interface Kamera { void ambilFoto(); }
interface Telepon { void telepon(); }

class Tablet implements Komputer, Kamera, Telepon {
    public void prosesData() { System.out.println("Tablet memproses data..."); }
    public void ambilFoto() { System.out.println("Tablet mengambil foto..."); }
    public void telepon() { System.out.println("Tablet melakukan panggilan..."); }
}

public class MainLatihan {
    public static void main(String[] args) {
        // 3. List<Pekerja> dan Demonstrasi Polimorfisme
        List<Pekerja> daftarPekerja = new ArrayList<>();
        daftarPekerja.add(new Programmer());
        daftarPekerja.add(new Dokter());
        daftarPekerja.add(new Guru());

        System.out.println("=== Demonstrasi Polimorfisme ===");
        for (Pekerja p : daftarPekerja) {
            p. bekerja(); // Memanggil method yang sama, hasil berbeda (Polimorfisme)
        }
    }
}
class MathUtils {
    // Factorial
    public static long factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    // Cek Bilangan Prima
    public static boolean isPrima(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Membulatkan double ke desimal tertentu
    public static double bulat(double nilai, int skala) {
        double pow = Math.pow(10, skala);
        return Math.round(nilai * pow) / pow;
    }

    // Acak integer dalam range [min, max]
    public static int acakInt(int min, int max) {
        return (int)(Math.random() * (max - min + 1)) + min;
    }

    // Menghitung Rata-rata dari List
    public static double hitungRata(List<Double> angka) {
        double total = 0;
        for (double d : angka) total += d;
        return total / angka.size();
    }

    // Menghitung Median
    public static double hitungMedian(List<Double> angka) {
        Collections.sort(angka);
        int n = angka.size();
        if (n % 2 == 0) return (angka.get(n/2-1) + angka.get(n/2)) / 2.0;
        return angka.get(n/2);
    }
}
// Interface
interface Playable { void play(); }
interface Pausable { void pause(); }

// Abstract Class
abstract class MediaPlayer {
    String namaFile;
    abstract void stop();
}

// Class Implementasi
class AudioPlayer extends MediaPlayer implements Playable, Pausable {
    @Override
    public void play() { System.out.println("Memutar musik..."); }
    
    @Override
    public void pause() { System.out.println("Musik dihentikan sejenak."); }
    
    @Override
    void stop() { System.out.println("Menghentikan musik."); }
}

class VideoPlayer extends MediaPlayer implements Playable, Pausable {
    @Override
    public void play() { System.out.println("Memutar video HD..."); }
    
    @Override
    public void pause() { System.out.println("Video dihentikan sejenak."); }
    
    @Override
    void stop() { System.out.println("Menghentikan video."); }
}