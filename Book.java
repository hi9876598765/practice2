package mypack;
public class Taxi extends Vehicle{
	
		public Taxi(int crewNum){
			this.crewNum = crewNum;
			
		}	
		void showCrewNum(){
			System.out.println("Taxiの乗客は" + crewNum +"名です。");
		}
		void stop(){
			System.out.println("この先で止まります。");
		}
}
