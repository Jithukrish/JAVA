//add 2 matrix

public class addmat{

    public static void main(String[] args){
        int rows=3,columns=3;
        int[][]mat1={{2, 3, 4}, {5, 2, 3},{4, 6, 7 }};
        int[][]mat2={{-4, 5, 3}, {5, 6, 3},{3, 4, 5 }};

        // Adding Two matrices
        int[][] sum = new int[rows][columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                sum[i][j]=mat1[i][j]+mat2[i][j];
            }
        }

        //  result
        System.out.println("Sum of two matrices : ");
        for(int[]row:sum){
            for(int column:row){
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }
}

/**Sum of two matrices : 
-2    8    7    
10    8    6    
7    10    12 
*/
