import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    static File directoryToSearch=new File("/home/sowmyg");
    static String[] files =directoryToSearch.list();
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        boolean repeat=true;
        while(repeat)
        {
            System.out.println("Enter extension of files for searching");
            String extension=scan.next();
            ArrayList<String>paths=returnPaths(extension);
            if(paths.size()==0)
            {
                System.out.println("No such files found! Please enter again");
            }
            else
            {
                System.out.println("Files found!");
                for(int i=0;i<paths.size();i++)
                {
                    System.out.println(paths.get(i));
                }
                repeat=false;
            }

        }

    }
    public static ArrayList<String> returnPaths(String extension)
    {
        ArrayList<String>paths=new ArrayList<String>();
        for(int i=0;i<files.length;i++)
        {
            File currentFile= new File(files[i]);
            String filename=files[i];
            if(filename.endsWith(extension))
            {
                paths.add("filename is "+filename+" and the path : "+currentFile.getAbsolutePath());
            }
        }
        return paths;
    }

}
