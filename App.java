public class App {
    public static void main(String[] args) {
        // Static Polymorphism
        Hero hero = new Hero();
        hero.move();
        hero.move("west");
        
        Enemy enemy = new Enemy();
        enemy.move();
        enemy.move(3);
        
        // Dynamic Polymorphism
        Character character1 = new Hero();
        character1.move();
        
        Character character2 = new Enemy();
        character2.move();
        
        Character character3 = new Witch();
        character3.move();
        
        Character character4 = new Fighter();
        Witch witch = new Witch();
        character4 = (Character) witch; // Cast witch to Fighter
        character4 = (Fighter) character4;
        character4.move();
    
    }
}
