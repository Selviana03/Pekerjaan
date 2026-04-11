import java.util.*;

// --- 1 & 2. Interface dan Implementasi ---
interface Pekerja { void bekerja(); }

class Programmer implements Pekerja {
    public void bekerja() { System.out.println("Programmer sedang coding."); }
}
class Dokter implements Pekerja {
    public void bekerja() { System.out.println("Dokter sedang memeriksa pasien."); }
}
class Guru implements Pekerja {
    public void bekerja() { System.out.println("Guru sedang mengajar."); }
}

// --- 4. Tablet (Pewarisan Jamak) ---
interface Komputer { void proses(); }
interface Kamera { void foto(); }
interface Telepon { void call(); }

class Tablet implements Komputer, Kamera, Telepon {
    public void proses() { System.out.println("Tablet memproses data."); }
    public void foto() { System.out.println("Tablet memotret."); }
    public void call() { System.out.println("Tablet menelepon."); }
}

// --- 5. MathUtils ---
class MathUtils {
    public static long factorial(int n) { return (n <= 1) ? 1 : n * factorial(n - 1); }
    public static boolean isPrima(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) if (n % i == 0) return false;
        return true;
    }
}

// --- MAIN CLASS ---
public class Main {
    public static void main(String[] args) {
        // 3. Demonstrasi Polimorfisme
        List<Pekerja> daftar = new ArrayList<>();
        daftar.add(new Programmer());
        daftar.add(new Dokter());
        daftar.add(new Guru());

        System.out.println("HASIL POLIMORFISME:");
        for (Pekerja p : daftar) { p.bekerja(); }
    }
}
