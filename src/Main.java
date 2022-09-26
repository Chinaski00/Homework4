public class Main {
    public static void main(String[] args) {
        //Задача 1
        int years = 19;
        if (years >= 18){
            System.out.println("Поздраляю с совершенолетием");
        }
        if (years < 18){
            System.out.println("Ты ещё несоверешннолетний, подожди немного");
        }

        //Задача 2
        int age = 50;
        if (age >= 24){
            System.out.println("Ты закончил университет и пора искать работу!");
        }
        if (age >= 18){
            System.out.println("Ты закончил школу и можешь идти в университет.");
        }
        if (age >= 7){
            System.out.println("Ребёнок ходит в школу.");
        }

        // Задача 3
        int vagon = 102;//вместимость одного вагона
        int sidyachie = 60;
        int stoyachine = vagon - sidyachie;//сколько стоячих мест 42
        if (sidyachie <= 60){
            System.out.println("Сидячих мест в вагоне нет.");
        }
        if (stoyachine <= 42){
            System.out.println("Стоячих мест в вагоне нет.");
        }
        if (vagon >= 102){
            System.out.println("Вагон уже полностью забит.");
        }

        //Задачи с else
        //Задача 4
        if (years >= 18){
            System.out.println("Поздравлю с совершеннолетием");
        } else {
            System.out.println("Совершеннолетие ещё не наступило, нужно подождать");
        }

        //Задача 5
        if (age >= 24) {
            System.out.println("Ты закончил университет - пора искать работу.");
        } else if (age >= 18) {
            System.out.println("Ты закончил школу - может поступать в универ.");
        } else if (age >= 7) {
            System.out.println("Ты ходишь в школу.");
        }

        //Задача 6
        if (vagon >= 102) {
            System.out.println("Вагон уже полностью забит.");
        } else if (stoyachine <= 42) {
            System.out.println("Стоячих мест в вагоне нет.");
        } else if (sidyachie <= 60) {
            System.out.println("Сидячих мест в вагоне нет.");
        }

        //Задача 7
        int men = 25;
        if (men >= 2 && men <= 6){
            System.out.println("Если возраст человека равен " + men + ", то ему нужно ходить в десткий сад.");
        } else if (men >= 7 && men <= 18) {
            System.out.println("Если возраст человека равен " + men + ", то ему нужно ходить в школу.");
        } else if (men >= 18 && men <= 24) {
            System.out.println("Если возраст человека равен " + men + ", то ему нужно ходить в универ.");
        } else if (men > 24) {
            System.out.println("Если возраст человека равен " + men + ", то ему нужно на работу.");
        }

        //Задача 8
        int kids = 15;
        if (kids < 5) {
            System.out.println("Ребёнок не может кататься на аттракционе, ему " + kids + " лет.");
        } else if (kids >= 5 && kids < 14) {
            System.out.println("Ребёнку " + kids + " лет, он может кататься только в сопровождении взрослого, а без взрослого нельзя");
        } else if (kids > 14) {
            System.out.println("Ребёнку " + kids + " он может кататься без сопровождения взрослого.");
        }

        //Задача 9
        int one = 1;
        int two = 50;
        int free = 3;
        if (one > two && one > free) {
            System.out.println(one + " - максимальное число.");
        } else if (two > one && two > free) {
            System.out.println(two + " - максимальное число.");
        } else {
            System.out.println(free + " - максимальное число.");
        }
    }
}