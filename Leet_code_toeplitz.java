class Solution{
    public boolean isToeplitzMatrix(matrix){
        bool=true;
	int row=matrix.length;
	int column=matrix[0].length;
        for(int i=0;i<row;i++){
            if (row==0)
	    {
                for(int j=0;j<column;j++){
                    int val=matrix[row][column];
                    int m=row;
                    int n=column;
                    while(m<row-1 and n<column-1){
                        m+=1;
                        n+=1;
        #                print(m,n)
                        if (val==matrix[m][n]){
                            continue;
			    }
                        else{
                            bool=false
			    }
			   }
			  }
        #                    print("Not a toeplitz matrix")
		}            
	    else{
             int j=0;
             int val=matrix[row][j];
             int m=row;
             int n=j;
             while(m<row-1 and n<column-1){
                m+=1;
                n+=1;
                if val==matrix[m][n]{
                    continue;
		    }
                else{
                    bool=false
		    }
		   }
		  }
	}
	return bool;
	}
}
        #            print("not a toeplitz matrix")
        
        