public class Main {
    public static void main(String[] args) {
        //Работа со String
        String str1;
        String str2;
        str1 = "My name is ";
        str2 = "Daryna";
        System.out.println(str1.length());
        System.out.println(str1.concat(str2));

        int b;
        double c;

        c = 20.7;
        b = (int) c;

        System.out.println(b);
        // явное приведение типов
        b = 15;
        c = b;
        System.out.println(c);
        //  неявное приведение типов
//        byte y = 100+29;
//        byte a = 100;
//        byte d = 29;
//
//        System.out.println(y);
        //  Переполнение типа
//        Если делать переполнение типа с байтом, Джава не выводит ответ в консоль.
        // byte [-128; 127]
        int f = 2000000000 + 1000000000;
        int k = 2000000000;
        int m = 1000000000;
        System.out.println(f);

         // Показать работу с методами и классами
        int a = 4;
        int g = 7;
        Flowers.Amount();
        Flowers.AmountWithArg(4,7);
        Flowers.Roses();
        Flowers.RosesCount(4,7);
        Flowers.BouquetOfFlowers();
        Flowers.ManyFlowers(4,7);
        System.out.println(Flowers.Roses());
        System.out.println(Flowers.RosesCount(4,7));
        System.out.println(Flowers.BouquetOfFlowers());
        System.out.println(Flowers.ManyFlowers(4,7));
    }


}
