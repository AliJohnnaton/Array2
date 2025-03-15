public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        firstTask();
        System.out.println("\nЗадание 2");
        secondTask();
        System.out.println("\nЗадание 3");
        thirdTask();
        System.out.println("\nЗадание 4");
        fourthTask();
    }

    public static void firstTask() {
        int[] pays = {10000, 12000, 11000, 5000, 24000};
        int sum = 0;
        for (int i : pays)
            sum += i;
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void secondTask() {
        int[] pays = {10000, 12000, 11000, 5000, 24000};
        int min = pays[0];
        int max = pays[0];
        for (int i = 0; i < pays.length; i++) {
            if (pays[i] < min)
                min = pays[i];
            if (pays[i] > max)
                max = pays[i];
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min
                + " рублей. Максимальная сумма трат за неделю составила " + max + " рублей");
    }

    public static void thirdTask() {
        int[] pays = {10000, 12000, 11000, 5000, 24000};
        int sum = 0;
        for (int i : pays)
            sum += i;
        float midSum = (float) sum / pays.length;
        System.out.println("Средняя сумма трат за месяц составила " + midSum + " рублей");
    }

    public static void fourthTask() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int midCount = 0;
        if (reverseFullName.length % 2 == 0)
            midCount = reverseFullName.length / 2;
        else
            midCount = (reverseFullName.length / 2) + 1;
        for (int i = 0; i < midCount; i++) {
            char tmp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - (1 + i)];
            reverseFullName[reverseFullName.length - (1 + i)] = tmp;
        }
        for (char i : reverseFullName)
            System.out.print(i);
    }
}