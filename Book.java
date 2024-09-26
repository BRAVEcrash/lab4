import java.util.ArrayList;
import java.util.Scanner;

public class Book {
    String title;
    int score;

    ArrayList<Book> BookList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public Book(String title,int score){
        this.title = title;
        this.score = score;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public int getScore(){
        return score;
    }
    public void setScore(int score){
        this.score=score;
    }

    @Override
    public String toString() { // 3
        return String.format("Book [title= %s, score= %d]", title, score);
        // return "Book [title=" + title + ", score=" + score + "]";
    }
    public void displayBooks(){
        System.out.println("등록된 책 갯수: " + BookList.size() +"권");
        for(Book book : BookList){
            System.out.println(book);
        }
    }

    public void registerBook(){ // 1
        System.out.println("책 제목: ");
        String title = scanner.nextLine();
        if(!BookList.contains(title)){
            System.out.println("책 평점: ");
            int score = scanner.nextInt();
            Book newBook = new Book(title, score);
            BookList.add(newBook);
        } else return;
    }
    public void searchBook(){ // 3
        System.out.println("책 제목: ");
        String searchTerm = scanner.nextLine();
        int count = 0;
        for(Book book : BookList){
            if (book.getTitle().indexOf(searchTerm) != -1) {
                System.out.println(book);
                count++;
                System.out.println("검색된 책 갯수: " + count + "권");
            }

        }
    }

    public void total(){
        System.out.println("---(문제4-1)---");
        while(true){
            System.out.println("1. 책 등록");
            System.out.println("2. 책 검색");
            System.out.println("3. 모든 책 출력");
            System.out.println("4. 종료");
            System.out.print("메뉴를 선택하시오: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 : registerBook();
                    break;
                case 2 : searchBook();
                    break;
                case 3 : displayBooks();
                    break;
                case 4 :
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 선택입니다. 다시 시도하십시오.");
                    break;
            }
        }
    }
}
