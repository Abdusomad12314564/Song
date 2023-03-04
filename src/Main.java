import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter("Song.txt");) {

            fileWriter.write("""
                    Author: Мирбек Атабеков                                    
                    Title:  Кечки Бишкек  
                    
                    
                    Text:                                              
                    Кечки Бишкек — мен көргөн тагдырга болдуң себеп
                    Музга айланган көңүлдүн дартына жообуң керек
                    Азыр кайда? Азыр кайда?
                    Айтчы мага?
                    Бакытка балкыган
                    Жан дүйнөм чалкыган — жаным!                                
                    Жалындаган, жараланган жүрөгүмдү
                    Сен аны билбейсиң
                    Сен аны сезбейсиң
                    Сен мендей сүйбөйсүң — жаным!                                
                    Суктанып караганың
                    Көңүлдү баалап аяганың
                    Андагы мамилеңди
                    Мен кимден табаламын?
                    Ой баскан санааларым
                    Оорубас дүйнөм жараладың
                    А балким, жолугуп мен
                    Айткым келет сага баарын                               
                    Кечки Бишкек — унутулгус күндөрдү кылдың белек
                    Ал кездерде айттырбай түшүнүп жүргөн элек
                    Жүргөн элек
                    Азыр кайда? Азыр кайда?
                    Айтчы мага?
                    Бакытка балкыган
                    Жан дүйнөм чалкыган — жаным!
                    Жалындаган, жараланган абалымды
                    Сен аны билбейсиң
                    Сен аны сезбейсиң
                    Сен мендей сүйбөйсүң — жаным!                                
                    Суктанып караганың
                    Көңүлдү баалап аяганың
                    Андагы мамилеңди
                    Мен кимден табаламын?
                    Ой баскан санааларым
                    Оорубас дүйнөм жараладың
                    А балким, жолугуп мен
                    Айткым келет сага баарын
                    """);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        Song song = new Song();
        try (FileReader reader = new FileReader("Song.txt");) {
            Scanner scanner = new Scanner(reader);
            byte a = 0;
            while (scanner.hasNext()) {
                a++;
                if (a <= 1) {
                    song.setAuthor(scanner.nextLine());
                    System.out.println(song.getAuthor());
                }  if (a <= 2) {
                    song.setTitle(scanner.nextLine());
                    System.out.println(song.getTitle());
                }

                    String  str = "";
                    str = scanner.nextLine();
                    song.setText(str);
                System.out.println(song.getText());
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }



    }
}