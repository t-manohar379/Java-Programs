package SET;

public class sumofodd {
public static void main(String[] args) {
	int m =19;
	int n =29;
	int sum =0;
	for(int i=m;i<=n;i++) {
		if(i%2!=0)
		sum+=i;
		System.out.println(sum);
	}
}
}
