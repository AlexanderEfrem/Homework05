package OOP.Task01.bean;

import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.file.Path;

public class File extends java.io.File {
    public File(String pathname) {
        super(pathname);
    }

    public File(String parent, String child) {
        super(parent, child);
    }

    public File(java.io.File parent, String child) {
        super(parent, child);
    }

    public File(URI uri) {
        super(uri);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getParent() {
        return super.getParent();
    }

    @Override
    public java.io.File getParentFile() {
        return super.getParentFile();
    }

    @Override
    public String getPath() {
        return super.getPath();
    }

    @Override
    public boolean isAbsolute() {
        return super.isAbsolute();
    }

    @Override
    public String getAbsolutePath() {
        return super.getAbsolutePath();
    }

    @Override
    public java.io.File getAbsoluteFile() {
        return super.getAbsoluteFile();
    }

    @Override
    public String getCanonicalPath() throws IOException {
        return super.getCanonicalPath();
    }

    @Override
    public java.io.File getCanonicalFile() throws IOException {
        return super.getCanonicalFile();
    }

    @Override
    public URL toURL() throws MalformedURLException {
        return super.toURL();
    }

    @Override
    public URI toURI() {
        return super.toURI();
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
    public boolean isDirectory() {
        return super.isDirectory();
    }

    @Override
    public boolean isFile() {
        return super.isFile();
    }

    @Override
    public boolean isHidden() {
        return super.isHidden();
    }

    @Override
    public long lastModified() {
        return super.lastModified();
    }

    @Override
    public long length() {
        return super.length();
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
    public void deleteOnExit() {
        super.deleteOnExit();
    }

    @Override
    public String[] list() {
        return super.list();
    }

    @Override
    public String[] list(FilenameFilter filter) {
        return super.list(filter);
    }

    @Override
    public java.io.File[] listFiles() {
        return super.listFiles();
    }

    @Override
    public java.io.File[] listFiles(FilenameFilter filter) {
        return super.listFiles(filter);
    }

    @Override
    public java.io.File[] listFiles(FileFilter filter) {
        return super.listFiles(filter);
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
    public boolean setLastModified(long time) {
        return super.setLastModified(time);
    }

    @Override
    public boolean setReadOnly() {
        return super.setReadOnly();
    }

    @Override
    public boolean setWritable(boolean writable, boolean ownerOnly) {
        return super.setWritable(writable, ownerOnly);
    }

    @Override
    public boolean setWritable(boolean writable) {
        return super.setWritable(writable);
    }

    @Override
    public boolean setReadable(boolean readable, boolean ownerOnly) {
        return super.setReadable(readable, ownerOnly);
    }

    @Override
    public boolean setReadable(boolean readable) {
        return super.setReadable(readable);
    }

    @Override
    public boolean setExecutable(boolean executable, boolean ownerOnly) {
        return super.setExecutable(executable, ownerOnly);
    }

    @Override
    public boolean setExecutable(boolean executable) {
        return super.setExecutable(executable);
    }

    @Override
    public boolean canExecute() {
        return super.canExecute();
    }

    @Override
    public long getTotalSpace() {
        return super.getTotalSpace();
    }

    @Override
    public long getFreeSpace() {
        return super.getFreeSpace();
    }

    @Override
    public long getUsableSpace() {
        return super.getUsableSpace();
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
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
