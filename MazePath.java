public class Maze_Path{
    public static void main(String [] args){
        int n = 3; // represents no. of rows
        int m = 3; // represents no. of columns
        PrintPath(n-1, m-1, 0, 0, "");
    }
    /*
    er: end row
    ec: end column
    cr: current row
    cc: current column
    */
    public static void PrintPath(int er, int ec, int cr, int cc, String ans){
        // Base cases
        if(cr == er && cc == ec){
            System.out.print(ans + " ");
            return;
        }
        if(cr>er || cc>ec){
            return;
        }
        PrintPath(er, ec, cr, cc+1, ans + "H");  // current column will increase if we move Horizontally
        PrintPath(er, ec, cr+1, cc, ans + "V");  // current row will increase if we Move Vertically

    }
}
