import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class ProductManagerTest {
    @Test
    public void add(){
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);
        Book book1 = new Book(1, "Моя весна", 200, "Александр Шубкин");
        Book book2 = new Book(2, "Моя осень", 400, "Николай Бубкин");
        Smartphone smartphone1 = new Smartphone(3, "аsa", 10000, "samsung");
        manager.add(book1);
        manager.add(book2);
        manager.add(smartphone1);
        Product[] actual = repo.findAll();
        Product[] expected = {book1, book2, smartphone1};
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void searchBy(){
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);
        Book book1 = new Book(1, "Моя весна", 200, "Александр Шубкин");
        Book book2 = new Book(2, "Моя осень", 400, "Николай Бубкин");
        Smartphone smartphone1 = new Smartphone(3, "аsa", 10000, "samsung");
        manager.add(book1);
        manager.add(book2);
        manager.add(smartphone1);
        Product[] actual = manager.searchBy("Моя весна");
        Product[] expected = {book1};
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void searchBy2(){
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);
        Book book1 = new Book(1, "Моя весна", 200, "Александр Шубкин");
        Book book2 = new Book(2, "Моя осень", 400, "Николай Бубкин");
        Smartphone smartphone1 = new Smartphone(3, "аsa", 10000, "samsung");
        manager.add(book1);
        manager.add(book2);
        manager.add(smartphone1);
        Product[] actual = manager.searchBy("Моя ");
        Product[] expected = {book1, book2};
        Assertions.assertArrayEquals(expected, actual);
    }


}
