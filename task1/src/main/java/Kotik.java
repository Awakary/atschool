public class Kotik {
    private int weight, hungry, prettiness;
    private String name, meow;
    private static int count = 0;
    private static boolean flag = true;

    public int getPrettiness() {
        return prettiness;
    }
    public String getName() {
        return name;
    }
    public int getWeight() {
        return weight;
    }
    public String getMeow() {
        return name;
    }

    public static int getCount() {
        return count;
    }
    public int getHungry() {
        return hungry;

    }
    public void setKotik(int prettiness, String name, int weight, String meow) {
        this.prettiness = prettiness;
        this.name = name;
        this.weight = weight;
        this.meow = meow;
    }

    public Kotik() {
        count++;
    }

    public Kotik(int prettiness, String name, int weight, String meow) {
        this.prettiness = prettiness;
        this.name = name;
        this.weight = weight;
        this.meow =  meow;
        this.hungry = 0;
        count++;
    }


    public void eat(int food) {
        this.hungry += food;
        flag =true;
    }

    public void eat(int food, String food_name) {
        this.hungry += food;
        flag =true;
    }

    public void eat() {
        int food = 4;
        String food_name = "рыба";
        this.eat(food, food_name);
        flag =true;
    }

    public boolean say_meow() {
        if (this.hungry <= 0) {
            System.out.println("Котик хочет есть");
            flag =false;
        } else {
            System.out.println(meow);
            this.hungry--;
        }
        return flag;
    }

    public boolean play() {
        if (this.hungry <= 0) {
            System.out.println("Котик хочет есть");
            flag =false;
        } else {
            System.out.println("Good play!");
            this.hungry--;
        }
        return flag;
    }

    public boolean jump() {
        if (this.hungry <= 0) {
            System.out.println("Котик хочет есть");
            flag =false;
        } else {
            System.out.println("Прыг!");
            this.hungry--;
        }
        return flag;
    }

    public boolean sleep() {
        if (this.hungry <= 0) {
            System.out.println("Котик хочет есть");
            flag =false;
        } else {
            System.out.println("Zzzzz!");
            this.hungry--;
        }
        return flag;
    }

    public boolean run() {
        if (this.hungry <= 0) {
            System.out.println("Котик хочет есть");
            flag =false;
        } else {
            System.out.println("Uf!");
            this.hungry--;
        }
        return flag;
    }
    public void liveAnotherDay(){
        for (int i = 0; i  < 24; i++) {
            int method = (int) (Math.random() * 5 + 1);
            switch (method) {
                case 1:
                    this.jump();
                    break;
                case 2:
                    this.play();
                    break;
                case 3:
                    this.sleep();
                    break;
                case 4:
                    this.say_meow();
                    break;
                case 5:
                    this.run();
                    break;
            }
                if (!flag) {
                    this.eat(5);
                }
        }
    }
}