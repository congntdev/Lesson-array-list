package practice8.phase1;

public class Student {
    private int id;
    private String name;
    private String date;
    private String classId;
    private float mathScore;
    private float physicalScore;
    private float chemicalScore;
    private float total;

    public Student() {

    }

    public Student(int id, String name, String date, String classId, float mathScore, float physicalScore, float chemicalScore) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.classId = classId;
        this.mathScore = mathScore;
        this.physicalScore = physicalScore;
        this.chemicalScore = chemicalScore;
    }

    public Student(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public float getMathScore() {
        return mathScore;
    }

    public void setMathScore(float mathScore) {
        this.mathScore = mathScore;
    }

    public float getPhysicalScore() {
        return physicalScore;
    }

    public void setPhysicalScore(float physicalScore) {
        this.physicalScore = physicalScore;
    }

    public float getChemicalScore() {
        return chemicalScore;
    }

    public void setChemicalScore(float chemicalScore) {
        this.chemicalScore = chemicalScore;
    }

    public float getTotal() {
        return mathScore + physicalScore + chemicalScore;
    }

    public void setTotal(float total) {
        this.total = total;
    }
}
