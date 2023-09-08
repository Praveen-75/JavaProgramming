abstract class a {
    abstract void shape();

    abstract void color();

    abstract void capacity();

}

abstract class b extends a {

}

abstract class c extends b {

}

class d extends c {
    void shape() {
        System.out.println("shape");
    }

    void color() {
        System.out.println("color");
    }

    void capacity() {
        System.out.println("capacity");
    }
}

abstract public class Abstract {
    public static void main(String[] args) {
        c obj = new d();
        obj.shape();
        obj.color();
        obj.capacity();
    }
}
