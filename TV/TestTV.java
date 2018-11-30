public class TestTV{
	public static void main(String[] args){
		TV tv1=new TV();
		tv1.turnOn();
		tv1.setChannel(31);
		tv1.setVolume(4);
		
		TV tv2=new TV();
		tv2.turnOn();
		tv2.channelUp();
		tv2.channelUp();
		tv2.volumeLevelUp();
		
		System.out.println("tv1's channel is "+tv1.channel+"\ntv1's volume level is "+tv1.volumeLevel);
		System.out.println("tv2's channel is "+tv2.channel+"\ntv2's volume level is "+tv2.volumeLevel);
		}
	}