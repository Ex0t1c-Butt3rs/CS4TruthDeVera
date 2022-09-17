class Main {
  public static void main(String[] args) {
    int JizoCost = 750;
    double JizoRecharge = 3.87;
    String JizoTarget = "Black & Angel";

    int CourierCost = 690;
    double CourierRecharge = 6.53;
    String CourierTarget = "Red";

    int CammanCost = 540;
    double CammanRecharge = 3.87;
    String CammanTarget = "Floating";

    boolean St1 = CammanCost>CourierCost;
    double St2 = JizoCost/JizoRecharge;
    boolean St3 = CammanTarget == CourierTarget;

    
    System.out.println("Subject: Kasa Jizo \n Cost: " + JizoCost + " \n Recharge: " + JizoRecharge + " secs \n Effect: x4 dmg \n Target: " + JizoTarget + " \n\n");

    System.out.println("Subject: Courier Cat \n Cost: " + CourierCost + " \n Range: 250 \n Atk Power: 7k; DPS: 3.3k \n Movement Speed: 25 \n Recharge: " + CourierRecharge + " secs \n Health: 15.3k; Knockbacks: 3 times \n Effect: x4 dmg \n Target: " + CourierTarget + " \n\n");
    
    System.out.println("Subject: Cameraman Cat \n Cost: " + CammanCost + " \n Range: 250 \n Atk Power: 6,8k; DPS: 2k \n Movement Speed: 14 \n Recharge: " + CammanRecharge + " secs \n Health: 15.3k; Knockbacks: 3 times\n Effect: x1.8 dmg & 60% dmg reduction \n Target: " + CammanTarget + "\n\n");

    System.out.println("Cameraman Cat is more expensive than Courier Cat: " + St1);
    System.out.println("Kasa Jizo's cash drain per second: " + St2);
    System.out.println("Courier and Cameraman have atleast one common target: " + St3);
  }
}
