public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourofDay){
        if (!barking){
            return false;
        }
        if(hourofDay >= 0 && hourofDay < 8 || hourofDay == 23){
            return true;
        }else return false;
    }
}
