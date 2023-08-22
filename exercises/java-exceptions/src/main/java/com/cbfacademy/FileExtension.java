package com.cbfacademy;

public class FileExtension extends CustomException {
    
    public FileExtension(String message) {
        super(message);
        }
    private int check( String fileName) throws CustomException {
        
        if (fileName == null || fileName.isEmpty ()) {
            throw new CustomException("File name cannot be null or empty.");
       
        } else if (fileName.endsWith(".java")){
            return 1;
       
        } else {
            return 0;
        }
    }
}
