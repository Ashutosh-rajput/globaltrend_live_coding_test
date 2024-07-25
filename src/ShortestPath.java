public class ShortestPath {
    static final int V = 4;
    int mdis(int d[], Boolean set[]){
        int min = Integer.MAX_VALUE, mindex = -1;
        for (int v = 0; v < V; v++)
            if (set[v] == false && d[v] <= min) {
                min = d[v];
                mindex = v;
            }
        return mindex;
    }


    void dijktra(int gra[][], int s)
    {
        int d[] = new int[V];
        Boolean set[] = new Boolean[V];
        for (int i = 0; i < V; i++) {
            d[i] = Integer.MAX_VALUE;
            set[i] = false;
        }
        d[s] = 0;
        for (int count = 0; count < V - 1; count++) {
            int u = mdis(d, set);
            set[u] = true;

            for (int v = 0; v < V; v++)
                if (!set[v] && gra[u][v] != 0 && d[u] != Integer.MAX_VALUE && d[u] + gra[u][v] < d[v])
                    d[v] = d[u] + gra[u][v];
        }

        for (int i = 0; i < V; i++)
            System.out.println(i + " \t\t " + d[i]);


    }

    public static void main(String[] args)
    {
        int gra[][]={
                {0,4,1,0},
                {0,0,0,1},
                {0,2,0,5},
                {0,0,0,0}
        };
        ShortestPath t=new ShortestPath();
        t.dijktra(gra,0);

    }
}