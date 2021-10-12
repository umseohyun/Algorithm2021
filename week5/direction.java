import java.io.*;
import java.util.StringTokenizer;

public class direction {

    static int x = 1, y = 1;
    static final char[] moveTypes = {'L', 'R', 'U', 'D'};
    static final int[] dx = {0, 0, -1, 1};
    static final int[] dy = {-1, 1, 0, 0};

    public static void solution() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        char[] plans = new char[st.countTokens()];

        int index = 0;
        while(st.hasMoreTokens()) {
            plans[index++] = st.nextToken().charAt(0);
        }

        int tempX = 0;
        int tempY = 0;
        for (char plan : plans) {
            for (int i = 0; i < moveTypes.length; i++) {
                if (plan == moveTypes[i]) {
                    tempX = x + dx[i];
                    tempY = y + dy[i];
                    break;
                }
            }
            if (tempX < 1 || tempX > 5 || tempY < 1 || tempY > 5 )
                continue;
            x = tempX;
            y = tempY;
        }
        bw.write(x+" "+y);
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}