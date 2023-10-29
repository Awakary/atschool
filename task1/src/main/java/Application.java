public class Application {
    public static void main(String[] args) {
        Kotik cat1 = new Kotik(3, "Oskar", 3, "Mrr");
        Kotik cat2 = new Kotik();
        cat2.setKotik(2,"Murka", 3, "Mur");
        cat1.liveAnotherDay();
        System.out.println("Котика зовут " + cat1.getName()+" и он весит "+cat1.getWeight()+ " кг");
        if (cat1.getMeow() == cat2.getMeow()) {
            System.out.println("Котики мяукают одинаково");
        } else {
            System.out.println("Котики мяукают по-разному");
        }
        System.out.print("Создано "+ Kotik.getCount() + " объекта класса Kotik");
    }
}
