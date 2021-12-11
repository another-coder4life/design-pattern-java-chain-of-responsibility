public class Main {

    public static void main(String[] args) {
        LoggingChain chain = new LoggingChain();

        chain.process("db");
        chain.process("file");
        chain.process("console");
    }

}
