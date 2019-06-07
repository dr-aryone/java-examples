package in.joshuaaust;

public class VarArgsExample {

    public static void multiply(int ...n) {
        int result = 0;
        for (int i=0; i<n.length; i++) {
            if (i==0 && result == 0) {
                result = n[i];
            } else {
                result *= n[i];
            }
        }
        System.out.println(result);
    }

}
