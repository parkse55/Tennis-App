import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    private final Game game1 = new Game(22, 10, 2021, 13, 30, "xyz", "Jake", "Amy");

    @Test
    void getDate() {
        assertEquals(game1.getDate(), "2021-10-22 13:30");
    }

    @Test
    void setDate() {
    }

    @Test
    void getCourt() {
        assertEquals(game1.getCourt(), "xyz");
    }

    @Test
    void setCourt() {
    }

    @Test
    void getPlayers() {
        assertEquals(game1.getPlayers().get(0), "Jake");
        assertEquals(game1.getPlayers().get(1), "Amy");
    }

    @Test
    void main() {
    }
}