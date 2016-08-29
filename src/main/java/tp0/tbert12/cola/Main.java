package tp0.tbert12.cola;

public class Main {

    public static void main(String[] args) {
        System.out.println("TP0 | 75.10 - TDD | 95606 - Tomas Augusto Bert");

        Queue<String> laCola = new Cola();


        System.out.println(laCola.size());
        if (laCola.isEmpty()){
            System.out.println("VACIA");
        } else {
            System.out.println("CON ALGO");
        }

        laCola.add("T");
        System.out.println(laCola.top());
        System.out.println(laCola.size());

        laCola.add("O");
        System.out.println(laCola.top());
        System.out.println(laCola.size());

        laCola.add("M");
        System.out.println(laCola.top());
        System.out.println(laCola.size());

        laCola.remove();
        System.out.println(laCola.top());
        System.out.println(laCola.size());

    }
}

