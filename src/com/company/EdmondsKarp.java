package com.company;

    import java.util.ArrayList;
    import java.util.Queue;
    import java.util.Vector;

/**
 * Created by david.guerrero & daniel.pouman on 1/11/14.
 */
public class EdmondsKarp {

    bool busca_cami(Graph G, Vector<int> cami, int idi, int idf, int &flux)
        //pre: G és un graph correcte i cami està inicialment buit
        //post: es retorna el vector v amb un camí possible de G
    Queue<int> q = new Queue<int>();
    flux = 0;
    int fluxactual = 0;
    cami[0] = idi;
    int cont = 1;
    q.enqueue(idi);

    while (!q.isEmpty()) {
        int idnodeant = q.dequeue();
        int idnode;
        for (int w : G.num_adj(idnodeant)) {
            idnode = G.idnodeseguent(idnodeant);
            if (G.capacitat(idnodeant, idnode) > fluxactual) {
                fluxactual = G.capacitatmax();
                cami[cont] = G.idnode();
                q.enqueue(cami[cont]);
            }
            else q.enqueue(G.idnode());
        }
        fluxactual = 0;
    }
}
