package uoter;

public class Uoter_Class {
    public void xinChao() {
        Kid kid = new Kid();
        kid.hello();
    }
}
// Duy nhat 1 class public trung ten file;

class Kid {
    public int tuoi;

    public void hello() {
        System.out.println("Xin chao");
    }
}
// outer class auto default;

// co the ke thua trong cung package;