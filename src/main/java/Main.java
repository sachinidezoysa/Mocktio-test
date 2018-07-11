public class Main {

    Service service;

    public Main(Service service) {
        this.service = service;
    }

    public static String concatanate(String... strings) {

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < strings.length; i++) {
            if (i > 0) {
                builder.append(",");
            }
            builder.append(strings[i]);
        }

        return builder.toString();
    }
}
