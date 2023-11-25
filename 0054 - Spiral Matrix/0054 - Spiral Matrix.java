class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int topRow = 0;
        int leftCol = 0;
        int bottomRow = matrix.length-1;
        int rightCol = matrix[0].length-1;
        int count = 0;
        int total = matrix.length * matrix[0].length;
        ArrayList<Integer> list = new ArrayList<>();
        int dir = 0;
        while(count < total){
            if(dir == 0){
            for(int i=leftCol;i<=rightCol;i++){
                list.add(matrix[topRow][i]);
                count++;
            }
                topRow++;
            }
            else if(dir == 1){
            for(int i=topRow;i<=bottomRow;i++){
                list.add(matrix[i][rightCol]);
                count++;
            }
            rightCol--;
            }else if(dir == 2){
            for(int i=rightCol;i>=leftCol;i--){
                count++;
                list.add(matrix[bottomRow][i]);
            }
            bottomRow--;
            }else if(dir == 3){
            for(int i=bottomRow;i>=topRow;i--){
               count++;
                list.add(matrix[i][leftCol]);
            }
            leftCol++;
            }
            dir = (dir+1)%4;
        }
        System.out.println(list);
        
        return list;
    }
}

