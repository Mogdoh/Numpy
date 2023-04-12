package test01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardService {
    private List<Board> list = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    private int counter;

    public void showMenu() {
        while (true) {
            System.out.println("--------------------------------------------------------------------");
            System.out.println("1. 상품등록 | 2. 상세보기 | 3. 수정하기 | 4. 삭제하기 | 5. 파일저장 | 6.종료");
            System.out.println("--------------------------------------------------------------------");

            System.out.println("선택: ");
            String selectNo = scanner.nextLine();

            switch (selectNo) {
                case "1": registerProduct(); break;
                case "2": showProduct(); break;
                case "3": modify(); break;
                case "4": delete(); break;
                //case "5": fileSave(); break;
                case "6": return;
            }
        }
    }

    public void registerProduct() {
        try {
            Board board = new Board();
            board.setPno(++counter);

            System.out.println("상품명: ");
            board.setName(scanner.nextLine());

            System.out.print("가격: ");
            board.setPrice(Integer.parseInt(scanner.nextLine()));

            System.out.print("재고: ");
            System.out.println(Integer.parseInt(scanner.nextLine()));

            list.add(board);
        } catch (Exception e) {
            System.out.println("등록 에러:" + e.getMessage());
        }
    }

    public void showProduct() {
        for (Board b:list
             ) {
            System.out.println(String.format("%s\t%s\t%s\t%s", b.getPno(), b.getName(), b.getPrice(), b.getStock()));
        }
    }

    public void modify() {
        try {
            System.out.println("수정할 상품의 번호를 입력하세요: ");
            int pno = Integer.parseInt(scanner.nextLine());
            boolean isFound = false;

            for (Board b : list) {
                if (b.getPno() == pno) {
                    System.out.println("수정할 상품의 이름을 입력하세요: ");
                    b.setName(scanner.nextLine());

                    System.out.println("수정할 상품의 가격을 입력하세요: ");
                    b.setPrice(Integer.parseInt(scanner.nextLine()));

                    System.out.println("수정할 상품의 재고를 입력하세요: ");
                    b.setStock(Integer.parseInt(scanner.nextLine()));

                    System.out.println("상품이 수정되었습니다.");
                    isFound = true;
                    break;
                }
            }

            if (!isFound) {
                System.out.println("해당 상품을 찾을 수 없습니다.");
            }
        } catch (Exception e) {
            System.out.println("수정 에러: " + e.getMessage());
        }
    }

    public void delete() {
        try {
            System.out.println("제가할 상품의 번호를 입력해 주세요: ");
            int pno = Integer.parseInt(scanner.nextLine());
            boolean isFound = false;

            for (Board b:list
                 ) {
                if (b.getPno() == pno) {
                    list.remove(board);
                }
            }
        }
    }

}
