class Matrices
{
    int rows;
    int cols;
    Complex_nums [][] data;

    public Matrices (int rows, int cols)
    {
        this.rows = rows;
        this.cols = cols;
        this.data = new Complex_nums[rows][cols];
    }

    public Matrices add (Matrices second)
    {
        if (this.rows != second.rows || this.cols != second.cols)
        {
            throw new IllegalArgumentException("Matrices should have the same size to complete the addition");
        }
        Matrices res = new Matrices (rows, cols);
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                res.data[i][j] = this.data[i][j].add(second.data[i][j]);
            }
        }
        return res;
    }

    public Matrices multiply (Matrices second)
    {
        if (this.cols != second.rows)
        {
            throw new IllegalArgumentException("");
        }
        Matrices res = new Matrices(this.rows, second.cols);
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                Complex_nums sum = new Complex_nums(0,0);
                for (int k = 0; k < this.cols; k++)
                {
                    sum = sum.add(this.data[i][k].multiply(second.data[k][j]));
                }
                res.data[i][j] = sum;
            }
        }
        return res;
    }

    public Matrices transpose()
    {
        Matrices res = new Matrices(this.cols, this.rows);
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                res.data[j][i] = this.data[i][j];
            }
        }
        return res;
    }

    public double determt()
    {

    }

    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}
