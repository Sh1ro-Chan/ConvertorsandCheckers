public class MegaByteConvertor {
    public static void printMegaByteAndKiloByte(int kiloByte){
        if (kiloByte<0){
            System.out.println("Invalid Value");
        }else{
            int megaBytes = Math.round(kiloByte/1024);
            int remainBytes = kiloByte % 1024;
            System.out.println(kiloByte + " KB = " + megaBytes + " MB and " + remainBytes + "KB");
        }
    }
}
