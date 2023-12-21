public class Student {
    String name, stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        double avarage = 0;
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya ,double sNote1,double sNote2,double sNote3) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }
        if (sNote1 >= 0 && sNote1 <= 100)
            this.mat.sNote = sNote1;

        if (sNote2 >= 0 && sNote2 <= 100)
            this.fizik.sNote = sNote2;

        if (sNote3 >= 0 && sNote3 <= 100)
            this.kimya.sNote = sNote3;




    }

    public void isPass() {

        // Her dersin ortalamaya etkisi hesaplanırken sözlü not da dikkate alınıyor.
        double mat = ((this.mat.sNote * 0.20) + (this.mat.note * 0.80));
        double fizik = (this.fizik.sNote * 0.20) + (this.fizik.note * 0.80);
        double kimya = (this.kimya.sNote * 0.20) + (this.kimya.note * 0.80);
        this.avarage = (mat + fizik + kimya) / 3.0;

        printNote();

        if (this.avarage > 55) {
            System.out.println("Sınıfı Geçti. ");
            this.isPass = true;
        } else {
            System.out.println("Sınıfta Kaldı. ");
            this.isPass = false;
        }


    }

    // Notları yazdırmak için metot
    public void printNote() {
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note + " (Sözlü: " + this.mat.sNote + ")");
        System.out.println("Fizik Notu : " + this.fizik.note + " (Sözlü: " + this.fizik.sNote + ")");
        System.out.println("Kimya Notu : " + this.kimya.note + " (Sözlü: " + this.kimya.sNote + ")");
    }
}





