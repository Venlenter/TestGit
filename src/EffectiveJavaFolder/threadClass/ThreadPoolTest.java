package EffectiveJavaFolder.threadClass;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.*;

public class ThreadPoolTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter base directory：");
        String directory = in.nextLine();
        System.out.print("Enter keyword：");
        String keyword = in.nextLine();

        ExecutorService pool = Executors.newCachedThreadPool();
        poolMatchCounter counter = new poolMatchCounter(new File(directory), keyword, pool);
        Future<Integer> result = pool.submit(counter);
        try {
            System.out.print(result.get() + " matching files.");
        } catch (InterruptedException e) {
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        pool.shutdown();
        int largestPoolSize = ((ThreadPoolExecutor) pool).getLargestPoolSize();
        System.out.println("largest pool size=" + largestPoolSize);
    }
}

class poolMatchCounter implements Callable<Integer> {
    private File directory;
    private String keyword;
    private ExecutorService pool;
    private int count;
    public poolMatchCounter(File directory, String keyword, ExecutorService pool) {
        this.directory = directory;
        this.keyword = keyword;
        this.pool = pool;
    }
    @Override
    public Integer call() throws Exception {
        count = 0;
        try {
            File[] files = directory.listFiles();
            List<Future<Integer>> results = new ArrayList<>();
            for (File file : files) {
                if (file.isDirectory()) {
                    poolMatchCounter counter = new poolMatchCounter(file, keyword,pool);
                    Future<Integer> result = pool.submit(counter);
                    results.add(result);
                } else {
                    if (search(file)) {
                        count++;
                    }
                }
            }
            for (Future<Integer> result : results) {
                try {
                    count += result.get();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }
            }
        } catch (InterruptedException e) {

        }
        return count;
    }

    public boolean search(File file) {
        try {
            try (Scanner in = new Scanner(System.in)) {
                boolean found = false;
                while (!found && in.hasNextLine()) {
                    String line = in .nextLine();
                    if (line.contains(keyword)) {
                        found = true;
                    }
                }
                return found;
            }
        } catch (Exception e) {
            return false;
        }

    }
}
