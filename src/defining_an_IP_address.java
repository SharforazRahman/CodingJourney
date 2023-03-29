public class defining_an_IP_address {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        char[] ch = address.toCharArray();
        StringBuilder store = new StringBuilder();
        for (char c : ch) {
            if (c == '.') {
                store.append("[.]");
            } else {
                store.append(c);
            }
        }
        System.out.println(store);
    }
}
