import entities.*;

public class Main {
    public static void main(String[] args) {
        Book harryPotter = new Book("Harry Potter", "J. K Rowling", 2000, 200, "Rocco");
        Book bible = new Book("Biblia Sagrada", "Sociedade Biblica do Brasil", 2018, 100,"SBB" );
        Book percyJackson = new Book("Percy Jackson", "Rick Riordan", 2014, 340,"Intrinseca");
        Dvd spiderman = new Dvd("Homem Aranha", "Sam Raimi", "Ficção",120);
        Dvd hobbit = new Dvd("O Hobbit", "Peter Jackson", "Fantasia", 169);
        Dvd tropaDeElite = new Dvd("Tropa de Elite","José Padilha","Ação",115);
        Magazine baar = new Magazine("Toda Forma de Amor","Josephine Le Tutor","BAAR",112);
        Magazine vogue = new Magazine("Rebel", "Anonimo", "Vogue", 990);
        Magazine recreio = new Magazine("Cade ?", "Anonimo", "Revista Recreio", 2);
        User eduardo = new User("Eduardo Marçal", "edumsfilho347@gmail.com", "Rua 7");
        User samuel = new User("Samuel", "julia@gmail.com", "Rua 90");
        User fernanda = new User("Fernanda", "fernanda@gmail.com", "Rua 34");

        //usuarios pegando e devolvendo itens, a cada ação é mostrado no terminal a lista de itens emprestados do usuario
        eduardo.borrowItem(harryPotter);
        eduardo.borrowItem(spiderman);
        eduardo.borrowItem(recreio);
        eduardo.returnItem(recreio);
        eduardo.returnItem(spiderman);
        samuel.borrowItem(bible);
        samuel.borrowItem(tropaDeElite);
        samuel.borrowItem(baar);

        //será mostrado no terminal que o item não está disponivel
        samuel.borrowItem(harryPotter);

        samuel.returnItem(baar);
        samuel.returnItem(tropaDeElite);
        fernanda.borrowItem(hobbit);
        fernanda.borrowItem(percyJackson);
        fernanda.borrowItem(vogue);
        fernanda.returnItem(hobbit);
        fernanda.returnItem(percyJackson);

    }
}