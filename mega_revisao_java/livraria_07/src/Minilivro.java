
public class Minilivro extends Livro {
    public Minilivro(String titulo, String isbn, double preco, Autor autor) {
        super(titulo, isbn, preco, autor);
    }

    @Override
    public boolean aplicaDesconto(double porcentagem) {
        return false;
    }
}
