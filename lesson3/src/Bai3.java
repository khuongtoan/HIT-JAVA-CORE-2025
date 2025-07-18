import java.util.Scanner;

public class Bai3 {
    public static boolean checkStartAndEnd(String s) {
        return s.startsWith("Hello") && s.endsWith("!");
    }

    public static int countWords(String s) {
        String[] words = s.trim().split("\\s+");
        return words.length;
    }

    public static String longestWord(String s) {
        String[] words = s.trim().split("\\s+");
        String longest = "";
        for (String word : words)
            if (word.length() > longest.length()) longest = word;
        return longest;
    }

    public static String replaceA(String s) {
        return s.replace('a', '@').replace('A', '@');
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String s = sc.nextLine();

        System.out.println("Bắt đầu bằng 'Hello' và kết thúc bằng '!': " + checkStartAndEnd(s));
        System.out.println("Số từ: " + countWords(s));
        System.out.println("Từ dài nhất: " + longestWord(s));
        System.out.println("Chuỗi sau khi thay a/A: " + replaceA(s));
    }
}
