import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
public class ex4{
    public static byte[] getSHA1(String path) throws Exception{
        MessageDigest complete = MessageDigest.getInstance("SHA-1");
        dfs(path,complete);
        return complete.digest();
    }
    public static void dfs(String path,MessageDigest complete) throws Exception{
        File dir = new File(path);
        File[] fs = dir.listFiles();
        for(int i = 0;i < fs.length;i++){
            if(fs[i].isFile()){
                FileInputStream is= new FileInputStream(fs[i]);
                byte[] buffer = new byte[1024];
                int numRead = 0;
                do{
                    numRead = is.read(buffer);
                    if(numRead > 0){
                        complete.update(buffer,0,numRead);
                    }
                }while(numRead != -1);
                is.close();
            }
            if(fs[i].isDirectory()){
                dfs(path + File.separator + fs[i].getName(),complete);
            }
        }
    }
    public static void main(String[] args) {
        try{
            String path = "test";
            byte[] sha1 = getSHA1(path);
            String result = "";
            for(int i = 0;i < sha1.length;i++){
                result += Integer.toString(sha1[i]&0xFF,16);
            }
            System.out.println(result);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}