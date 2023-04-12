package test;

public class ShopService {

    private ShopService() {
    }

    private static ShopService shopService = new ShopService();

    static ShopService getInstance() {
        return shopService;
    }
}
