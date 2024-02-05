package org.example.lury.service;

import java.io.File;

public class ExcelService {
    /**
     * 删除目录下所有的文件;
     * @param file
     */
    public static boolean deleteExcelPath(File file) {
        String[] files = null;
        if (file != null) {
            files = file.list();
        }
        if (file.isDirectory()) {
            for (int i = 0; i < files.length; i++) {
                boolean bol = deleteExcelPath(new File(file, files[i]));
                if (bol) {
                    System.out.println("删除成功!");
                } else {
                    System.out.println("删除失败!");
                }
            }
        }
        return file.delete();
    }
}
