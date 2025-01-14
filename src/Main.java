import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; ++i) {
            System.out.print(i + " ");
        }

        // printPath(3, 3, "");
        // System.out.println(printPath1(3, 3, ""));

    } 

    static void printPath(int r, int c, String path){
        if ( r == 1 && c == 1){
            System.out.println(path);
            return;
        }
        if (r > 1){
            printPath(r -1, c, path + "D");
        }
        if (c > 1){
            printPath(r, c -1, path + "R");
        }
        // make the two recursion call for right and down
//       if (r > 1 && c > 1){
//           printPath(r - 1, c, path + "D");
//           printPath(r, c - 1, path + "R");
//       }
    }

    static ArrayList<String> printPath1(int r, int c, String path){
        if ( r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(path);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();

        if ( r > 1){
            // we can go only in right
            ans.addAll(printPath1(r - 1, c , path + "D"));
        }
        if (c > 1){
            // we can only go in down
            ans.addAll(printPath1(r , c - 1, path + "R"));
        }
        // make the two recursion call for right and down

        return ans;
    }
}