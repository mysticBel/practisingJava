package collections;

public class Subject implements Comparable<Subject>{
    private String name;
    private int time;

    public Subject(String name, int time) {
        this.name = name;
        this.time = time;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public int compareTo(Subject o) {
        return this.name.compareTo(o.getName());
    }
}
