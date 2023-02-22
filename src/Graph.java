
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author tramy
 */
public class Graph {

    private static int INFINITY = 99;
    private int[][] matrix = {
        //A  B  C  D  E  F 
        {0, 2, 5, 1, INFINITY, INFINITY},//A
        {2, 0, 3, 2, INFINITY, INFINITY},//B
        {5, 3, 0, 3, 1, 5},//C
        {1, 2, 3, 0, 1, INFINITY},//D
        {INFINITY, INFINITY, 1, 1, 0, 2},//E
        {INFINITY, INFINITY, 5, INFINITY, 2, 0},//F
    };

    /**
     * Tìm đường ngắn nhất từ start tới target Phương thức nhận 2 tham số
     *
     * @param startSymbol đỉnh bắt đầu
     * @param targetSymbol đỉnh
     */
    public void dijkstra(char startSymbol, char targetSymbol) {
        List<Vertex> vertices = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            Vertex vertex = new Vertex(i, i);
            vertex.setDistance(INFINITY);
            vertices.add(vertex);
        }
        Vertex startVertex = vertices.get(Vertex.getColFromSymbol(startSymbol));
        Vertex targetVertex = vertices.get(Vertex.getColFromSymbol(targetSymbol));

        startVertex.setDistance(0);

/*Sử dụng PriorityQueue (hàng đợi FIFO) để duyệt (ưu tiên các đỉnh có khoảng cách ngắn hơn), và tuần tự xét 
các đỉnh hàng xóm của đỉnh được lấy từ queue ra, đỉnh đầu tiên được thêm vào chính là đỉnh bắt đầu.*/

        Queue<Vertex> vertexQueue = new PriorityQueue<>(Comparator.comparing(Vertex::getDistance));
        vertexQueue.add(startVertex);
        while (!vertexQueue.isEmpty()) {
            Vertex current = vertexQueue.poll();
            // xét đỉnh hàng xóm
            for (Vertex neighbor : vertices) {
                int nextWeight = matrix[current.getRow()][neighbor.getCol()];
                // đỉnh hàng xóm tồn tại đường đi và khác đỉnh bắt đầu, tránh trường hợp quay ngược.
                if (neighbor != startVertex && nextWeight != INFINITY) {
                    int distance = nextWeight + current.getDistance();
                    // chưa tồn tại đường đi
                    if (neighbor.getPrev() == null) {
                        neighbor.setDistance(distance);
                        neighbor.setPrev(current);
                        vertexQueue.add(neighbor);
                    } /*PriorityQueue không cập nhật lại thứ tự ưu tiên khi bạn cập nhật giá trị distance. Cho nên lúc ta cập nhật lại đường đi của đỉnh mà đang nằm trong hàng đợi, ta phải xóa và thêm nó lại 1 lần nữa để Queue cập nhật lại thứ tự ưu tiên*/ // đường mới ngắn hơn đường cũ
                    else if (vertexQueue.contains(neighbor) && distance < neighbor.getDistance()) {
                        // lấy con đường mới ngắn hơn
                        neighbor.setDistance(distance);
                        neighbor.setPrev(current);
                        // cập nhật thứ tự ưu tiên
                        vertexQueue.remove(neighbor);
                        vertexQueue.add(neighbor);
                    }
                }
                if (neighbor == targetVertex) {
                    break;
                }
            }

        }
        if (targetVertex.getPrev() == null) {
            System.out.println("KHÔNG TỒN TẠI ĐƯỜNG ĐI TỪ " + startSymbol + " TỚI " + targetSymbol);
        } else {
            System.out.println("ĐƯỜNG ĐI TỪ " + startSymbol + " TỚI " + targetSymbol + " MẤT " + targetVertex.getDistance());
            printPath(startVertex, targetVertex);
        }

    }

    private void printPath(Vertex startVertex, Vertex targetVertex) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.insert(0, " -> " + targetVertex.getSymbol());
        while (targetVertex.getPrev() != null) {
            if (targetVertex == startVertex) {
                break;
            }
            stringBuilder.insert(0, " -> " + targetVertex.getPrev().getSymbol());
            targetVertex = targetVertex.getPrev();
        }
        System.out.println(stringBuilder.toString());
    }
}
