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
        Loan emprestimo1 = new Loan(eduardo, harryPotter);
        Loan emprestimo2 = new Loan(eduardo, spiderman);
        Loan emprestimo3 = new Loan(eduardo, recreio);
        emprestimo3.returnItem();
        emprestimo2.returnItem();

        Loan emprestimo4 = new Loan(samuel, bible);
        Loan emprestimo5 = new Loan(samuel, tropaDeElite);
        Loan emprestimo6 = new Loan(samuel, baar);

        //será exibido no terminal que o item não está disponivel
        Loan emprestimo7 = new Loan(samuel, harryPotter);

        emprestimo6.returnItem();
        emprestimo5.returnItem();

        Loan emprestimo8 = new Loan(fernanda, hobbit);
        Loan emprestimo9 = new Loan(fernanda, percyJackson);
        Loan emprestimo10 = new Loan(fernanda, vogue);
        emprestimo8.returnItem();
        emprestimo9.returnItem();

    }
}