package practice.basic;


public class Test {
    public static void main(String[] args) {
        boolean check = 'c' > 'b';
        System.out.println(check);

       //  Scanner sc = new Scanner(System.in);
       //  int[][] arr = new int[3][3];
       //  for (int i = 0; i < 3; i++) {
       //      for (int j = 0; j < 3; j++) {
       //          arr[i][j] = sc.nextInt();
       //      }
       //  }
       // for (int[] row: arr){
       //     for (int item: row){
       //         System.out.println(item + " ");
       //     }
       // }
       //
       //
       //  System.out.println(fun(95));
       int[][] matrix = {
           {1, 2, 3},
           {4, 5, 6},
           {7, 8, 9}
       };
    //    System.out.println(Arrays.toString(serachIn2D(matrix, 8)));
       
    }
    static int fun(int n){
        if (n > 100){
            return n - 10;
        }
        else {
            return fun(fun(n + 11));
        }
    }

    static int[] serachIn2D(int[][] matrix, int target){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if (matrix[i][j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
