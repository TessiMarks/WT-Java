public class Opdracht9 {
    public static void main(String[] args) {
        Verkoopbaar vk = new Schoenen();
        Deurwaarder d = new Deurwaarder();
        d.incasserenNoodbevel(new Schoenen());
    }
}

public interface Verkoopbaar { // interface: de voorwaarden voor een class
    void verkopen();
    void kopen();
}

class Deurwaarder{
    void incasserenNoodbevel(Verkoopbaar vk){
        vk.verkopen();
    }
}

class Winkel{
    Verkoopbaar inkopendoen(){
        return new Schoenen();
    }
}

class Schoenenwinkel{
    Schoenen aanschafdoen(int dinero){
        return new Schoenen();
    }
}

class Schoenen implements Verkoopbaar{
    public void verkopen() {
        System.out.println("Verkopen in schoenen");
    }
}