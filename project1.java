import java.util.*;

class Board{
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    char matrix[][];
    public Board(int size){
        this.size=size;
        matrix=new char[size][size];
    } 
    public static void Print(){
        int sz=this.size;
        for(int i=0;i<sz;i++){
            for(int j=0;j<sz;j++){
                System.out.print(matrix[i][j]+" ");
            }
        }
    }
}


public static void main(String[] args) {
    
}