package chapter4_classesAndInterfaces.item17_mutability.demo;

public class Mutable {

    private int v1;

    public Mutable(int v1) {
        this.v1 = v1;
    }

    public int getV1() {
        return v1;
    }

    public void setV1(int v1) {
        this.v1 = v1;
    }

    public void add(Mutable m){
        this.v1 = this.v1 + m.v1;
    }
}
