package lib.backtracking;

public class ratInMaze2{
    public static int Number(int sc,int sr,int er,int ec){
        if(sc>ec || sr>er) return 0;
        else if(sc==ec && sr==er) return 1;
        else{
            //right
            int right=Number(sc+1, sr, er, ec);
            //down
            int down=Number(sc, sr+1, er, ec);
            int total=right+down;
            return total;
        }
    }
    public static void Ways(int sc,int sr,int er,int ec,String s){
        if(sc>ec || sr>er) return;
        if(sc==ec && sr==er){
            System.out.println(s);
            return;
        }
        //down
        Ways(sc, sr+1, er, ec, s+"D");
        //right
        Ways(sc+1, sr, er, ec, s+"R");
    }
    public static void main(String[] args) {
        int x=3;
        int y=3;
        int c=Number(1,1,x,y);
        System.out.println(c);
        Ways(1,1,x,y,"");
    }
    
}