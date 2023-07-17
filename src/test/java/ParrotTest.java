import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ParrotTest {

    private Parrot parrot;

    @BeforeEach
    public void setUp(){
        parrot = new Parrot("Zazu");
    }

    @Test
    public void canMakeNoise(){ // test shows overridden method had a different return.
        assertThat(parrot.makeNoise()).isEqualTo("Squawk!");
    }

    @Test
    public void canEat(){ // test shows the return of the inheritied method is not changed.
        assertThat(parrot.eat()).isEqualTo("Mmm, that was tasty!");
    }

    @Test
    public void canLayEgg(){
        assertThat(parrot.layEgg()).isEqualTo("I laid an egg.");
    }
}
