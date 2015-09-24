package Chapter_1_Fundamentals.LearningExample;

import StdLibs.StdIn;
import StdLibs.StdOut;

/**
 * Created by Sergei Zarochentsev on 24.09.2015.
 */
public class UF {

    private int[] id;
    private int count;
    
    
    /**
     * Init N nodes with numeric names
     * @param N nodes count
     */
    public UF(int N) {
        count = N;
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    /**
     * Add connection between p and q nodes
     * @param p node
     * @param q node
     */
    public void union(int p, int q) {
        int pRoot = find(p);
        int qRoot = find(q);

        if(pRoot == qRoot)
            return;
        id[pRoot] = qRoot;

        count--;
    }


    /**
     * Returns numeric id of component for node p
     * @param p node
     * @return component id
     */
    public int find(int p) {
        while (p != id[p]) {
            p = id[p];
        }

        return p;
    }

    /**
     * Returns true if p and q be in same component
     * @param p node
     * @param q node
     * @return true if connected
     */
    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    /**
     * Returns count of components
     * @return components count
     */
    public int count() {
        return count;
    }

    public static void main(String[] args) {
        int N = StdIn.readInt();

        UF uf = new UF(N);
        while(true)
        {


            int p = StdIn.readInt();
            if(p == 1488)
                break;

            int q = StdIn.readInt();

            if(uf.connected(p, q))
                continue;
            uf.union(p, q);
        }
        StdOut.println(uf.count + " компонентов");

    }

}
