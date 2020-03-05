import java.util.*;

public class Utility {

    public static char readMenuSelection(){
        char c='0';
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                c = scanner.next().charAt(0);
                if (c - '0' < 1 || c - '0' > 4)
                    throw new Exception("请输入1-4之间的字符:");
                break;
            } catch (InputMismatchException e) {
                System.err.println("请输入字符:");
            } catch (Exception e) {
                e.getMessage();
                e.printStackTrace();
            }
        }
        return c;
    }

    public static int readNumber(){
        int i=0;
        while(true) {
            try {
                Scanner scanner = new Scanner(System.in);
                i = scanner.nextInt();
                if (i > 9999)
                    throw new Exception("请输入不超过4位长度的整数:");
                break;
            } catch (InputMismatchException e) {
                System.err.println("请输入整型数据:");
            } catch (Exception e) {
                e.getMessage();
                e.printStackTrace();
            }
        }
        return i;
    }

    public static String readString(){
        String str = "";
        while(true) {
            try {
                Scanner scanner = new Scanner(System.in);
                str = scanner.next();
                if (str.length() > 8)
                    throw new Exception("请输入不超过8位长度的字符串:");
                break;
            } catch (InputMismatchException e) {
                System.err.println("请输入字符串:");
            } catch (Exception e) {
                e.getMessage();
                e.printStackTrace();
            }
        }
        return str;
    }

    public static char readConfirmSelection(){
        char c;
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                c = scanner.next().charAt(0);
                if (c!='Y' && c!='N')
                    throw new Exception("请输入Y or N:");
                break;
            } catch (InputMismatchException e) {
                System.err.println("请输入字符:");
            } catch (Exception e) {
                e.getMessage();
                e.printStackTrace();
            }
        }
        return c;
    }

    public static void main(String[] args) {

    }
}
