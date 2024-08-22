import edu.sena.senaviwer.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static List<Movie> movies = new ArrayList<>();
    static List<Serie> series = new ArrayList<>();
    static List<Book> books = new ArrayList<>();
    static List<Magazine> magazines = new ArrayList<>();
    static List<Chapter> chapters = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

    int option = -1;

    while (option != 0){
        showMainMenu();
        option = scanner.nextInt();

        switch (option){
            case 1:
                manageMovies();
                break;
            case 2:
                manageSeries();
                break;
            case 3:
                manageBook();
                break;
            case 4:
                manageMagazine();
                break;
            case 5:
                manageChapter();
                break;
            case 6:
                break;
            case 7:
                break;
            case 0:
                System.out.println("Saliste de la aplicacion");
                break;
            default:
                System.out.println("La opcion que ingresaste es invalida");
                break;
        }
    }
    scanner.close();

    }

    static void showMainMenu(){
        System.out.println("Main Menu:");
        System.out.println("1. Movies");
        System.out.println("2. Series");
        System.out.println("3. Books");
        System.out.println("4. Magazines");
        System.out.println("5. Chapter");
        System.out.println("6. Report");
        System.out.println("7. Report Today");
        System.out.println("0. Exit");
        System.out.print("Select an option: ");
    }

    static void manageMovies(){
        System.out.println("Movie");
        System.out.println("1. Agregar pelicula");
        System.out.println("2. Ver peliculas");
        System.out.println("Seleciona una opcion");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                addMovie();
                break;
            case 2:
                viewMovies();
                break;
            default:
                System.out.println("Invalid option.");
                break;
        }
    }
    private static void addMovie() {
        System.out.print("Ingresar el titulo de la pelicula: ");
        String title = scanner.nextLine();
        title = scanner.nextLine();

        System.out.print("Ingresa: el genero de la pelicula: ");
        String genre = scanner.nextLine();

        System.out.print("Ingresar el creador de la pelicula: ");
        String creator = scanner.nextLine();

        System.out.print("Ingresa la duracion en minutos: ");
        int duration = scanner.nextInt();

        System.out.print("Año de la pelicula: ");
        int year = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        // Crear una nueva instancia de Movie
        Movie movie = new Movie(title, genre, creator, duration, (short) year);

        // Agregar la película a la lista
        movies.add(movie);
        System.out.println("Pelicula añadida!!!!");
    }

    private static void viewMovies() {
        if (movies.isEmpty()) {
            System.out.println("Peliculas no encontradas.");
        } else {
            for (Movie movie : movies) {
                System.out.println("ID: " + movie.getId());
                System.out.println("Titulo: " + movie.getTitle());
                System.out.println("Genero: " + movie.getGenre());
                System.out.println("Creador: " + movie.getCreator());
                System.out.println("Duracion: " + movie.getDuration() + " minutos");
                System.out.println("Año: " + movie.getYear());
                System.out.println("Visto: " + (movie.isViewed() ? "Si" : "No"));
                System.out.println("Tiempo Visto: " + movie.getTimeViewed() + " minutos");
                System.out.println("----------------------");
            }
        }
    }

    static void manageSeries(){
        System.out.println("Serie");
        System.out.println("1. Agregar Serie");
        System.out.println("2. Ver series");
        System.out.println("Seleciona una opcion");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                addSerie();
                break;
            case 2:
                viewSerie();
                break;
            default:
                System.out.println("Invalid option.");
                break;
        }
    }

    private static void addSerie() {
        System.out.print("Ingresar el titulo de la serie: ");
        String title = scanner.nextLine();
        title = scanner.nextLine();

        System.out.print("Ingresa: el genero de la Serie: ");
        String genre = scanner.nextLine();


        System.out.print("Ingresa la duracion en minutos: ");
        int duration = scanner.nextInt();


        // Crear una nueva instancia de Movie
        Serie serie = new Serie(title, genre, duration);

        // Agregar la película a la lista
        series.add(serie);
        System.out.println("Serie añadida!!!!");
    }

    private static void viewSerie() {
        if (series.isEmpty()) {
            System.out.println("Series no encontradas.");
    } else {
            for (Serie serie : series) {
                System.out.println("ID: " + serie.getId());
                System.out.println("Titulo: " + serie.getTitle());
                System.out.println("Genero: " + serie.getGenre());
                System.out.println("Duracion: " + serie.getDuration() + " minutos");
                System.out.println("Visto: " + (serie.getViewed() ? "Si" : "No"));
                System.out.println("Tiempo Visto: " + serie.getTimeViewed() + " minutos");
                System.out.println("----------------------");
            }
        }
    }

    static void manageBook(){
        System.out.println("Libro");
        System.out.println("1. Agregar libro");
        System.out.println("2. Ver libros");
        System.out.println("Seleciona una opcion");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                addBook();
                break;
            case 2:
                viewBooks();
                break;
            default:
                System.out.println("Invalid option.");
                break;
        }
    }

    private static void addBook() {
        System.out.print("Ingresar el titulo del libro: ");
        String title = scanner.nextLine();
        title = scanner.nextLine();

        System.out.print("Ingresa: fecha del editorial del libro: ");
        String editorialDate;
        editorialDate = scanner.next();

        System.out.print("Ingresar el editorial del libro: ");
        String editorial = scanner.nextLine();
        editorial = scanner.nextLine();

        System.out.print("Ingresa El isbn del libro: ");
        String isbn = scanner.nextLine();

        // Crear una nueva instancia de Movie
        Book book = new Book(title, editorialDate, editorial, isbn);

        // Agregar la película a la lista
        books.add(book);
        System.out.println("Libro añadida!!!!");
    }

    private static void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("Libros no encontrados no encontradas.");
        } else {
            for (Book book : books) {
                System.out.println("ID: " + book.getId());
                System.out.println("Titulo: " + book.getTitle());
                System.out.println("Fecha de editorial: " + book.getEditorialDate());
                System.out.println("Nombre editoral: " + book.getEditorial() );
                System.out.println("ISBN: " + book.getIsbn() );
                System.out.println("Visto: " + (book.getViewed() ? "Si" : "No"));
                System.out.println("----------------------");
            }
        }
    }

    static void manageMagazine(){
        System.out.println("Revistas");
        System.out.println("1. Agregar Revista");
        System.out.println("2. Ver Revistas");
        System.out.println("Seleciona una opcion");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                addMagzine();
                break;
            case 2:
                viewMagazine();
                break;
            default:
                System.out.println("Invalid option.");
                break;
        }
    }

    private static void addMagzine() {
        System.out.print("Ingresar el titulo de la Revistas: ");
        String title = scanner.nextLine();
        title = scanner.nextLine();

        System.out.print("Ingresa fecha del editorial de la revista: ");
        String editorialDate;
        editorialDate = scanner.next();

        System.out.print("Ingresar el editorial del libro: ");
        String editorial = scanner.nextLine();
        editorial = scanner.nextLine();

        // Crear una nueva instancia de Movie
        Magazine magazine = new Magazine(title, editorialDate, editorial);

        // Agregar la película a la lista
        magazines.add(magazine);
        System.out.println("Revista añadida!!!!");
    }

    private static void viewMagazine() {
        if (magazines.isEmpty()) {
            System.out.println("Revistas no encontrados no encontradas.");
        } else {
            for (Magazine magazine : magazines) {
                System.out.println("ID: " + magazine.getId());
                System.out.println("Titulo: " + magazine.getTitle());
                System.out.println("Fecha de editorial: " + magazine.getEditorialDate());
                System.out.println("Nombre editoral: " + magazine.getEditorial() );
                System.out.println("Visto: " + (magazine.getRead() ? "Si" : "No"));
                System.out.println("----------------------");
            }
        }
    }

    static void manageChapter(){
        System.out.println("Chapter");
        System.out.println("1. Agregar Capitulo");
        System.out.println("2. Ver Capitulo");
        System.out.println("Seleciona una opcion");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                addChapeter();
                break;
            case 2:
                viewChapter();
                break;
            default:
                System.out.println("Invalid option.");
                break;
        }
    }

    private static void addChapeter() {
        System.out.print("Ingresar el titulo del capitulo: ");
        String title = scanner.nextLine();
        title = scanner.nextLine();

        System.out.print("Ingresa la duracion en minutos: ");
        int duration = scanner.nextInt();

        System.out.print("Año del capitulo: ");
        int year = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingresar si se vio la capitulo: ");
        boolean viewed = scanner.nextBoolean();

        System.out.println("Ingres la cantidad de tiempo visto en minutos");
        int timeViwed = scanner.nextInt();

        System.out.println("Ingrese la temporada del capitulo");
        int sessionNumber = scanner.nextInt();

        // Crear una nueva instancia de Movie
        Chapter chapter = new Chapter(title, duration, year);

        // Agregar la película a la lista
        chapters.add(chapter);
        System.out.println("Pelicula añadida!!!!");
    }

    private static void viewChapter() {
        if (chapters.isEmpty()) {
            System.out.println("Peliculas no encontradas.");
        } else {
            for (Chapter chapter : chapters) {
                System.out.println("ID: " + chapter.getId());
                System.out.println("Titulo: " + chapter.getTitle());
                System.out.println("Duracion: " + chapter.getDuration() + " minutos");
                System.out.println("Año: " + chapter.getYear());
                System.out.println("Visto: " + (chapter.viewed() ? "Si" : "No"));
                System.out.println("Tiempo Visto: " + chapter.getTimeViewed() + " minutos");
                System.out.println("----------------------");
            }
        }
    }

}