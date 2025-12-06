public class Task8 {

    public static void main(String[] args) {
        // Приклади перевірок:

        System.out.println(countNumbers("The user wrote 3 comments 4 months ago")); // 2

        System.out.println(countNumbers("koala757677 croco181dile920")); // 0

        System.out.println(countNumbers("abc 001 xyz 42")); // 2

    }

    public static int countNumbers(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            throw new IllegalArgumentException("Речення не може бути нулем або порожнім");
        }

        String[] tokens = sentence.split("\\s+");
        int count = 0;

        for (String token : tokens) {
            if (token.matches("\\d+")) {
                count++;
            }
        }

        return count;
    }
}