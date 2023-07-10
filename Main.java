
import java.util.ArrayList;
import java.util.List;

public class Main{

    public static void main(String[] args){                
        List<Animal> animals = new ArrayList<Animal>();
            animals.add(new Bird("Кеша","Вовка"));
            animals.add(new Duck("Скрудж","Чарлс"));
            animals.add(new Fish("Йода","Александр"));
            animals.add(new Cat("Персик","Иван"));     
            animals.add(new Turtle("Тартилла","Валентина"));         

        for (Animal a: animals) a.toGo();
            System.out.println();
    
        for (Animal a: animals) a.fly();               
            System.out.println();
        
        for (Animal a: animals) a.swim();
            System.out.println();
    }
}
