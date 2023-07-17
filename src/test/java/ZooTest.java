import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ZooTest {
   private Zoo zoo;

    @BeforeEach
    public void setUp(){
        zoo = new Zoo();
    }

    @Test
    public void canCountAnimals(){
        zoo.countAnimals();

        assertThat(zoo.countAnimals()).isEqualTo(0);
    }

    @Test
    public void canAddAnimal(){
        Animal animal = new Lion("Simba",true);

        zoo.addAnimal(animal);

        assertThat(zoo.countAnimals()).isEqualTo(1);
    }

    @Test
    public void canAddMultipleAnimals(){
        // the polymorphism animal object having different forms as shown below

        Animal lion = new Lion("Simba", true);  // Animal is lion here
        Animal parrot = new Parrot("Zazu"); // Animal is parrot

        zoo.addAnimal(lion);
        zoo.addAnimal(parrot);

        assertThat(zoo.countAnimals()).isEqualTo(2);
    }
}
