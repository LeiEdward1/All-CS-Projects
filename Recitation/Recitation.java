public class Recitation{
    public static void main(String[]args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int [][] aaa = multiTable(a,b);
        for(int i = 0;i<aaa.length;i++){
            for(int j = 0;i<aaa.length;j++){
                System.out.println(aaa[i][j]);
            }
        }
    }
public static int[][] multiTable(int r, int c)
{
    int [][] yes = new int[r][c];
    for (int row = 1; row <= yes.length ; row++)
    {
        for (int column = 1; column <= yes[row].length; column++)
        {
            yes[row][column] = (row)*(column);
        }

    }
    return yes;
}
}