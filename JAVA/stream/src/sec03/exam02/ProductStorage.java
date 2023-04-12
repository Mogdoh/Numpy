package sec03.exam02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductStorage {
    private List<Product> lsit = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    private int counter;

    public void showMenu() {
        while (true) {
            System.out.println("------------------------");
            System.out.println("1. 등록 | 2. 목록| 3. 종료");
            System.out.println("------------------------");

            System.out.println("선택: ");
            String selectNo = scanner.nextLine();

            switch (selectNo) {
                case "1": registerProduct(); break;
                case "2": showProduct(); break;
                case "3": return;
            }
        }
    }

    public void registerProduct() {
        try {
            Product product = new Product();
            product.setPno(++counter);

            System.out.print("상품명: ");
            product.setName(scanner.nextLine());

            System.out.println("가격: ");
            product.setPrice(Integer.parseInt(scanner.nextLine()));

            System.out.println("재고: ");
            product.setStock(Integer.parseInt((scanner.nextLine())));

            lsit.add(product);
        } catch (Exception e) {
            System.out.println("등록 에러: " + e.getMessage());
        }
    }

    public void showProduct() {
        for (Product p:lsit
             ) {
            System.out.println(String.format("%s\t%s\t%s\t%s", p.getPno(), p.getName(), p.getPrice(), p.getStock()));
        }
    }
}
