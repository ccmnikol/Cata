//import static jdk.internal.joptsimple.internal.Strings.repeat;

public class Loader
{
    public static void main(String[] args)
    {
        Cat tessa = new Cat();

        System.out.println("Вес Тессы: " + tessa.getWeight());
        tessa.meow();
        System.out.println("Вес Тессы: " + tessa.getWeight());
        System.out.println(tessa.getStatus());
 tessa.feed(15.0);
 System.out.println("Вес Тессы: " + tessa.getWeight());
        System.out.println(tessa.getStatus());
        tessa.poop();
        System.out.println(tessa.getStatus());


        System.out.println("--------------------------------------------------------");

        Cat ainurKadirov = new Cat();
        System.out.println("Вес Айнура Кадирова: " + ainurKadirov.getWeight());
        ainurKadirov.meow();
        System.out.println("Вес Айнура Кадирова: " + ainurKadirov.getWeight());

        for (int tryingMeow = 0 ; tryingMeow < 5000; tryingMeow++) {
            ainurKadirov.meow();
        }
        System.out.println(ainurKadirov.getStatus());


        System.out.println("--------------------------------------------------------");

        Cat sashaPetrin = new Cat();
        System.out.println("Вес Петрина Санька: " + sashaPetrin.getWeight());
        sashaPetrin.feed(1000.1);
        System.out.println(sashaPetrin.getWeight());
        System.out.println(sashaPetrin.getStatus());
        sashaPetrin.drink(5000.5);
        System.out.println(sashaPetrin.getWeight());
        sashaPetrin.feed(1000.1);
        System.out.println(sashaPetrin.getStatus());
    }
}