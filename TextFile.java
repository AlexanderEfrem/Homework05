package OOP.Task01.bean;

import java.io.IOException;
import java.nio.file.Path;

public class TextFile extends File {


    public TextFile(String pathname) {
        super(pathname);
    }

    public TextFile(String parent, String child) {
        super(parent, child);
    }

    public TextFile(java.io.File parent, String child) {
        super(parent, child);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public boolean canRead() {
        return super.canRead();
    }

    @Override
    public boolean canWrite() {
        return super.canWrite();
    }

    @Override
    public boolean exists() {
        return super.exists();
    }

    @Override
    public boolean createNewFile() throws IOException {
        return super.createNewFile();
    }

    @Override
    public boolean delete() {
        return super.delete();
    }

    @Override
    public boolean renameTo(java.io.File dest) {
        return super.renameTo(dest);
    }

    @Override
    public int compareTo(java.io.File pathname) {
        return super.compareTo(pathname);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public Path toPath() {
        return super.toPath();
    }


}