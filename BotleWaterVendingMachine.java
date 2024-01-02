import java.util.ArrayList;
import java.util.List;

public class BotleWaterVendingMachine implements VendingMachine {

    private List<Product> productList = new ArrayList<>();
    

    @Override
    public void initProduct(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public Product getProduct(String name) {
        for (Product product : productList) {
            if(product.getName().equals(name))
                return product;

        }
        return null;
    }
    
    @Override
    public Product getProduct (String name, double volume) {
        for (Product product : productList) {
            if(product.getName().equals(name) && ((BotleWater) product).getVolume() == volume)
                return product;
        }
        return null;
    }
}
