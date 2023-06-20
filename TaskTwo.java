public class TaskTwo {
    public static void main(String[] args){
        for (int i = 1; i < 1000; i++) {
            boolean count = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    count = false;
                    break;
                }
            }
            if (count == true && i != 1){
                System.out.println(i);
            }
        }
    }
}    