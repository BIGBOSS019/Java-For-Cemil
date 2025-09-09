package AtHome;

public class Home1 {

    // Базовый класс Герой
    static class Hero {
        String name;
        int health;

        Hero(String name, int health) {
            this.name = name;
            this.health = health;
        }

        void attack() {
            System.out.println(name + " атакует!");
        }
    }

    // Класс Воин
    static class Warrior extends Hero {
        Warrior(String name, int health) {
            super(name, health);
        }

        void heavyAttack() {
            System.out.println(name + " делает мощную атаку!");
        }
    }

    // Класс Маг
    static class Mage extends Hero {
        Mage(String name, int health) {
            super(name, health);
        }

        void castSpell() {
            System.out.println(name + " колдует заклинание!");
        }
    }

    // Класс Лучник
    static class Archer extends Hero {
        Archer(String name, int health) {
            super(name, health);
        }

        void shootArrow() {
            System.out.println(name + " стреляет из лука!");
        }
    }

    // Главная функция main
    public static void main(String[] args) {

        // Создаём героев
        Warrior hero1 = new Warrior("Ниджат", 100);
        Mage hero2 = new Mage("Щахрияр", 80);
        Archer hero3 = new Archer("Джамиль", 90);

        // Обычные атаки
        hero1.attack();
        hero2.attack();
        hero3.attack();

        // Специальные способности
        hero1.heavyAttack();
        hero2.castSpell();
        hero3.shootArrow();
    }
}

