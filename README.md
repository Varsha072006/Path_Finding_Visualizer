# Path_Finding_Visualizer

## Overview

Path Finding Visualizer is an interactive web application that demonstrates how popular pathfinding algorithms work on a grid-based environment. Users can place a start node, a target node, and obstacles, then visualize how different algorithms explore the grid and find a path. The project helps learners understand graph traversal, shortest-path algorithms, and heuristic-based search techniques through real-time animations.

## Features

* Interactive grid visualization
* Custom start and destination nodes
* Obstacle (wall) creation and removal
* Real-time algorithm animation
* Grid reset and clear functionality
* Responsive and user-friendly interface
* Comparison of multiple pathfinding algorithms

## Algorithms Implemented

### Dijkstra's Algorithm

* Finds the shortest path in weighted and unweighted graphs.
* Guarantees the optimal solution.

### A* Search Algorithm

* Uses heuristics to guide the search.
* Faster than Dijkstra's Algorithm in many scenarios.
* Guarantees the shortest path with an admissible heuristic.

### Breadth-First Search (BFS)

* Explores nodes level by level.
* Guarantees the shortest path in unweighted graphs.

### Depth-First Search (DFS)

* Explores as deep as possible before backtracking.
* Does not guarantee the shortest path.
* Useful for understanding graph traversal.

## Technologies Used

* HTML5
* CSS3
* JavaScript / TypeScript
* React.js
* Data Structures:

  * Queue
  * Stack
  * Priority Queue

## Installation

1. Clone the repository:

```bash
git clone https://github.com/your-username/Path_Finding_Visualizer.git
```

2. Navigate to the project directory:

```bash
cd Path_Finding_Visualizer
```

3. Install dependencies:

```bash
npm install
```

4. Start the development server:

```bash
npm start
```

5. Open your browser and visit:

```text
http://localhost:3000
```

## How It Works

1. The grid is represented as a graph where each cell acts as a node.
2. Users place start and target nodes.
3. Walls can be added to create obstacles.
4. The selected algorithm explores the graph.
5. Visited nodes are animated during traversal.
6. The final path is highlighted once found.

## Applications

* Learning graph theory concepts
* Understanding search algorithms
* Robotics navigation
* Game AI pathfinding
* Network routing simulations

## Future Enhancements

* Weighted nodes
* Maze generation algorithms
* Bidirectional search
* Diagonal movement support
* Dark/Light mode
* Mobile optimization


## Contributing

Contributions are welcome. Feel free to fork the repository, create a feature branch, and submit a pull request.

## License
This project is licensed under the MIT License.

## Conclusion

The Path Finding Visualizer provides an interactive and engaging way to understand how different pathfinding algorithms operate and compare their performance. By visualizing the search process in real time, users can observe how algorithms explore nodes, handle obstacles, and determine paths between two points. This project strengthens concepts in graph theory, data structures, and algorithm design while demonstrating practical applications in areas such as navigation systems, robotics, game development, and network routing. Overall, the visualizer serves as an effective educational tool for learning and experimenting with pathfinding techniques.

