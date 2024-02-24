package lib.backtracking;

public class ratInMaze4 {

    public static void Print(int sr,int sc,int er,int ec,String s,boolean isVisited[][]){
        if(sr<0 || sc<0) return;
        if(sc>ec || sr>er) return;
        if(isVisited[sr][sc]==true) return;
        if(sc==ec && sr==er){
            System.out.println(s);
            return;
        }
        isVisited[sr][sc]=true;
        //down
        Print(sr+1, sc, er, ec, s+"D", isVisited);
        //right
        Print(sr, sc+1, er, ec, s+"R", isVisited);
        //up
        Print(sr-1, sc, er, ec, s+"U", isVisited);
        //left
        Print(sr, sc-1, er, ec, s+"L", isVisited);
        //backtracking
        isVisited[sr][sc]=false;
    } 
    public static void main(String[] args) {
        int x=3;
        int y=3;
        boolean isVisited[][]=new boolean[x][y];
        Print(0,0,x-1,y-1,"",isVisited);
    }
}
