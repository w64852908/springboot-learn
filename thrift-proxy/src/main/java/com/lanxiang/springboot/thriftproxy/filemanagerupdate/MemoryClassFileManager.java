package com.lanxiang.springboot.thriftproxy.filemanagerupdate;

import java.io.IOException;
import java.util.Map;

import javax.tools.FileObject;
import javax.tools.ForwardingJavaFileManager;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.StandardLocation;

/**
 * Created by lanxiang on 2018/7/30.
 */
public class MemoryClassFileManager extends ForwardingJavaFileManager<StandardJavaFileManager> {

    private Map<String, JavaMemoryClass> destFiles;
    private Map<String, JavaStringSource> srcFiles;

    protected MemClsFileManager(StandardJavaFileManager fileManager, Map<String, JavaMemoryClass> destFiles,
                                Map<String, JavaStringSource> srcFiles) {
        super(fileManager);
        this.destFiles = destFiles;
        this.srcFiles = srcFiles;
    }

    public JavaFileObject getJavaFileForOutput(Location location, String className, JavaFileObject.Kind kind, FileObject sibling)
            throws IOException {
        if (!(JavaFileObject.Kind.CLASS.equals(kind) && StandardLocation.CLASS_OUTPUT.equals(location)))
            return super.getJavaFileForOutput(location,
                    className,
                    kind,
                    sibling);
        if (destFiles.containsKey(className)) {
            return destFiles.get(className);
        } else {
            JavaMemCls file = new JavaMemCls(className);
            this.destFiles.put(className, file);
            return file;
        }
    }

    public void close() throws IOException {
        super.close();
        this.destFiles = null;
    }

    public Iterable<JavaFileObject> list(Location location, String packageName, Set<Kind> kinds, boolean recurse)
            throws IOException {
        List<JavaFileObject> ret = new ArrayList<JavaFileObject>();
        if ((StandardLocation.CLASS_OUTPUT.equals(location) || StandardLocation.CLASS_PATH.equals(location))
                && kinds.contains(Kind.CLASS)) {
            for (Map.Entry<String, JavaMemCls> e : destFiles.entrySet()) {
                String pkgName = resolvePkgName(e.getKey());
                if (recurse) {
                    if (pkgName.contains(packageName)) ret.add(e.getValue());
                } else {
                    if (pkgName.equals(packageName)) ret.add(e.getValue());
                }
            }
        } else if (StandardLocation.SOURCE_PATH.equals(location) && kinds.contains(Kind.SOURCE)) {
            for (Map.Entry<String, JavaStringSource> e : srcFiles.entrySet()) {
                String pkgName = resolvePkgName(e.getKey());
                if (recurse) {
                    if (pkgName.contains(packageName)) ret.add(e.getValue());
                } else {
                    if (pkgName.equals(packageName)) ret.add(e.getValue());
                }
            }
        }
        // 也包含super.list
        Iterable<JavaFileObject> superList = super.list(location, packageName, kinds, recurse);
        if (superList != null) for (JavaFileObject f : superList)
            ret.add(f);
        return ret;
    }

    private String resolvePkgName(String fullQualifiedClsName) {
        return fullQualifiedClsName.substring(0, fullQualifiedClsName.lastIndexOf('.'));
    }

    public String inferBinaryName(Location location, JavaFileObject file) {
        if (file instanceof JavaMemCls) {
            return ((JavaMemCls) file).getClsName();
        } else if (file instanceof JavaStringSource) {
            return ((JavaStringSource) file).getClsName();
        } else {
            return super.inferBinaryName(location, file);
        }
    }

}