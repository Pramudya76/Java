public class GradeActivity {
    public double score;
    public String name;

    public GradeActivity(String name) {
        this.name = name;
        
    }

    public void setScore(double score) {
        this.score = score;
    }

    public char getGrade() {
        if (score >= 90) return 'A';
        else if (score >= 80) return 'B';
        else if (score >= 70) return 'C';
        else if (score >= 60) return 'D';
        else return 'F';
    }


}
