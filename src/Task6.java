public class Task6 {

    // Метод бізнес-логіки
    public static int octStringToInt(String s) {
        if (s == null) {
            throw new NullPointerException("Рядок не може бути null");
        }

        if (s.isEmpty()) {
            throw new IllegalArgumentException("Рядок не може бути порожнім");
        }

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c < '0' || c > '7') {
                throw new IllegalArgumentException("Некоректний символ '" + c + "' у вісімковому числі");
            }

            result = result * 8 + (c - '0');
        }

        return result;
    }

    // Метод для тестування
    public static void main(String[] args) {
        String[] tests = {"777", "10", "0", "hello", "89", "", null};

        try {
            System.out.println("Вхід: " + tests[0] + " -> результат: " + octStringToInt(tests[0]));
        } catch (Exception e) {
            System.out.println("Вхід: " + tests[0] + " -> Помилка: " + e.getMessage());
        }
        try {
            System.out.println("Вхід: " + tests[1] + " -> результат: " + octStringToInt(tests[1]));
        } catch (Exception e) {
            System.out.println("Вхід: " + tests[1] + " -> Помилка: " + e.getMessage());
        }
        try {
            System.out.println("Вхід: " + tests[2] + " -> результат: " + octStringToInt(tests[2]));
        } catch (Exception e) {
            System.out.println("Вхід: " + tests[2] + " -> Помилка: " + e.getMessage());
        }
        try {
            System.out.println("Вхід: " + tests[3] + " -> результат: " + octStringToInt(tests[3]));
        } catch (Exception e) {
            System.out.println("Вхід: " + tests[3] + " -> Помилка: " + e.getMessage());
        }
        try {
            System.out.println("Вхід: " + tests[4] + " -> результат: " + octStringToInt(tests[4]));
        } catch (Exception e) {
            System.out.println("Вхід: " + tests[4] + " -> Помилка: " + e.getMessage());
        }
        try {
            System.out.println("Вхід: " + tests[5] + " -> результат: " + octStringToInt(tests[5]));
        } catch (Exception e) {
            System.out.println("Вхід: " + tests[5] + " -> Помилка: " + e.getMessage());
        }
    }
}
