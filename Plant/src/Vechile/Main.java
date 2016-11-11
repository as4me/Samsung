	package Vechile;
	
	public class Main {
		//--------------------------------------------------------------------------------------------------------------------------------
		//update
		
	protected  void f(){
	
	
	}
	//--------------------------------------------------------------------------------------------------------------------------------------
		public static void main(String[] args) {
			
			Train train1 = new Train();
			TotalDistance train2 = new TotalDistance();
			train1.message();
			System.out.println("Начальное координата 0");
			train1.Place1();
			System.out.println("Введите скорость и время(ч)");
			train1.Getspeed();
			train1.getTime();
			train1.Getlenght();
			System.out.println("Введите Массу");
			train1.GetMass();
			train1.getTimeToSec();
			//-----------------------------------------------------------------
			//new
			train1.prnt();
			//------------------------------------------------------------------------
			//================================================================================
			Box mybox1 = new Box(10,20,15);
			Box mybox2 = new Box(11,22,33);
			double vol;
			vol = mybox1.volume();
			System.out.println("Обьем1 " + vol);
			vol =mybox2.volume();
			System.out.println("Обьем 2 " + vol);
			
			
			mybox1.setWight(900);
			mybox1.setDepth(300);
			mybox1.setWight(43);
			vol = mybox1.volume();
			System.out.println("Обьем " + vol);
			
			train2.message(); ///////////////////// override
			//============================================= overload
			train1.getx();
			
			
			//-------------------------------------------------
			
			
			
				}
	
	}
