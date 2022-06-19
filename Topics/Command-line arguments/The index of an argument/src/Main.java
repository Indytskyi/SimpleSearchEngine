class Problem {
    public static void main(String[] args) {
        int counter = 0;
        int current = -1;
        for (String s: args) {
            if ("test".equals(s)) {
                current = counter;
            }
            counter++;
        }

        System.out.println(current);
    }
}