package general;

public class TestContext {

    private User user;
    private Flight flight;

    public TestContext() {
        user = new User("test@test.com", "test");
        flight = new Flight();
    }
}
