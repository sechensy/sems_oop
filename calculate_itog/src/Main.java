public class Main {
    public static void main(String[] args) {

        Presenter presenter = new Presenter(new UI(), new Model());

        presenter.runOperation();
    }
}