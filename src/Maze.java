package Tasks;

public class Maze {

    public static void print(int[][] labirint) {
        for (int i = 0; i < labirint.length; i++) {
            for (int j = 0; j < labirint.length; j++) {
                System.out.printf("%4d", labirint[i][j]);
            }
            System.out.println();
        }
        System.out.println("---------------------------------////////////---------------------");
    }
    public static void fill (int[][] labirint, int a, int b, int inc){
        //print(labirint);
        System.out.println(" increment =  " + inc);
        if (a == 0 | b == 0 | a == 5 | b == 5) {
            return;
            //System.out.println("Went out!");
        }
       int t = 0 ;
       boolean up=false;
       boolean down=false;
       boolean right=false;
       boolean left=false;
       int min = 2000;
       int direction []={labirint[a+1][b],labirint[a][b+1],labirint[a-1][b],labirint[a][b-1]};
       for (int i=0;i<4;i++) {
           if (direction[i]<min) {
               min = direction[i];
           }
       }
       if (min == labirint[a+1][b]) down=true;
       if (min == labirint[a][b+1]) right=true;
       if (min == labirint[a][b-1]) left=true;
       if (min == labirint[a-1][b]) up=true;

      if (down & labirint[a+1][b] >=0){
            labirint[a][b] = inc;
            print(labirint);
            fill(labirint,a+1,b,inc+1);};
        if (right & labirint[a][b+1] >=0){
            labirint[a][b] = inc;
            print(labirint);
            fill(labirint,a,b+1,inc+1);};
        if (up & labirint[a-1][b] >=0){
            labirint[a][b] = inc;
            print(labirint);
            fill(labirint,a-1,b,inc+1);};
        if (left & labirint[a][b-1] >=0) {
            labirint[a][b] = inc;
            print(labirint);
            fill(labirint,a,b-1,inc+1);};
        return;
  /*      if ((labirint[a+1][b] >=0) & (labirint[a+1][b]!=inc) & (labirint[a+1][b]!=-1)){
            labirint[a][b] = inc+1;
            print(labirint);
            fill(labirint,a+1,b,inc+1);};
        if ((labirint[a][b+1] >=0) & (labirint[a][b+1]!=-1)){
            labirint[a][b] = inc+1;
            print(labirint);
            fill(labirint,a,b+1,inc+1);};
        if ((labirint[a-1][b] >=0) & (labirint[a-1][b]!=-1)){
            labirint[a][b] = inc+1;
            print(labirint);
            fill(labirint,a-1,b,inc+1);};
        if ((labirint[a][b-1] >=0) & (labirint[a][b-1]!=-1)){
            labirint[a][b] = inc+1;
            print(labirint);
            fill(labirint,a,b-1,inc+1);};
        return;*/
    }

    public static void main(String[] args) {

        int[][] labirint = {
                {888, 888, 888, 888, 888, 888},
                {888,  0,  1,  0, 888, 888},
                {888,  0, 888, 888, 888, 888},
                {888,  0,  0,  0, 888, 888},
                {888, 888, 888,  0, 888, 888},
                {888, 888, 888,  0, 888, 888}
        };
        System.out.println(labirint[1][2]);
        fill(labirint,1,2,1);
        print(labirint);
        // System.out.println("---------------------------------////////////---------------------");
    }



}
