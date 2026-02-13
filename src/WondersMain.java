// Parent class
class Wonders {
    void name() {
        System.out.println("Seven Wonders of the World");
    }

    void location() {
        System.out.println("Located at:");
    }
}

// 1
class TajMahal extends Wonders {
    void name() {
        System.out.println("Taj Mahal");
    }

    void location() {
        System.out.println("Agra, India");
    }
}

// 2
class GreatWallOfChina extends Wonders {
    void name() {
        System.out.println("Great Wall of China");
    }

    void location() {
        System.out.println("China");
    }
}

// 3
class Petra extends Wonders {
    void name() {
        System.out.println("Petra");
    }

    void location() {
        System.out.println("Jordan");
    }
}

// 4
class ChristTheRedeemer extends Wonders {
    void name() {
        System.out.println("Christ the Redeemer");
    }

    void location() {
        System.out.println("Rio de Janeiro, Brazil");
    }
}

// 5
class MachuPicchu extends Wonders {
    void name() {
        System.out.println("Machu Picchu");
    }

    void location() {
        System.out.println("Peru");
    }
}

// 6
class ChichenItza extends Wonders {
    void name() {
        System.out.println("Chichen Itza");
    }

    void location() {
        System.out.println("Mexico");
    }
}

// 7
class Colosseum extends Wonders {
    void name() {
        System.out.println("Colosseum");
    }

    void location() {
        System.out.println("Rome, Italy");
    }
}

public class WondersMain {
    public static void main(String[] args) {

        Wonders w;

        w = new TajMahal();
        w.name();
        w.location();

        w = new GreatWallOfChina();
        w.name();
        w.location();

        w = new Petra();
        w.name();
        w.location();

        w = new ChristTheRedeemer();
        w.name();
        w.location();

        w = new MachuPicchu();
        w.name();
        w.location();

        w = new ChichenItza();
        w.name();
        w.location();

        w = new Colosseum();
        w.name();
        w.location();
    }
}
