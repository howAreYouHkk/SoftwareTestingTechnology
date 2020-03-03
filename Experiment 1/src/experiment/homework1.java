package experiment;

public class homework1 {

	public int check(int a) {
		//返回1说明可以拿出，返回0说明不可以
		if(a>93||a<0) {
			return 0;
		}
		else if(a%5 == 0) {
			return 1;
		}
		else if((a-1)%5==0 ||(a-2)%5==0 ||(a-3)%5==0) {
			return 1;
		}
		else
			return 0;		
	}
}
