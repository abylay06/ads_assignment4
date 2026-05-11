Name: Abylay Altynbassov

Group: SE-2514

A. Project Overview/B. Class description.

• Graph is made up of array of linked lists taht stores class vertex. So the index of the array is one vertex and its adjacednt vertices
are added to the linked lists of those indexes

• Vertex is one node that stores value such as integer. Edge is a class that stores source and dest which are 2 vertices that the edge connects.

• BFS is search algorithm where the nodes in a graph are searched level by level, whereas DFS is where nodes of the graph are searched with depth first,
so it will go deep until and goes back and so on.


C. Algorithm Descriptions

BFS is when each node is places in the queue and they are processed one after another. Nodes of the first level go to the queue first, so they go out first, then
we look at the nodes of the next layers and so on layer by layer.

DFS is when we take one node and recursively go to its adjacent vertex until none left and we backtrack and explore other ways, so we go as deep as possible, then
go back and go as deep again until all vertices are reached.

• Use cases: BFS can be used to find shortest path or closes hospital around. DFS can be used to try out permutations or find cycles.

• Time complexity: For both the time coplexity is O(V + N) where V is the nubmer of vertices and E is the nubmer of edges. This is becasue for both, we consider

all the vertices once and we go through the list of adjacent vertices. All vertices + all the edges that come from all vertices = V + E.

D. Experimental Results

• Execution time comparison table:

<img width="1101" height="824" alt="Screenshot 2026-05-10 224916" src="https://github.com/user-attachments/assets/db293694-252a-482a-93a3-0009ff33deca" />

Observations and patterns:

* As graph size gets larger, BFS and DFS times are longer because more vertices and edges have to be considered.
  
• In my experiments, BFS was consistently faster because for DFS everytime I had to go back the stack revisit the adjacent list for vertices again.

• If the graph is more connected it will be easy for DFS to traved deeply because adjacent vertices will be easily found. For BFS, this means that each node
enquues many more nodes too. However, as results show, more edges take more time to traverse as shown by higher time for undirected graphs.

• BFS is preferred over DFS when you have to consider levels or find the closes place or shortest path.

• DFS can be bad because it can give longer path even if shortest exists, it can cause stack overflow if used with recursion and there are too many recursions.

E. Screenshots

• Graph structure

<img width="1918" height="1079" alt="Screenshot 2026-05-11 211809" src="https://github.com/user-attachments/assets/c1cecec6-f823-4889-9937-39205d6b9997" />

* bfs, dfs traversals
* 
  <img width="1908" height="1079" alt="Screenshot 2026-05-11 211816" src="https://github.com/user-attachments/assets/0dd1309d-5367-4438-bf9d-b03789a33c93" />




F. Reflection Section

1–2 paragraphs discussing:

• I learned that graphs can be traversed in different ways depending on what is the goal. For example, if levels are important then bfs is the choice, but if
the deepest path or search for specific element is important then dfs is better. I had difficulty implementing dfs and bfs but especially dfs because I 
implemented using iteration not recursion so I had to figure it out which was difficult. Also nanotime didn't work well and first experiment traversals gave
long time because compiler was warming up so I had to fix it using warm up runs to give more consistent times.
