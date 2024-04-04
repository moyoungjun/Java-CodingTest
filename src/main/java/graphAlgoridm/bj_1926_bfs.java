package graphAlgoridm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bj_1926_bfs {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int [][]visited = new int[n + 2][m+2];
        int [][]pictureArr = new int[n+2][m+2];

        int[] dx = {1,0,-1,0};
        int[] dy = {0,1,0,-1};

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=m; j++) {
                pictureArr[i][j] = sc.nextInt();
            }
        }
        Queue<Pair> queue = new LinkedList<>();

        int count = 0; //그림의 갯수
        int maxSize = 0;
int c =1;
        for(int i=0; i<= n; i++) {
            for(int j=0; j<=m; j++) {
                if(pictureArr[i][j] == 1 && visited[i][j] == 0) {// 시작좌표가 그림이고 방문하지 않앗을 때
                    int size = 0; //그림의 크기

                    queue.add(new Pair(i, j)); //큐에 삽입
                    visited[i][j] = 1; //방문 완료 갱신

                    while(!queue.isEmpty()) { //위에 삽입했던 큐가 비어있지 않을 때 까지 or 방문하지 않은 크키가 1인 점.
                        Pair pair = queue.remove();
                        System.out.println("한번씩 아니냐?" + c);
                        c++;
                        for(int d=0; d < 4; d++) { //좌표 우상좌하 순
                            int tmpX = pair.X + dx[d];
                            int tmpY = pair.Y + dy[d];

                            if(pictureArr[tmpX][tmpY] == 1 && visited[tmpX][tmpY] ==0) {
                                queue.add(new Pair(tmpX, tmpY));
                            }
                        }
                        size++;  // 해당 그림의 크기 갱신
                        visited[pair.X][pair.Y] = 1;  // 방문 완료 갱신
                    }
                    count++;
                    if(size > maxSize) maxSize = size;
                }
            }
        }
        System.out.println(count + "\n" + maxSize);
    }
}

class Pair {
    int X;
    int Y;

    Pair(int x, int y) {
        this.X = x;
        this.Y = y;
    }
}
