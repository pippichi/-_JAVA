public class Judge{
	private int temp;
	private int[] afterArray1 = new int[3];
	private int[] afterArray2 = new int[3];
	private String message;
	public Judge(){

	}
	public void compare(Player player1,Player player2){
		for(int i=0;i<afterArray1.length;i++){
			afterArray1[i] = (player1.getArray())[i];	
		}
		for(int i=0;i<afterArray2.length;i++){
			afterArray2[i] = (player2.getArray())[i];	
		}
		if(afterArray1[0]>afterArray2[0]){
			player1.setWin();
			player2.setLose();
			message = (player1.getName()+"  Win!");
		}
		else if(afterArray1[0]<afterArray2[0]){
			player2.setWin();
			player1.setLose();
			message = (player2.getName()+"  Win!");
		}
		else{
			if(afterArray1[1]>afterArray2[1]){
				player1.setWin();
				player2.setLose();
				message = (player1.getName()+"  Win!");
			}
			else if(afterArray1[1]<afterArray2[1]){
				player2.setWin();
				player1.setLose();
				message = (player2.getName()+"  Win!");
			}
			else{
				if(afterArray1[2]>afterArray2[2]){
					player1.setWin();
					player2.setLose();
					message = (player1.getName()+"  Win!");
				}
				if(afterArray1[2]<afterArray2[2]){
					player2.setWin();
					player1.setLose();
					message = (player2.getName()+"  Win!");
				}
				else{
					message = ("´òÆ½ÁË£¡£¡");
				}
			}
		}
	}
	public String getSituation(){
		return message;
	}
}