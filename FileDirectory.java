package OOP.Task01.bean;

import java.nio.file.Path;
import java.util.Objects;

public class FileDirectory extends File {

    public FileDirectory(String pathname) {
        super(pathname);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getAbsolutePath() {
        return super.getAbsolutePath();
    }

    @Override
    public boolean exists() {
        return super.exists();
    }

    @Override
    public boolean isDirectory() {
        return super.isDirectory();
    }

    @Override
    public boolean delete() {
        return super.delete();
    }

    @Override
    public boolean mkdir() {
        return super.mkdir();
    }

    @Override
    public boolean mkdirs() {
        return super.mkdirs();
    }

    @Override
    public boolean renameTo(java.io.File dest) {
        return super.renameTo(dest);
    }

    @Override
    public boolean setReadOnly() {
        return super.setReadOnly();
    }

    @Override
    public boolean setWritable(boolean writable) {
        return super.setWritable(writable);
    }

    @Override
    public boolean setReadable(boolean readable) {
        return super.setReadable(readable);
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

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String[] list() {
        return super.list();
    }
}