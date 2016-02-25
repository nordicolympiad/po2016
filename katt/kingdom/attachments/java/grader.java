import java.io.*;
import java.util.*;

public class grader {


	public static void main(String... args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter w = new PrintWriter(new BufferedOutputStream(System.out));
		String[] np = r.readLine().split(" ");
		int N = Integer.parseInt(np[0]),
				P = Integer.parseInt(np[1]);

		int[] C = new int[N],
			F = new int[N - 1],
			T = new int[N - 1];

		String[]
			partsC = r.readLine().split(" "),
						 partsF = r.readLine().split(" "),
						 partsT = r.readLine().split(" ");

		for (int i = 0; i < N; ++i) {
			C[i] = Integer.parseInt(partsC[i]);
		}
		for (int i = 0; i < N - 1; ++i) {
			F[i] = Integer.parseInt(partsF[i]);
			T[i] = Integer.parseInt(partsT[i]);
		}
		w.println(kingdom.division(N, P, C, F, T));
		w.println(lib.parts.size());
		for (lib.Part p : lib.parts) {
			w.print(p.R.length);
			for (int i = 0; i < p.R.length; i++) {
				w.print(" ");
				w.print(p.R[i]);
			}
			w.println();
		}

		w.close();
	}

	public static class lib {

		private static class Part {
			int[] R;

			public Part(int[] R) {
				this.R = R;
			}
		}

		private static List<Part> parts = new ArrayList<Part>();
		public static void part(int[] R) {
			parts.add(new Part(R));
		}

	}

}
