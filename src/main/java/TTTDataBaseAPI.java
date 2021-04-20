import java.io.Closeable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TTTDataBaseAPI implements AutoCloseable {
    private final ExecutorService server;

    public TTTDataBaseAPI() {
        this(ThreadCount.FOUR);
    }

    public TTTDataBaseAPI(ThreadCount count) {
        server = Executors.newFixedThreadPool(count.toInt());
    }

    public CompletableFuture<String> getPlayerInfo(String name, String... typeOf) {
    }

    public CompletableFuture<String> getGameInfo(String gameName, String... typeOf) {

    }

    public void playerSignUp(String userName, String password, String firstName, String lastName) {

    }

    public void playerSignUp(String json) {

    }

    public CompletableFuture<Boolean> playerSignIn(String userName, String password) {

    }

    public CompletableFuture<Boolean> deleteAccount(String userName, String password) {

    }

    public void freeThreadPool() {
        try {
            server.shutdown();
        } catch (SecurityException e) {
            e.printStackTrace();
        }
    }

    /**
     * Closes this resource, relinquishing any underlying resources.
     * This method is invoked automatically on objects managed by the
     * {@code try}-with-resources statement.
     *
     * <p>While this interface method is declared to throw {@code
     * Exception}, implementers are <em>strongly</em> encouraged to
     * declare concrete implementations of the {@code close} method to
     * throw more specific exceptions, or to throw no exception at all
     * if the close operation cannot fail.
     *
     * <p> Cases where the close operation may fail require careful
     * attention by implementers. It is strongly advised to relinquish
     * the underlying resources and to internally <em>mark</em> the
     * resource as closed, prior to throwing the exception. The {@code
     * close} method is unlikely to be invoked more than once and so
     * this ensures that the resources are released in a timely manner.
     * Furthermore it reduces problems that could arise when the resource
     * wraps, or is wrapped, by another resource.
     *
     * <p><em>Implementers of this interface are also strongly advised
     * to not have the {@code close} method throw {@link
     * InterruptedException}.</em>
     * <p>
     * This exception interacts with a thread's interrupted status,
     * and runtime misbehavior is likely to occur if an {@code
     * InterruptedException} is {@linkplain Throwable#addSuppressed
     * suppressed}.
     * <p>
     * More generally, if it would cause problems for an
     * exception to be suppressed, the {@code AutoCloseable.close}
     * method should not throw it.
     *
     * <p>Note that unlike the {@link Closeable#close close}
     * method of {@link Closeable}, this {@code close} method
     * is <em>not</em> required to be idempotent.  In other words,
     * calling this {@code close} method more than once may have some
     * visible side effect, unlike {@code Closeable.close} which is
     * required to have no effect if called more than once.
     * <p>
     * However, implementers of this interface are strongly encouraged
     * to make their {@code close} methods idempotent.
     *
     * @throws Exception if this resource cannot be closed
     */
    @Override
    public void close() throws Exception {
        try {
            server.shutdown();
        } catch (SecurityException e) {
            throw new Exception("Something went wrong in -> { TTTDataBaseAPI.class }");
        }
    }

//    public void createTable(String tableName, String json) {
//
//    }
//
//    public CompletableFuture<String> get(String tableName, String column, String... options) {
//
//    }
//
//    public boolean put(String tableName, String json, String column) {
//
//    }
//
//    public void post(String tableName, String json, String column) {
//
//    }
//
//    public void delete(String tableName, String json, String... options) {
//
//    }
}
