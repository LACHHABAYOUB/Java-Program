public class Test {

    public static void main(String[] args) {
        System.out.println(isMartian(new int[]{1, 3}));
        System.out.println(isMartian(new int[]{1, 2, 1, 2, 1, 2, 1, 2, 1}));
        System.out.println(isMartian(new int[]{1, 3, 2}));
        System.out.println(isMartian(new int[]{1, 3, 3, 2, 1}));
        System.out.println(isMartian(new int[]{1, 2, -18, -18, 1, 2}));
        System.out.println(isMartian(new int[]{}));
        System.out.println(isMartian(new int[]{1}));
        System.out.println(isMartian(new int[]{2}));
    }

    static int isMartian(int[] a) {
        int countOf1 = 0;
        int countOf2 = 0;

        for (int i = 0; i < a.length; i++) {
            if (i < a.length - 1 && a[i] == a[i + 1]) {
                return 0;
            }

            if (a[i] == 1)
                countOf1++;

            if (a[i] == 2)
                countOf2++;
        }

        if (countOf1 > countOf2) return 1;
        return 0;
    }
}
