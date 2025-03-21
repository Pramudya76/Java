class FinalExam extends GradeActivity {
    int numberofQuestions;
    int numberMissed;
    double pointsPerQuestions;

    public FinalExam(String name, int questions, int missed, double points) {
        super(name);
        numberMissed = missed;
        numberofQuestions = questions;
        pointsPerQuestions = points;
        this.score = (pointsPerQuestions * (numberofQuestions - numberMissed));
    }

    public void getNilai() {
        System.out.println("Nama : " + name);
        System.out.println("Nilai : " + (pointsPerQuestions * (numberofQuestions - numberMissed)));
        System.out.println("Grade : " + getGrade());
    }

}

class PassFailActivity extends GradeActivity {
    double minimumPassingScore;
    public PassFailActivity(String name, double minimumPassingScore) {
        super(name);
        this.minimumPassingScore = minimumPassingScore;
    }






}

class PassFailExam extends PassFailActivity {
    int numberofQuestions;
    double pointsPerQuestions;
    int numberMissed;

    public PassFailExam(String name, double minimumPassingScore, int questions, int missed) {
        super(name, minimumPassingScore);
        this.numberofQuestions = questions;
        this.pointsPerQuestions = 10;
        this.numberMissed = missed;
        this.score = (pointsPerQuestions * (numberofQuestions - numberMissed));
    }

    public void getNilai() {
        System.out.println("Nama : " + name);
        System.out.println("Nilai : " + score);
        System.out.println("Minimum Nilai : " + minimumPassingScore);
        System.out.println("Points Salah : " + numberMissed);
    }

    public void FailorPass() {
        if(score >= 70) {
            System.out.println("Kamu Lulus");
        }else {
            System.out.println("Kamu Tidak Lulus");
        }
    }







}


public class GradeActivityDemo {
    public static void main(String[] args) {
        FinalExam fe = new FinalExam("Tama", 10, 3, 10);
        fe.getNilai();

        PassFailExam pfe = new PassFailExam("Noir", 70, 10, 4);
        pfe.getNilai();
        pfe.FailorPass();
    }
}
