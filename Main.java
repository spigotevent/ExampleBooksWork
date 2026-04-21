import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            Book[] books = new Book[100];
            books[0] = new Book();
            books[0].author = "У.Е.БанГоголь";
            books[0].title = "Война и мир";
            books[0].info = " 540 стр.";

            int bookcount = 1;

            System.out.println("------Бибилиотека/Library-----");
            for (int i = 0; i < bookcount; i++) {
                System.out.println(books[i].toStr());
            }
            System.out.println("------------------------------ (для помощи используйте .help");

            while (true) {
                System.out.print("> ");
                String input = sc.nextLine();

                if (input.equals(".dev")) {
                    System.out.println("вы успешно вошли в панель разработчика...");
                    System.out.println("введите параметры книги (ФИО;Название;Страницы):");

                    String devops = sc.nextLine();

                    String[] parts = devops.split(";");

                    if (parts.length >= 3) {
                        String author = parts[0].trim();
                        String title = parts[1].trim();
                        String pages = parts[2].trim();


                        books[bookcount] = new Book();
                        books[bookcount].author = author;
                        books[bookcount].title = title;
                        books[bookcount].info = pages + " стр.";

                        bookcount++;

                        System.out.println("книга добавлена");
                    } else {
                        System.out.println("ошибка: неверный формат. используйте: автор(в формате А.А.АААА);Название;Страницы");
                    }

                } else if (input.equals(".list")) {
                    System.out.println("\n------Бибилиотека/Library-----");
                    for (int i = 0; i < bookcount; i++) {
                        System.out.println(books[i].toStr());
                    }
                    System.out.println("------------------------------");

                } else if (input.equals(".exit")) {
                    System.out.println("выход из программы");
                    break;

                } else {
                    System.out.println("программа не знает этой команды...");


                } if (input.equals(".help")) {

                    System.out.println("лист cmd\n.dev -- панель админа (создание книг и тд)\n.list -- лист всех книг (я криворукий по этому бд нету)\n.exit -- выход из программы");




                }
            }

        }

    }
}