package various.lambda_test;

    @FunctionalInterface
    public interface Animal {
        void getSound(String input);
        default void getLook(){
            System.out.println("look");
        }
    }

