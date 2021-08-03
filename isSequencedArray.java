public class Test {
	public static void main(String[] args) {
        System.out.println(isSequencedArray(new int [] {1, 2, 3, 4, 5},1,5));
        System.out.println(isSequencedArray(new int [] {1, 3, 3, 2, 5},1,5));
        System.out.println(isSequencedArray(new int [] {-5, -5, -4, -4, -4, -3, -3, -2, -2, -2},-5,-2));
        System.out.println(isSequencedArray(new int [] {0, 1, 2, 3, 4, 5},1,5));
        System.out.println(isSequencedArray(new int [] {1, 2, 3, 4},1,5));
        System.out.println(isSequencedArray(new int [] {1, 2, 5},1,5));
        System.out.println(isSequencedArray(new int [] {5, 4, 3, 2, 1},1,5));
        System.out.println(isSequencedArray(new int [] {1, 2 ,2, 2, 2, 3},1,3));
	}

	static int isSequencedArray(int[] a, int m, int n) {
        if (a.length <= 1 || a[0] != m || a[a.length - 1] != n || m > n)
            return 0;

        for (int i = m; i <= n; i++) {
            boolean flag = false;

            for (int j = 1; j <= a.length - 1; j++) {
                if (a[j - 1] > a[j]) {
                    return 0;
                }

                if (a[j - 1] == i || a[j] == i) {
                    flag = true;
                    break;
                }
            }
            if (!flag)
                return 0;
        }

        return 1;
    }
}