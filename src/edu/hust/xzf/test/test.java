package edu.hust.xzf.test;

import java.io.File;
import java.io.IOException;

import static edu.hust.xzf.mutator.Scheduler.compareFilesIgnoringLines;

public class test {
    public static void main(String[] args) throws IOException {
        File file1 = new File("C:\\Users\\xzf\\Desktop\\xcomp.log");
        File file2= new File("C:\\Users\\xzf\\Desktop\\xcomp2.log");
        boolean flag= compareFilesIgnoringLines(file1, file2);
        System.out.printf(String.valueOf(flag));
    }
}
