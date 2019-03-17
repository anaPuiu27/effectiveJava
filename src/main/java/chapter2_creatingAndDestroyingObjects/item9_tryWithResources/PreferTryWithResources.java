package chapter2_creatingAndDestroyingObjects.item9_tryWithResources;

import java.io.*;

import static org.springframework.util.StreamUtils.BUFFER_SIZE;

public class PreferTryWithResources {

    public static void main(String[] args) throws IOException {

        tryFinally("path", "path");
        tryWithResource("path", "path");
    }


    static void tryFinally(String src, String dest) throws IOException {

        InputStream in = new FileInputStream(src);

        try {

            OutputStream out = new FileOutputStream(dest);

            try {
                byte[] buf = new byte[BUFFER_SIZE];
                int n;
                while ((n = in.read(buf)) >= 0)
                    out.write(buf, 0, n);
            } finally {
                out.close();
            }
        } finally {
            in.close();
        }
    }

    static void tryWithResource(String src, String dest) throws IOException {

        try (InputStream in = new FileInputStream(src); OutputStream out = new FileOutputStream(dest)) {

            byte[] buf = new byte[BUFFER_SIZE];
            int n;
            while ((n = in.read(buf)) >= 0)
                out.write(buf, 0, n);
        }
    }
}
