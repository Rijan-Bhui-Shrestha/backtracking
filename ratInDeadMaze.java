package lib.backtracking;

public class ratInDeadMaze {
    public static void print(int sc,int sr,int ec,int er,int[][] arr,String s){
        if(sc<0 || sr<0) return;
        if(sc>ec || sr>er) return;
        if(sc==ec && sr==er){
            System.out.println(s);
            return;
        }
        if(arr[sc][sr]==0) return;
        if(arr[sc][sr]==-1) return;
        arr[sc][sr]=-1;
        //go right
        print(sc+1, sr, ec, er, arr,s+"R");
        //go down
        print(sc, sr+1, ec, er, arr, s+"D");
        //go left
        print(sc-1, sr, ec, er, arr, s+"L");
        //go up
        print(sc, sr-1, ec, er, arr, s+"U");
        arr[sc][sr]=1;
    }
    public static void main(String[] args) {
        int i=3;
        int j=3;
        int arr[][]={{1,0,1},
                     {1,1,1},
                     {0,0,1}};
        print(0,0,i-1,j-1,arr,"");
    }
}
