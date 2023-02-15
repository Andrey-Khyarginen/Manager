public class ProductManager {
    private ProductRepository repository;
    public ProductManager(ProductRepository repository) {
        this.repository = repository;
    }

    public Product[] searchBy(String text) {
        Product[] result = new Product[0]; // тут будем хранить подошедшие запросу продукты
        for (Product product: repository.findAll()) {
            if (matches(product, text )) {
                // "добавляем в конец" массива result продукт product

            }
        }
        return result;
    }
    public boolean matches(Product product, String search) {
        if (product.getName().contains(search)) {
            return true;
        } else {
            return false;
        }
    }
}
