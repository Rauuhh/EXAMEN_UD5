package org.example.Redes;

public class RedSocial {

    static void main() {
        Usuario user1 = new Usuario("Raul",20,"@Rauletto",12063);
        user1.mostrarInfo();

        Influencer influ1 = new Influencer("Cristiano Ronaldo",37,"@cr7",6500000);
        influ1.anyadirColaboracion("UEFA");
        influ1.anyadirColaboracion("Mercadona");

        influ1.mostrarInfo();

        Streamer str1 = new Streamer("Ibai",27,"@ibaiLlanos",100000,47,980);
        str1.mostrarInfo();

        Basico basic1 = new Basico("Jorge",21,"@gordito",18);
        basic1.mostrarInfo();
    }
}
