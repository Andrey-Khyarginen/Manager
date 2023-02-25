import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ProductRepositoryTest {
    @Test
    public void removeById(){
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);
        Book book1 = new Book(1, "Моя весна", 200, "Александр Шубкин");
        Book book2 = new Book(2, "Моя осень", 400, "Николай Бубкин");
        Smartphone smartphone1 = new Smartphone(3, "аsa", 10000, "samsung");
        repo.add(book1);
        repo.add(book2);
        repo.add(smartphone1);
        repo.removeById(3);
        Product[] actual = repo.findAll();
        Product[] expected = {book1, book2};
        Assertions.assertArrayEquals(expected, actual);
    }

}