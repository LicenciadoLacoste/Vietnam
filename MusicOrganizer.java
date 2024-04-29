import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
        
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<>();
    }
    
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        int index = 0;
        boolean found = false;
        while (!found && index < files.size()){
            String filename1 = files.get(index);
            if(filename1.equals(filename)){
                System.out.println("no se puede repetir");
                found = true;
            }else{
                index++;
            }
        }
        if(!found){
                files.add(filename);
            }
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        assert index >= 0 && index < files.size() ;
        String filename = files.get(index);
        System.out.println(filename);
        
    }
    
    public void listAllFiles()
    {
        int index = 0;
        while(index < files.size()) {
            String filename = files.get(index);
            System.out.println(filename);
            index += 1;
        }
    }
    
    public void searchFile(String search)
    {
        int index = 0;
        boolean found = false;
        while(index < files.size() && !found) {
            String filename = files.get(index);
            if(filename.equals(search)){
                found = true;
                System.out.println("se encontro la busqueda " + search);
            }
            else{
                index++;
            }
        }
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(String file)
    {
        int index = 0;
        boolean found = false;
        while(!found && index < files.size()) {
            String fileName = files.get(index);
            if(fileName.equals(file)){
                found = true;
                files.remove(index);
            }else{
                index++;
            }
        }
        if(!found){
            System.out.println("file no encontrada");
        }
    }
}
