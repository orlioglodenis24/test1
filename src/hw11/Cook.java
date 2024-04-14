package hw11;

public class Cook {


    public static void main(String[] args) {
        Cook cook = new Cook("denis", "pass1234");
        Cook2 cook2 = new Cook2("admin2", "23e3esd");
        Cook3 cook3= new Cook3("admin2", "fdfsdfsf");

        cook.sign();
        cook2.sign();
        cook3.sign();
    }

    public String name;
    public String pass;

    public Cook(String name, String pass) {
        this.name = name;
        this.pass = pass;
    }

    public void sign() {
        System.out.println("рег польз1");
    };
}
    class Cook2 extends Cook {
        public Cook2(String name, String pass) {
            super(name, pass);
        }

        public void sign() {
            System.out.println("рег польз2");
        }

        ;
    }

    class Cook3 extends Cook {
        public Cook3(String name, String pass) {
            super(name, pass);
        }

        public void sign() {
            System.out.println("рег польз3");
        }

        ;
    }


