public class Student {
    int id;
    String name;
    int theoreticalScore;
    int practicalScore;
    
    public Student(int id, String name, int theoreticalScore, int practicalScore){
        this.id = id;
        this.name = name;
        this. theoreticalScore = theoreticalScore;
        this.practicalScore = practicalScore;
    }
    
    @Override
    public String toString() {
        return "id: " + id 
        + "\ntên: " + name 
        + "\nđiểm lý thuyết: " + theoreticalScore 
        + "\nđiểm thực hành: " + practicalScore;
    }


}

